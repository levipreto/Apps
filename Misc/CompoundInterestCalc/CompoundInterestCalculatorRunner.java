package Misc.CompoundInterestCalc;

import java.math.BigDecimal;

public class CompoundInterestCalculatorRunner {

    public static void main(String[] args) {
        CompoundInterestCalculator calculator = new CompoundInterestCalculator("4500.00", "7.5");
        BigDecimal totalValue = calculator.calculateTotalValue(5); // 5 years
        System.out.println(totalValue);
    }
}