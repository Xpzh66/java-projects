/**
 * Workshop 6 - Exercise 2 (Hard)
 * Exercise 1 modified: the songs are printed in alphabetical order.
 * Bubble sort is used, and the artist array is swapped at the same time so
 * that song/artist pairs stay together.
 */
public class Exercise2 {

    public static void main(String[] args) {

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

        System.out.println("Before sorting");
        System.out.println("--------------");
        printList(songs, artists);

        bubbleSort(songs, artists);

        System.out.println();
        System.out.println("After sorting (alphabetical by song title)");
        System.out.println("------------------------------------------");
        printList(songs, artists);
    }

    /**
     * Classic bubble sort. compareToIgnoreCase() gives case-insensitive
     * alphabetical order, which is safer for titles such as "bad guy".
     */
    private static void bubbleSort(String[] songs, String[] artists) {
        int n = songs.length;

        for (int pass = 0; pass < n - 1; pass++) {
            boolean swapped = false;

            // After pass k the last k elements are already in place
            for (int i = 0; i < n - 1 - pass; i++) {
                if (songs[i].compareToIgnoreCase(songs[i + 1]) > 0) {
                    // Swap the song titles
                    String tempSong = songs[i];
                    songs[i] = songs[i + 1];
                    songs[i + 1] = tempSong;

                    // Swap the matching artists so the pairs stay correct
                    String tempArtist = artists[i];
                    artists[i] = artists[i + 1];
                    artists[i + 1] = tempArtist;

                    swapped = true;
                }
            }

            // No swap during a full pass means the array is already sorted
            if (!swapped) {
                break;
            }
        }
    }

    private static void printList(String[] songs, String[] artists) {
        for (int i = 0; i < songs.length; i++) {
            System.out.printf("%2d. %-25s - %s%n", i + 1, songs[i], artists[i]);
        }
    }
}
