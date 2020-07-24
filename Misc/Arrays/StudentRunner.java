package Misc.Arrays;

import java.math.BigDecimal;

public class StudentRunner {
    
    public static void main(String[] args) {

        int[] marks = { 99, 98, 100 };
        
        Student student = new Student("Student1", marks);

        int number = student.getNumberOfMarks();
        System.out.println("Number of marks: " + number);
        
        int sum = student.getTotalSumOfMarks();
        System.out.println("The sum of marks is: " + sum);

        int maximumMark = student.getMaximumMark();
        System.out.println("The maximum mark is: " + maximumMark);

        int minimumMark = student.getMinimumMark();
        System.out.println("The minimum mark is: " + minimumMark);

        BigDecimal average = student.getAverageMarks();
        System.out.println("The average mark is: " + average);
    }
}