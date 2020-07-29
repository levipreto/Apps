package Misc.AdvancedOOP.Book.src;

public class Review {

	private int id;
    private String review;
    private int rating;

    public Review(int id, String review, int rating) {
        this.id = id;
        this.review = review;
        this.rating = rating;
	}

    public String toString() {
        return id + " / " + review + " / " + rating; 
    }
}