package com.example.spring.demo;

import com.example.spring.demo.scope.PersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ApplicationScope {
    private static Logger LOGGER = LoggerFactory.getLogger(ApplicationScope.class);

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(ApplicationScope.class, args);

        PersonDAO personDAO = applicationContext.getBean(PersonDAO.class);
        //System.out.println(personDAO);
        //System.out.println(personDAO.getJdbcConnection());

        PersonDAO personDAO2 = applicationContext.getBean(PersonDAO.class);
        //System.out.println(personDAO2);
        //System.out.println(personDAO2.getJdbcConnection());

        LOGGER.info("{}", personDAO);
        LOGGER.info("{}", personDAO.getJdbcConnection());

        LOGGER.info("{}", personDAO2);
        LOGGER.info("{}", personDAO2.getJdbcConnection());
    }
}
