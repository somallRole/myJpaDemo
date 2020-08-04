package com.demo.frankxu.config;


import com.demo.frankxu.webserviceclientandservice.service.UserService;
import org.apache.cxf.Bus;
import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.xml.ws.Endpoint;

/**
 * @ClassName:CxfConfig
 * @Description:cxf发布webservice配置
 * @author Maple
 * @date:2018年4月10日下午4:12:24
 */
@Configuration
public class CxfConfig {



    @Autowired
    UserService userService;

    /**
     * 此方法作用是改变项目中服务名的前缀名，此处127.0.0.1或者localhost不能访问时，请使用ipconfig查看本机ip来访问
     * 此方法被注释后:wsdl访问地址为http://127.0.0.1:8080/services/user?wsdl
     * 去掉注释后：wsdl访问地址为：http://127.0.0.1:8080/soap/user?wsdl
     * @return
     */
    @SuppressWarnings("all")
    @Bean
    public ServletRegistrationBean dispatcherServlet() {
        return new ServletRegistrationBean(new CXFServlet(), "/soap/*");
    }

    @Bean(name = Bus.DEFAULT_BUS_ID)
    public SpringBus springBus() {
        return new SpringBus();
    }

    /** JAX-WS
     * 站点服务
     * **/
    @Bean
    public Endpoint endpoint() {
        EndpointImpl endpoint = new EndpointImpl(springBus(), userService);
        endpoint.publish("/user");
        return endpoint;
    }

}

