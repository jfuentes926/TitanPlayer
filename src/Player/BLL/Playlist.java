package Player.BLL;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Playlist {
    
    //constructor 
    public Playlist(String playlistName) {
        this.playlistName = playlistName;
        this.playlistSongList = new ArrayList<Song>();
    }
    
    private List<Song> playlistSongList;

    public List<Song> getPlaylistSongList() {
        return playlistSongList;
    }
    
    private String playlistName;

    public String getPlaylistName() {
        return playlistName;
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
