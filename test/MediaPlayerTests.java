
import Player.BLL.Playlist;
import Player.BLL.MediaPlayer;
import org.junit.*;
import static org.junit.Assert.*;


public class MediaPlayerTests {
    
    static Playlist currentPlaylist; 
    static MediaPlayer mediaPlayer;

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
    }

    @After
    public void tearDown() {
    }

    @Test
    public void getPlaylistTest() {
        currentPlaylist.getAllSongs();
    }

    @Test
    public void skipPlaylistSongTest() {
        // TODO add assertion
        currentPlaylist.getAllSongs();
        mediaPlayer.skipCurrentSong(currentPlaylist);
        mediaPlayer.getCurrentSong(currentPlaylist);
        assertEquals(song3, getCurrentSong(song3));
    }
}
