package Misc.AdvancedOOP.Book.src;

import java.util.ArrayList;

public class Book {

    private int id;
    private String bookName;
    private String author;
    private ArrayList<Review> reviews = new ArrayList<>();

	public Book(int id, String bookName, String author) {
        this.id = id;
        this.bookName = bookName;
        this.author = author;
    }
    
    public void addReview(Review review) {
        this.reviews.add(review);
    }
    
    public int getId() {
        return id;
    }

    public String getName() {
        return bookName;
    }

    public String getAuthor() {
        return author;
    }
    
    public String toString() {
        return String.format("Id: - [%s], Book Name - [%s], Author - [%s], Reviews - [%s]",
                            id, bookName, author, reviews);
    }
}
