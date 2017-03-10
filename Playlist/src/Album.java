/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alumno
 */
import java.util.*;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> albumList;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.albumList = new ArrayList<Song>();
    }

    public boolean addSongs(String songTitle, double songDuration) {
        if (findSong(songTitle) == null) {
            this.albumList.add(new Song(songTitle, songDuration));
            System.out.println(songTitle + " added successfully to the album: " + this.name);
            return true;
        } else {
            System.out.println("Song is already on the album list.");
            return false;
        }
    }

    private Song findSong(String songTitle) {
        for (Song checkedSong : this.albumList) {
            if (checkedSong.getTitle().equals(songTitle)) {
                return checkedSong;
            }
        }
        return null;
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playlist) {
        int index = trackNumber - 1;
        if ((index >= 0) && (index < this.albumList.size())) {
            playlist.add(this.albumList.get(index));
            return true;
        }
        System.out.println("The current album does not have a track " + trackNumber);
        return false;
    }

    public boolean addToPlayList(String songTitle, LinkedList<Song> playlist) {
        Song checkedSong = findSong(songTitle);
        if (checkedSong != null) {
            playlist.add(checkedSong);
            return true;
        }
        System.out.println(" "+ songTitle + " is not in this album.");
        return false;
    }
}
