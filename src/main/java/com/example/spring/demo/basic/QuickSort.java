package com.example.spring.demo.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Qualifier("quick")
@Component
public class QuickSort implements SortAlgorithm {
    public QuickSort() {
        System.out.println("QuickSort Constructor");
    }

    public int[] sort(int array[]) {
        System.out.println("QuickSort");
        return array;
    }
}
