package Misc.MenuMathOperation;

import java.util.Scanner;
import java.math.BigDecimal;
import java.math.MathContext;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number 1: ");
        BigDecimal number1 = scanner.nextBigDecimal();
        System.out.println("The number you entered is: " + number1);

        System.out.print("Enter Number 2: ");
        BigDecimal number2 = scanner.nextBigDecimal();
        System.out.println("The number you entered is: " + number2);

        System.out.println("Choices available: ");
        System.out.println("1 - Add");
        System.out.println("2 - Subtratc");
        System.out.println("3 - Divide");
        System.out.println("4 - Multiply");

        System.out.println("Enter Operator: ");
        int choice = scanner.nextInt();

        System.out.println("Your choices are:");
        System.out.println("Number 1: " + number1);
        System.out.println("Number 2: " + number2);
        namingOperation(choice);

        // performOperationUsingNestedElse(number1, number2, choice);
        performOperationUsingSwitch(number1, number2, choice);
    }

    private static void namingOperation(int choice) {
        switch (choice) {
            case 1:
                System.out.println("Operation: Addition");
                break;
            case 2:
                System.out.println("Operation: Subtraction");
                break;
            case 3:
                System.out.println("Operation: Division");
                break;
            case 4:
                System.out.println("Operation: Multiplication");
                break;
            default:
                System.out.println("Operation: Invalid operator");
                break;
        }
    }

//    private static void performOperationUsingNestedElse(int number1, int number2, int choice) {
//        if (choice == 1) {
//            System.out.println("Result: " + (number1 + number2));
//        } else if (choice == 2) {
//            System.out.println("Result: " + (number1 - number2));
//        } else if (choice == 3) {
//            System.out.println("Result: " + (number1 / number2));
//        } else if (choice == 4) {
//            System.out.println("Result: " + (number1 * number2));
//        } else {
//            System.out.println("Invalid operation");
//        }
//    }

    private static void performOperationUsingSwitch(BigDecimal number1, BigDecimal number2, int choice) {
        switch (choice) {
            case 1:
                System.out.println("Result: " + (number1.add(number2, MathContext.DECIMAL128)));
                break;
            case 2:
                System.out.println("Result: " + (number1.subtract(number2, MathContext.DECIMAL128)));
                break;
            case 3:
                System.out.println("Result: " + (number1.divide(number2, MathContext.DECIMAL128)));
                break;
            case 4:
                System.out.println("Result: " + (number1.multiply(number2, MathContext.DECIMAL128)));
                break;
            default:
                System.out.println("Invalid operation");
                break;
        }
    }
}