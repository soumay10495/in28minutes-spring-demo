package com.example.spring.demo;

import com.example.spring.componentscan.ComponentDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.spring.componentscan")
public class ApplicationComponentScan {
    private static Logger LOGGER = LoggerFactory.getLogger(ApplicationComponentScan.class);

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(ApplicationComponentScan.class, args);

        ComponentDAO componentDAO = applicationContext.getBean(ComponentDAO.class);
        LOGGER.info("{}", componentDAO);
        LOGGER.info("{}", componentDAO.getJdbcConnection());
    }
}
