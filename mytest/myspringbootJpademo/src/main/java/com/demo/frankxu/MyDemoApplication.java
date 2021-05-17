package com.demo.frankxu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.CommandLineRunner;
import com.demo.frankxu.common.ApplicationContextUtil;

@SpringBootApplication
public class MyDemoApplication {

    public static void main(String[] args) extends ApplicationContextUtil implements CommandLineRunner{
        SpringApplication.run(MyDemoApplication.class, args);
    }
    
    @Override
    public void run(String... args) {

        String[] beans = getApplicationContext().getBeanDefinitionNames();
        
        for (String bean : beans)
        {
            System.out.println(bean + " of Type :: " + getBeanByName(bean).getClass());
        }
    }
}
