package com.example.spring.demo.basic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class BinarySearch {
    private Logger logger = LoggerFactory.getLogger(BinarySearch.class);

    @Autowired
    @Qualifier("bubble")
    SortAlgorithm sortAlgorithm;

    //public BinarySearch(SortAlgorithm sortAlgorithm) {
    //  this.sortAlgorithm = sortAlgorithm;
    //}

    public BinarySearch() {
        System.out.println("Binary Search Constructor");
    }

    public int bSearch(int[] array, int number) {
        int arr[] = sortAlgorithm.sort(array);
        return 0;
    }

    @PostConstruct
    public void postConstruct() {
        logger.info("PostConstruct");
    }

    @PreDestroy
    public void preDestroy() {
        logger.info("PreDestroy");
    }
}
