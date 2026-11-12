/**
 * Workshop 6 - Exercise 1 (Easy)
 * Store 10 favourite songs in one String array and the artist names in a
 * second String array, then print the songs together with their artists.
 */
public class Exercise1 {

    public static void main(String[] args) {

        // Two parallel arrays: index i in songs matches index i in artists
        String[] songs = {
                "Bohemian Rhapsody",
                "Billie Jean",
                "Shape of You",
                "Blinding Lights",
                "Rolling in the Deep",
                "Hotel California",
                "Smells Like Teen Spirit",
                "Bad Guy",
                "Perfect",
                "Yellow"
        };

        String[] artists = {
                "Queen",
                "Michael Jackson",
                "Ed Sheeran",
                "The Weeknd",
                "Adele",
                "Eagles",
                "Nirvana",
                "Billie Eilish",
                "Ed Sheeran",
                "Coldplay"
        };

        System.out.println("My 10 Favourite Songs");
        System.out.println("---------------------");

        // A single loop walks both arrays in step
        for (int i = 0; i < songs.length; i++) {
            System.out.printf("%2d. %-25s - %s%n", i + 1, songs[i], artists[i]);
        }
    }
}
