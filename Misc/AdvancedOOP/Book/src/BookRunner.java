package Misc.AdvancedOOP.Book.src;

public class BookRunner {
    public static void main(String[] args) {
    
        Book book = new Book(123, "OOP with Java", "Author1");
        book.addReview(new Review(10, "Great Book", 8));
        book.addReview(new Review(12, "Good Book", 7));
        System.out.println(book);
    }
}