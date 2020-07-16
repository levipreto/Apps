package Misc.WhileNumbers;

public class WhileNumberPlayer {

    private int max;

    public WhileNumberPlayer(int max) {
        this.max = max;
    }

    public void printSquaresUptoLimit() {

        int i = 1;
        System.out.print("Squares: ");

        while (i * i < max) {
            System.out.print(i * i + " ");
            i++;
        }
        System.out.println();
    }

    public void printCubesUptoLimit() {

        int i = 1;
        System.out.print("Cubes: ");

        while (i * i * i < max) {
            System.out.print(i * i * i + " ");
            i++;
        }
    }
}
