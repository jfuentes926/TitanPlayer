package Player.BLL;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Library {
    
    // TODO research tree set 
    
    public static List<Song> songList;    
    
    public Library() {
        songList = new ArrayList<Song>();        
    }
    
    public void addSong(Song songAdded) {
        songList.add(songAdded);
    }    
    
    public int songCount() {
        return songList.size();        
    }
    
    public void removeSong(Song songRemoved) {
        songList.remove(songRemoved);
    }
    
    public void containsSong(Song songInList) {
        songList.contains(songInList);
    }

    public List getAllSongs() {
        return Collections.unmodifiableList(songList);
    }
}
