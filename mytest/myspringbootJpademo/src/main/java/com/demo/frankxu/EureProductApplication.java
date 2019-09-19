package com.demo.frankxu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages={"com.d8.**.entity"})

public class EureProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(EureProductApplication.class, args);
    }
}
