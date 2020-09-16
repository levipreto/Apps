package com.lp.spring.basics.springin5steps.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("quick")
public class QuickSortAlgo implements SortAlgorithm {
    public int[] sort(int[] numbers) {
        // Logic for quick sort
        return numbers;
    }
}