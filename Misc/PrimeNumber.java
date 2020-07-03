// WORK IN PROGRESS

public class PrimeNumber {
   
    static int primeNumber = 1;
    static boolean isPrime = true;
    static int x;
    static int loop = 1;

    public static void main(String[] args) {

        while (primeNumber < 100) {

            primeNumber = primeNumber + 1;

            x = primeNumber / primeNumber;
            
            while (loop < primeNumber) {

                x = primeNumber / loop;

                loop = loop + 1;

                if (x == 1 || x == 0)

                    isPrime = false;

            if (isPrime)
            System.out.println("Number " + primeNumber + " is prime");
            }
        }
    }
}   