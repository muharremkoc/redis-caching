package com.project.springwithredisproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;


@SpringBootApplication
@EnableCaching
public class SpringwithredisprojectApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringwithredisprojectApplication.class, args);
    }

}
