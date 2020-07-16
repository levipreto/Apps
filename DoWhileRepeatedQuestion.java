import java.util.Scanner;

public class DoWhileRepeatedQuestion {

    public void askQuestion() {
        
        int number1 = -1;
        Scanner input = new Scanner(System.in);

        do {
            if (number1 != -1) {
                System.out.println("Cube is: " + (number1 * number1 * number1));
            }
            System.out.print("Enter number: ");
            number1 = input.nextInt();
        } while (number1 >= 0);

        input.close();

        System.out.println("Thank You! Have Fun!");
    }

}