package com.example.spring.demo.basic;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(SpringExtension.class)
//@ContextConfiguration(locations = "/applicationContext.xml")
@ContextConfiguration(locations = "/testContext.xml")
class BinarySearchXMLConfigurationTest {
    @Autowired
    BinarySearch binarySearch;

    @Test
    public void BinarySearchTest() {
        int result = binarySearch.bSearch(new int[]{2, 3, 4}, 4);
        assertEquals(0, result);
    }
}
