package Misc.Tips.Blocks.src;

public class BlocksRunner {
    
    public static void main(String[] args) {
        if(3 > 2) {
            System.out.println("3 > 2");
        }

        {
            int i = 1;
            int j = 2;
            System.out.println(i + j);
        }

        int i = 1;
        int j = 2;
        System.out.println(i + j); // due to the blocks i and j cannot be accessed and has to be declared.
    }
}