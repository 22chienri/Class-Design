/*
Ryan Chien
Period 4
Class Design
MySong
 */

public class MySong {
    // initiate variables
    private String artist;
    private String title;
    private double cost;
    private int rating;

    // zero-argument constructor
    public MySong() {
        artist = new String("Electric Light Orchestra");
        title = new String("Mr. Blue Sky");
        cost = 9.99;
        rating = 10;
    }

    // multi-argument constructor
    public MySong(String artist, String title, double cost, int rating) {
        this.artist = artist;
        this.title = title;
        this.cost = cost;
        this.rating = rating;
    }

    // toString method
    public String toString() {
        String output;
        output = String.format("\"%s\" by %s has a rating of %s and cost %s", title, artist, rating, cost);
        return output;
    }
}
