package Misc.Arrays;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Arrays;

public class Student {
    
    private String name;
    private int[] marks;

    Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
    }

	public int getNumberOfMarks() {
        return marks.length;
	}

	public int getTotalSumOfMarks() {
        return Arrays.stream(marks).sum();
	}

	public int getMaximumMark() {
		return Arrays.stream(marks).max().getAsInt();
	}

	public int getMinimumMark() {
		return Arrays.stream(marks).min().getAsInt();
	}

	public BigDecimal getAverageMarks() {
        BigDecimal sumOfMarks = new BigDecimal(getTotalSumOfMarks());
        BigDecimal numberOfMarks = new BigDecimal(getNumberOfMarks());
        return(sumOfMarks.divide(numberOfMarks, MathContext.DECIMAL128));
	}
}