public class TrianglePrinter {

    // PRINT
    // 1
    // 1 2
    // 1 2 3

    public static void main(String[] args) {

        printANumberTriangle(3);
    }

    private static void printANumberTriangle(int max) {

        for (int i = 1; i <= max; ++i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}