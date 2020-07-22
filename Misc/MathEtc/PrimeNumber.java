package Misc.MathEtc;

public class PrimeNumber {

    public static void main(String[] args) {

        int i;
        int maxCheck = 100; // limit to check
        boolean isPrime = true;

        // Empty String
        String primeNumbersFound = "";

        // Start loop 1 to maxCheck
        for (i = 1; i <= maxCheck; i++) {
            isPrime = CheckPrime(i);
            if (isPrime) {
                primeNumbersFound = primeNumbersFound + i + " ";
            }
        }
        System.out.println("Prime numbers from 1 to " + maxCheck + " are:");
        // Print prime numbers from 1 to maxCheck
        System.out.println(primeNumbersFound);
    }

    public static boolean CheckPrime(int numberToCheck) {
        int remainder;
        for (int i = 2; i <= numberToCheck / 2; i++) {
            remainder = numberToCheck % i;
            // if the remainder is 0 then numberToCheck is not prime and break loop. Else
            // continue loop
            if (remainder == 0) {
                return false;
            }
        }
        return true;
    }
}