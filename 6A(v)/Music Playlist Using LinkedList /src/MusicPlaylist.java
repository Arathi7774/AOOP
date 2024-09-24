import java.util.LinkedList;
import java.util.Scanner;

public class MusicPlaylist {
    private LinkedList<String> playlist;

    public MusicPlaylist() {
        playlist = new LinkedList<>();
    }

    // Method to add a song to the playlist
    public void addSong(String song) {
        playlist.add(song);
        System.out.println("Song added: " + song);
    }

    // Method to remove a song by name
    public void removeSong(String song) {
        if (playlist.remove(song)) {
            System.out.println("Song removed: " + song);
        } else {
            System.out.println("Song not found in the playlist.");
        }
    }

    // Method to move a song to a different position
    public void moveSong(int currentIndex, int newIndex) {
        if (currentIndex < 0 || currentIndex >= playlist.size() || newIndex < 0 || newIndex >= playlist.size()) {
            System.out.println("Invalid indices. Please try again.");
        } else {
            String song = playlist.remove(currentIndex);
            playlist.add(newIndex, song);
            System.out.println("Moved song \"" + song + "\" to position " + (newIndex + 1));
        }
    }

    // Method to display the playlist
    public void displayPlaylist() {
        if (playlist.isEmpty()) {
            System.out.println("The playlist is empty.");
        } else {
            System.out.println("Current Playlist:");
            for (int i = 0; i < playlist.size(); i++) {
                System.out.println((i + 1) + ". " + playlist.get(i));
            }
        }
    }

    public static void main(String[] args) {
        MusicPlaylist musicPlaylist = new MusicPlaylist();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nMusic Playlist Manager");
            System.out.println("1. Add Song");
            System.out.println("2. Remove Song");
            System.out.println("3. Move Song");
            System.out.println("4. Display Playlist");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter the song name: ");
                    String song = scanner.nextLine();
                    musicPlaylist.addSong(song);
                    break;
                case 2:
                    System.out.print("Enter the song name to remove: ");
                    String removeSong = scanner.nextLine();
                    musicPlaylist.removeSong(removeSong);
                    break;
                case 3:
                    System.out.print("Enter the current position of the song to move: ");
                    int currentIndex = scanner.nextInt() - 1; // -1 for zero-based index
                    System.out.print("Enter the new position for the song: ");
                    int newIndex = scanner.nextInt() - 1; // -1 for zero-based index
                    musicPlaylist.moveSong(currentIndex, newIndex);
                    break;
                case 4:
                    musicPlaylist.displayPlaylist();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);

        scanner.close();
    }
}
