package OOPs.codes;

/* Practical No: 9.3
Title: Music Playlist using LinkedList

Practical Statement:
- Use LinkedList<String> to simulate playlist
- Add songs
- Display playlist
- Play first song (removeFirst)
- Skip last song (removeLast)
- Display after each operation
*/

import java.util.LinkedList;

public class Practical_9_3 {
    public static void main(String[] args) {

        // Create LinkedList
        LinkedList<String> playlist = new LinkedList<>();

        // 1. Add songs
        playlist.add("Song A");
        playlist.add("Song B");
        playlist.add("Song C");
        playlist.add("Song D");

        // 2. Display playlist
        System.out.println("Initial Playlist:");
        System.out.println(playlist);

        // 3. Play first song
        String firstSong = playlist.removeFirst();
        System.out.println("\nPlaying: " + firstSong);
        System.out.println("Playlist after playing first song:");
        System.out.println(playlist);

        // 4. Skip last song
        String lastSong = playlist.removeLast();
        System.out.println("\nSkipped: " + lastSong);
        System.out.println("Playlist after skipping last song:");
        System.out.println(playlist);
    }
}