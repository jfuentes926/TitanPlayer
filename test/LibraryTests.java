
import Player.BLL.Playlist;
import Player.BLL.Song;
import Player.BLL.Library;
import java.util.List;
import org.junit.*;
import static org.junit.Assert.*;


public class LibraryTests {
    
    static Library playerLibrary; 
    
    static Song song1 = new Song("Nothing Else Matters", "Apocalyptica"); 
    static Song song2 = new Song("Time", "Hans Zimmer"); 
    static Song song3 = new Song("Lately", "Jodeci");
    static Song song4 = new Song("Baby Got Back", "Sir Mix A Lot");
    
    
    public LibraryTests() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
                
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
        playerLibrary = new Library();
    }
    
    @After
    public void tearDown() {
    }

    
    @Test
    public void emptyLibraryTest() {
        Library emptyLibrary = new Library(); 
        assertEquals(0, emptyLibrary.songCount()); 
    }
    
    @Test
    public void addSongTest() {
        playerLibrary.addSong(song1); 
        playerLibrary.addSong(song2);
        playerLibrary.addSong(song3);
        assertEquals(3, playerLibrary.songCount());
    }
    
    @Test
    public void removeSongTest() { 
        playerLibrary.addSong(song1); 
        playerLibrary.addSong(song2);
        playerLibrary.addSong(song3);
        playerLibrary.removeSong(song3);
        assertEquals(2, playerLibrary.songCount());
    }
    
    @Test
    public void getAllSongsTest(){
        playerLibrary.addSong(song1); 
        playerLibrary.addSong(song2);
        playerLibrary.addSong(song3);
        playerLibrary.addSong(song4);
        playerLibrary.getAllSongs();
        assertEquals(4, playerLibrary.songCount());
    }
    
    @Test
    public void actualSongRemovedTest() {
        playerLibrary.addSong(song1); 
        playerLibrary.addSong(song2);
        playerLibrary.addSong(song3);
        playerLibrary.removeSong(song3);
        List allSongs = playerLibrary.getAllSongs(); 
        assertFalse(allSongs.contains(song3));
    }    
}
