/*
Ryan Chien
Period 4
Class Design
MySongDriver
 */

public class MySongDriver {
    public static void main(String[] args) {
        // create song objects
        MySong song1 = new MySong();
        MySong song2 = new MySong("Queen", "Bohemian Rhapsody", 19.99, 10);

        // put both songs into an array
        MySong[] songs = {song1, song2};

        // print out each song in the array
        for (MySong song: songs) {
            System.out.println(song);
        }
    }
}
