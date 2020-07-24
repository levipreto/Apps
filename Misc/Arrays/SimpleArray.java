package Misc.Arrays;

import java.util.Arrays;

public class SimpleArray {

    static int[] array1 = { 1, 2, 3, 4, 5 };
    static int[] array2 = { 6, 7, 8, 9, 10 };
    static int[] array3 = { 13, 30, 435, 1, 0, 99, 5};
    public static void main(String[] args) {

        for (int x : array1) {
            System.out.printf("%d, ", x).println();
        }

        System.out.println(Arrays.toString(array2));

        Arrays.sort(array3);
        System.out.println(Arrays.toString(array3));
    }
}