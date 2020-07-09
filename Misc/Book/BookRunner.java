package Misc.Book;

public class BookRunner {
    
    public static void main(String[] args) {
        // OBJECTS
        Book artofComputerProgramming = new Book();
        Book effectiveJava = new Book();
        Book cleanCode = new Book();

        // METHOD OF OBJETCS
        artofComputerProgramming.setnoOfCopies(100);
        System.out.println(artofComputerProgramming.getnoOfCopies());
        effectiveJava.setnoOfCopies(50);
        System.out.println(effectiveJava.getnoOfCopies());
        cleanCode.setnoOfCopies(45);
        System.out.println(cleanCode.getnoOfCopies());

    }
}