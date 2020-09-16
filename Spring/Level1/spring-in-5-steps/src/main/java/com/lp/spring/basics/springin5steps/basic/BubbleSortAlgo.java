package com.lp.spring.basics.springin5steps.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("bubble")
@Primary
public class BubbleSortAlgo implements SortAlgorithm {
    public int[] sort(int[] numbers) {
        // Logic for bubble sort
        return numbers;
    }
}