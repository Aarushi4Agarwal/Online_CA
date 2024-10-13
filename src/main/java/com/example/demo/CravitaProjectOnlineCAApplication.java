package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class CravitaProjectOnlineCAApplication extends SpringBootServletInitializer {

    @Override  
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {  
        return application.sources(CravitaProjectOnlineCAApplication.class);  
    }

    public static void main(String[] args) {
        SpringApplication.run(CravitaProjectOnlineCAApplication.class, args);
    }
}
