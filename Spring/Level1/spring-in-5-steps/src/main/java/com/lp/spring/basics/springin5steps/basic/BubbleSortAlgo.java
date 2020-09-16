package com.lp.spring.basics.springin5steps.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("bubble")
public class BubbleSortAlgo implements SortAlgorithm {
    public int[] sort(int[] numbers) {
        // Logic for bubble sort
        return numbers;
    }
}