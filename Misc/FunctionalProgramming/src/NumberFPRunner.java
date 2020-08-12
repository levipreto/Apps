package Misc.FunctionalProgramming.src;

import java.util.List;

public class NumberFPRunner {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        printWithFP(numbers);
        printEven(numbers);
        printOdd(numbers);
        printSum(numbers);
        printSumOfOdd(numbers);
        printSumSequence(numbers);
        printSquare(numbers);
    }

    private static void printWithFP(List<Integer> numbers) {
        numbers.stream().forEach(
                number -> System.out.println(number)
        );
    }

    private static void printEven(List<Integer> numbers) {
        numbers.stream()
        .filter(
                number -> number % 2 == 0    
        )
        .forEach(
                number -> System.out.println("Even number: " + number)
        );
    }

    private static void printOdd(List<Integer> numbers) {
        numbers.stream()
        .filter(
                number -> number % 2 != 0   
        )
        .forEach(
                number -> System.out.println("Odd number: " + number)
        );
    }

    private static void printSum(List<Integer> numbers) {
        int sum = 
                numbers.stream()
                        .reduce(
                                0,
                                (number1, number2) -> number1 + number2
                                );
        System.out.println("Sum of numbers is: " + sum);
    }

    private static int printSumSequence(List<Integer> numbers) { 
            return numbers.stream()
                        .reduce(
                                0,
                                (number1, number2) -> {
                                    System.out.println(number1 + " " + number2);
                                    return number1 + number2;
                                }
                            );
    }

    private static void printSumOfOdd(List<Integer> numbers) {
        int sum = 
                numbers.stream()
                        .filter(
                                number -> number % 2 != 0   
                                )
                        .reduce(
                                0,
                                (number1, number2) -> number1 + number2
                                );
        System.out.println("Sum of odd numbers is: " + sum);
    }

    private static void printSquare(List<Integer> numbers) {
                numbers.stream()
                        .distinct()
                        .map(
                            number -> number * number
                            )
                            .forEach(number -> System.out.println(number));
    }

}