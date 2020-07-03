public class MultiplicationTable {

    // first method
    // void printMultiplicationTable(int table) {
    //    for (int i = 1; i <= 10; i++) {
    //        System.out.printf("%d * %d = %d", table, i, table * i).println();
    //    }
    //}

    public static void main (String[] args) {
    int table = 5;
    int multiply;

        for (multiply = 0; multiply <= 10; multiply++) {
            System.out.printf("%d * %d = %d", table, multiply, table * multiply).println();
        }
    }
}