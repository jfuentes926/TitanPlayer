package Player.BLL;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;


public class Playlist {
    
    private LinkedList<Song> playlistSongList;    
    public LinkedList<Song> getPlaylistSongList() {
        return playlistSongList;
    }
    
    private String playlistName;
    public String getPlaylistName() {
        return playlistName;
    }
    
    public Playlist(String playlistName) {
        this.playlistName = playlistName; 
        this.playlistSongList = new LinkedList<Song>(); 
    }

    public int songCount() {
       return playlistSongList.size(); 
    }

    public void addSong(Song songAdded) {
        playlistSongList.add(songAdded);
    }

    public void removeSong(Song songRemoved) {
        playlistSongList.remove(songRemoved);
    }

    public Collection<Song> getAllSongs() {
        return Collections.unmodifiableCollection(playlistSongList);
    }   
}
