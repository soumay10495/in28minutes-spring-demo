package com.example.spring.demo;

import com.example.spring.demo.xml.XMLPersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationContextXML {
    static private Logger LOGGER = LoggerFactory.getLogger(ApplicationContextXML.class);

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        LOGGER.info("Beans defined -> {}", (Object) applicationContext.getBeanDefinitionNames());

        XMLPersonDAO xmlPersonDAO = applicationContext.getBean(XMLPersonDAO.class);

        LOGGER.info("{}", xmlPersonDAO);
        LOGGER.info("{}", xmlPersonDAO.getXMLJdbcConnection());
    }
}
