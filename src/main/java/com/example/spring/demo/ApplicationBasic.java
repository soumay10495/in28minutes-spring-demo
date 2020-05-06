package com.example.spring.demo;

import com.example.spring.demo.basic.BinarySearch;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ApplicationBasic {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(ApplicationBasic.class, args);
        BinarySearch bs = applicationContext.getBean(BinarySearch.class);
        int result = bs.bSearch(new int[]{1, 2, 3}, 3);
        System.out.println("The no. is at position " + result);
    }
}
