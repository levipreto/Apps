package Misc.MathEtc;

public class FactorialNumber {

    public static void main(String[] args) {

        factorial(10);

    }

    private static void factorial(int number) {

        int factorialCalculation = 1;

        for (int i = 1; i <= number; i++) {
            factorialCalculation = factorialCalculation * i;
        }
        System.out.println(factorialCalculation);
    }
}