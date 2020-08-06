package Misc.Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
    
class Sorting {

    static List<Integer> numbers = List.of(123, 12, 3, 45);

    static List<Integer> numbersSorting = new ArrayList<>(numbers);

    public static void main(String[] args) {
        
        System.out.println(numbers);
        Collections.sort(numbersSorting);
        System.out.println(numbersSorting);
    }
}