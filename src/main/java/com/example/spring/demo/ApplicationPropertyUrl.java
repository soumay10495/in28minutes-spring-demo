package com.example.spring.demo;

import com.example.spring.demo.properties.ExternalService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("app.properties")
public class ApplicationPropertyUrl {
    private static Logger LOGGER = LoggerFactory.getLogger(ApplicationPropertyUrl.class);

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(ApplicationPropertyUrl.class, args);

        ExternalService externalService = applicationContext.getBean(ExternalService.class);

        LOGGER.info("URL : {}", externalService.getUrl());
    }
}
