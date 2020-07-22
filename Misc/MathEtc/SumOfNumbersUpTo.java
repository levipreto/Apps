package Misc.MathEtc;

public class SumOfNumbersUpTo {
    
    public static void main(String[] args) {

        sumUpTo(6);
        
    }


    private static void sumUpTo(int max) {

        int totalSum = 0;

        for(int i = 1 ; i <= max ; i++) {
            totalSum = totalSum + i;
        }
        System.out.println(totalSum);
    }


}