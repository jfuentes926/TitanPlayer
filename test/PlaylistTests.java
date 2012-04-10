
import Player.BLL.MediaPlayer;
import Player.BLL.Playlist;
import Player.BLL.Song;
import org.junit.*;
import static org.junit.Assert.*;


public class PlaylistTests {
    
    static Playlist myPlaylist; 
    
    static MediaPlayer mediaPlayer; 
      
    static Song song1 = new Song("Twisted", "Keith Sweat"); 
    static Song song2 = new Song("Pretty Girl", "Jon B"); 
    static Song song3 = new Song("Hey Lover", "LL Cool J");
    static Song song4 = new Song("I Swear", "All 4 One");
    
    public PlaylistTests() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
         myPlaylist = new Playlist("Test"); 
    }
    
    @After
    public void tearDown() {
    }

    
    @Test
    public void emptyPlaylistTest() {
        assertEquals(0, myPlaylist.songCount());        
    }
    
    @Test
    public void playlistNameTest(){
        myPlaylist = new Playlist("80's Music");
        assertEquals("80's Music", myPlaylist.getPlaylistName());
    }
    
    @Test 
    public void addSongTest() {
        myPlaylist.addSong(song1); 
        myPlaylist.addSong(song2); 
        assertEquals(2, myPlaylist.songCount()); 
    }
    
    @Test
    public void removeSongTest() {
        myPlaylist.addSong(song3);
        myPlaylist.addSong(song2);
        myPlaylist.addSong(song3);
        myPlaylist.addSong(song4);
        myPlaylist.removeSong(song2);
        assertEquals(3, myPlaylist.songCount());
    }
    
    @Test
    public void getAllSongsTest() {
        myPlaylist.addSong(song4);
        myPlaylist.addSong(song3);
        myPlaylist.addSong(song2);
        myPlaylist.addSong(song1);
        myPlaylist.getAllSongs();
        assertEquals(4, myPlaylist.songCount()); 
    }     
}
