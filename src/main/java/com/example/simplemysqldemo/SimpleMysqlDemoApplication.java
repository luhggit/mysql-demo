package com.example.simplemysqldemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.example.simplemysqldemo.dao")
@SpringBootApplication
public class SimpleMysqlDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SimpleMysqlDemoApplication.class, args);
    }

}
