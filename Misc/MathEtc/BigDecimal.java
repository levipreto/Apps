//HOW TO USE BIG DECIMAL
package Misc.MathEtc;

public class BigDecimal {
    
    public BigDecimal(String string) {
    }

    public static void main(String[] args) {
      
        java.math.BigDecimal number1 = new java.math.BigDecimal("35.130235143");
        java.math.BigDecimal number2 = new java.math.BigDecimal("34.935356803");
        java.math.BigDecimal sumBigDecimal = ((java.math.BigDecimal) number1).add(number2);
        System.out.println(sumBigDecimal);    
    }    
}