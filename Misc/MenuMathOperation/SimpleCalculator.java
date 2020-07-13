package Misc.MenuMathOperation;

import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number1: ");
        int number1 = scanner.nextInt();
        System.out.println("The number you entered is - " + number1);
        
        System.out.print("Enter Number2: ");
        int number2 = scanner.nextInt();
        System.out.println("The number you entered is - " + number2);

        System.out.println("Choises available: ");
        System.out.println("1 - Add");
        System.out.println("2 - Subtratc");
        System.out.println("3 - Divide");
        System.out.println("4 - Multiply");

        System.out.println("Enter Operator: ");
        int choice = scanner.nextInt();

        System.out.println("Your choises are:");
        System.out.println("Number1: " + number1);
        System.out.println("Number2: " + number2);
		System.out.println("Operation: " + choice);

        if(choice == 1){
            System.out.println("Result: " + (number1 + number2));
        } else if(choice == 2){
            System.out.println("Result: " + (number1 - number2));
        } else if(choice == 3){
            System.out.println("Result: " + (number1 / number2));
        } else if(choice == 4){
            System.out.println("Result: " + (number1 * number2));
        } else {
            System.out.println("Invalid operation");
        }
    }
}