package Misc.FunctionalProgramming.src;

import java.util.List;

public class NumberFPRunner {

    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5);
        printWithFP(list);
        printEven(list);
        printOdd(list);
    }

    private static void printWithFP(List<Integer> list) {
        list.stream().forEach(
                number -> System.out.println(number)
        );
    }

    private static void printEven(List<Integer> list) {
        list.stream()
        .filter(
                number -> number % 2 == 0    
        )
        .forEach(
                number -> System.out.println("Even number: " + number)
        );
    }

    private static void printOdd(List<Integer> list) {
        list.stream()
        .filter(
                number -> number % 2 != 0   
        )
        .forEach(
                number -> System.out.println("Odd number: " + number)
        );
    }
}