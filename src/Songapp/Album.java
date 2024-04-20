package Songapp;

import java.util.*;
import java.lang.*;

public class Album {

    public String album;
    public String artist;
    public List<song> songlist = new ArrayList<>();

    public Album(String album, String artist) {
        this.album = album;
        this.artist = artist;
    }

    public boolean findSongInAlbum(String title){
        for(song song:songlist)
            if (song.getTitle().equals(title)){
                return true;
            }
        return false;
    }

    public String addSongToAlbum(String title,double duration){

        if (findSongInAlbum(title))
        {
            return "Song Already in album";
        } else {
            songlist.add(new song(title,duration));
            return "Song successfully added";
        }

    }

    public String addToPlaylist(int songNo,ArrayList<song> playlist){
        int index = songNo -1;
        if (index>=0 & index<songlist.size()){
            playlist.add(songlist.get(index));
            return "Song added to playlist";
        } else {
            return "Song Not available/Song No out of range";
        }
    }

}
