package com.example.gradleDemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@MapperScan("com.example.gradleDemo.dao")
//@ServletComponentScan
public class GradleDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(GradleDemoApplication.class, args);
    }

}
