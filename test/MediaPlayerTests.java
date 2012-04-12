
import Player.BLL.Playlist;
import Player.BLL.MediaPlayer;
import Player.BLL.Song;
import org.junit.*;
import static org.junit.Assert.*;


public class MediaPlayerTests {
    
    static Playlist currentPlaylist; 
    
    static MediaPlayer mediaPlayer; 
        
    static Song song1 = new Song("My Happy Ending", "Avril Lavigne"); 
    static Song song2 = new Song("In The End", "Linkin Park"); 
    static Song song3 = new Song("Faith", "Limp Bizkit");
    static Song song4 = new Song("Jumper", "Third Eye Blind");

    public MediaPlayerTests() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
        currentPlaylist = new Playlist("Test");
        mediaPlayer = new MediaPlayer(currentPlaylist);        
        currentPlaylist.addSong(song1);
        currentPlaylist.addSong(song2);
        currentPlaylist.addSong(song3);
        currentPlaylist.addSong(song4);
    }

    @After
    public void tearDown() {
    }


   @Test
   public void getCurrentSongTest() {
       mediaPlayer.getCurrentSong(currentPlaylist); 
       assertEquals(song1, mediaPlayer.getCurrentSong()); 
   }
    
    
    @Test
    public void skipPlaylistSongTest() {
        mediaPlayer.getCurrentSong(currentPlaylist);
        mediaPlayer.getNextSong(currentPlaylist);
        mediaPlayer.getNextSong(currentPlaylist);
        assertEquals(song3, mediaPlayer.getCurrentSong());
        
    }
}
