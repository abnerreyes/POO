/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lap Toshiba
 */
import java.util.*;
public class Playlist {

    private static ArrayList<Album> albumsCollection = new ArrayList<Album>();

    public static void main(String[] args) {
       Album album = new Album("Divide", "Ed Sheeran");
        album.addSongs("Eraser", 3.47);
        album.addSongs("Castle of the Hill", 4.21);
        album.addSongs("Dive", 3.58);
        album.addSongs("Shape of you", 3.53);
        album.addSongs("Perfect", 4.23);
        albumsCollection.add(album);

        album = new Album("Kaya", "Bob Marley");
        album.addSongs("Easy Skanking", 2.53);
        album.addSongs("Kaya", 3.15);
        album.addSongs("Is This Love", 3.52);
        album.addSongs("Sun is Shining", 4.58);
        album.addSongs("Satisfy My Soul", 4.30);
        albumsCollection.add(album);

        LinkedList<Song> playlist = new LinkedList<Song>();
        albumsCollection.get(0).addToPlayList("Lego House", playlist);
        albumsCollection.get(0).addToPlayList("Shape of you", playlist);
        albumsCollection.get(0).addToPlayList("Buffalo Soldier", playlist); 
        albumsCollection.get(0).addToPlayList(2, playlist);
        albumsCollection.get(1).addToPlayList(3, playlist);
        albumsCollection.get(1).addToPlayList(1, playlist);
        albumsCollection.get(1).addToPlayList(6, playlist); 

        play(playlist);
    }

    private static void play(LinkedList<Song> playlist) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        ListIterator<Song> playlistIterator = playlist.listIterator();

        if (playlist.isEmpty()){
            System.out.println("Playlist is currently empty.");
            return;
        } else {
            System.out.println("Now playing "+ playlistIterator.next().getTitle());
            printMenu();
        }

        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action) {
                case 0:
                    System.out.println("Music player stopped.");
                    quit = true;
                    break;
                case 1:
                    if (!forward) {
                        if (playlistIterator.hasNext()) {
                            playlistIterator.next();
                        }
                        forward = true;
                    }
                    if (playlistIterator.hasNext()) {
                        System.out.println("Now playing " + playlistIterator.next().getTitle());
                    } else {
                        System.out.println("Currently in the end of the playlist.");
                        forward = false;
                    }
                    break;
                case 2:
                    if (forward) {
                        if (playlistIterator.hasPrevious()) {
                            playlistIterator.previous();
                        }
                        forward = false;
                    }
                    if (playlistIterator.hasPrevious()) {
                        System.out.println("Now playing " + playlistIterator.previous().getTitle());
                    } else {
                        System.out.println("Currently in the beginning of the playlist.");
                        forward = true;
                    }
                    break;
                case 3: //write it better
                    if (forward) {
                        if (playlistIterator.hasPrevious()) {
                            System.out.println("Now playing " + playlistIterator.previous().getTitle());
                            forward = false;
                        } else {
                            System.out.println("Currently in the beginning of the playlist.");
                        }
                    } else {
                        if (playlistIterator.hasNext()) {
                            System.out.println("Now playing " + playlistIterator.next().getTitle());
                            forward = true;
                        } else {
                            System.out.println("Currently in the end of the playlist.");
                        }
                    }
                    break;
                case 4:
                    printList(playlist);
                    break;
                case 5:
                    printMenu();
                    break;
                case 6:
                    if (playlist.size() > 0) {
                        playlistIterator.remove();
                        if (playlistIterator.hasNext()) {
                            System.out.println("Now playing " + playlistIterator.next());
                        } else if (playlistIterator.hasPrevious()) {
                            System.out.println("Now playing " + playlistIterator.previous());
                        }
                    }
                    break;
            }
        }
    }

    private static void printMenu() {
        System.out.println("Press: ");
        System.out.println("0 - quit");
        System.out.println("1 - next song");
        System.out.println("2 - previous song");
        System.out.println("3 - repeat the current song");
        System.out.println("4 - list songs in the playlist");
        System.out.println("5 - print the menu options");
        System.out.println("6 - remove the current song from the playlist");
    }

    private static void printList(LinkedList<Song> playlist) {
        Iterator<Song> iterator = playlist.iterator();
        System.out.println("================================");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("================================");
    }
}
