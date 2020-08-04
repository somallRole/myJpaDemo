package com.demo.frankxu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class MyDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyDemoApplication.class, args);
    }
}
