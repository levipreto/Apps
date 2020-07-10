package Misc.CompoundInterestCalc;

import java.math.BigDecimal;

public class CompoundInterestCalculator {

    BigDecimal principal;
    BigDecimal interest;

    public CompoundInterestCalculator(String principal, String interest) {
        this.principal = new BigDecimal(principal);
        this.interest = new BigDecimal(interest).divide(new BigDecimal(100));
    }

    // TOTAL = PRINCIPAL*(1+INTEREST)^PERIODS
    public BigDecimal calculateTotalValue(int noOfYears) {
        BigDecimal onePlusInterest = interest.add(new BigDecimal(1));
        BigDecimal onePlusInterestPower = onePlusInterest.pow(noOfYears);
        BigDecimal totalValue = principal.multiply(onePlusInterestPower);
        return totalValue;
    }
}