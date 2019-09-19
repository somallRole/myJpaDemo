package com.demo.frankxu.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * api页面 /swagger-ui.html
 * 如controller在不同的包中，@ComponentScan(basePackages = {"me.aurora.app.rest","..."})
 * @author jie
 * @date 2018-11-23
 */

@EnableSwagger2
@ComponentScan(basePackages = {
        "com.d8.eureproduct.**.controller",})

//注解标示,这是一个配置类,@Configuation注解包含了@Component注解
//可以不用在使用@Component注解标记这是个bean了,
    @Configuration
    public class SwaggerConfig {

        /**
         * 通过 createRestApi函数来构建一个DocketBean
         * 函数名,可以随意命名,喜欢什么命名就什么命名
         */
        @Bean
        public Docket createRestApi() {
            return new Docket(DocumentationType.SWAGGER_2)
                    .apiInfo(apiInfo())//调用apiInfo方法,创建一个ApiInfo实例,里面是展示在文档页面信息内容
                    .select()
                    //控制暴露出去的路径下的实例
                    //如果某个接口不想暴露,可以使用以下注解
                    //@ApiIgnore 这样,该接口就不会暴露在 swagger2 的页面下
                    .paths(PathSelectors.any())
                    .build();
        }
        //构建 api文档的详细信息函数
        private ApiInfo apiInfo() {
            return new ApiInfoBuilder()
                    //页面标题
                    .title("四川数安值科技有限公司接口调试系统")
                    //创建人
                    .contact("Digits8")
                    //版本号
                    .version("1.0")
                    //描述
                    .description("微服务接口 API 文档")
                    .build();
        }
    }