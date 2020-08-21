package com.lp.spring.basics.springin5steps;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class QuickSortAlgo implements SortAlgorithm {
    public int[] sort(int[] numbers) {
        // Logic for quick sort
        return numbers;
    }
}