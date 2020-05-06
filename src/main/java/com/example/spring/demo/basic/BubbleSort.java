package com.example.spring.demo.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Qualifier("bubble")
@Component
//@Primary
public class BubbleSort implements SortAlgorithm {

    public BubbleSort() {
        System.out.println("BubbleSort Constructor");
    }

    public int[] sort(int array[]) {
        System.out.println("BubbleSort");
        return array;
    }
}
