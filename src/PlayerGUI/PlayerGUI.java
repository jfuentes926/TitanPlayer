/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package PlayerGUI;

/**
 *
 * @author Jamie
 */
public class PlayerGUI extends javax.swing.JFrame {

    /**
     * Creates new form PlayerGUI
     */
    public PlayerGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        songProgressBar = new javax.swing.JProgressBar();
        rewindButton = new javax.swing.JButton();
        stopButton = new javax.swing.JButton();
        playButton = new javax.swing.JButton();
        pauseButton = new javax.swing.JButton();
        fastForwardButton = new javax.swing.JButton();
        volumeLabel = new javax.swing.JLabel();
        volumeSlider = new javax.swing.JSlider();
        currentTrackPlaying = new javax.swing.JLabel();
        applicationMenu = new javax.swing.JMenuBar();
        menuMainMenu = new javax.swing.JMenu();
        playlistMenu = new javax.swing.JMenu();
        playlistNewPlaylist = new javax.swing.JMenuItem();
        playlistDeletePlaylist = new javax.swing.JMenuItem();
        playlistSelectPlaylist = new javax.swing.JMenuItem();
        playlistAddSong = new javax.swing.JMenuItem();
        playlistRemoveSong = new javax.swing.JMenuItem();
        libraryMenu = new javax.swing.JMenu();
        libraryShowAllSongs = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        librarySortList = new javax.swing.JMenuItem();
        libraryAddSong = new javax.swing.JMenuItem();
        libraryRemoveSong = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Titan Music Player");
        setBackground(new java.awt.Color(153, 153, 153));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        rewindButton.setText("Rewind");
        rewindButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rewindButtonActionPerformed(evt);
            }
        });

        stopButton.setText("Stop");

        playButton.setText("Play");

        pauseButton.setText("Pause");

        fastForwardButton.setText("Fast Forward");

        volumeLabel.setText("Volume");

        currentTrackPlaying.setText("Current Track: ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rewindButton)
                        .addGap(18, 18, 18)
                        .addComponent(stopButton)
                        .addGap(18, 18, 18)
                        .addComponent(playButton)
                        .addGap(18, 18, 18)
                        .addComponent(pauseButton)
                        .addGap(18, 18, 18)
                        .addComponent(fastForwardButton)
                        .addGap(102, 102, 102)
                        .addComponent(volumeLabel)
                        .addGap(18, 18, 18)
                        .addComponent(volumeSlider, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE))
                    .addComponent(currentTrackPlaying, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(songProgressBar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(currentTrackPlaying, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(songProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rewindButton)
                        .addComponent(stopButton)
                        .addComponent(playButton)
                        .addComponent(pauseButton)
                        .addComponent(fastForwardButton)
                        .addComponent(volumeLabel))
                    .addComponent(volumeSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        menuMainMenu.setLabel("Menu");
        applicationMenu.add(menuMainMenu);

        playlistMenu.setText("Playlist ");

        playlistNewPlaylist.setText("New Playlist");
        playlistMenu.add(playlistNewPlaylist);

        playlistDeletePlaylist.setText("Delete Playlist");
        playlistMenu.add(playlistDeletePlaylist);

        playlistSelectPlaylist.setText("Select Playlist");
        playlistMenu.add(playlistSelectPlaylist);

        playlistAddSong.setText("Add Song");
        playlistMenu.add(playlistAddSong);

        playlistRemoveSong.setText("Remove Song");
        playlistMenu.add(playlistRemoveSong);

        applicationMenu.add(playlistMenu);

        libraryMenu.setText("Library");

        libraryShowAllSongs.setText("Show All Songs");
        libraryMenu.add(libraryShowAllSongs);

        jMenu1.setText("jMenu1");
        libraryMenu.add(jMenu1);

        librarySortList.setText("Sort List");
        librarySortList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                librarySortListActionPerformed(evt);
            }
        });
        libraryMenu.add(librarySortList);

        libraryAddSong.setText("Add Song");
        libraryAddSong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                libraryAddSongActionPerformed(evt);
            }
        });
        libraryMenu.add(libraryAddSong);

        libraryRemoveSong.setText("Remove Song");
        libraryMenu.add(libraryRemoveSong);

        applicationMenu.add(libraryMenu);

        setJMenuBar(applicationMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(285, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rewindButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rewindButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rewindButtonActionPerformed

    private void librarySortListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_librarySortListActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_librarySortListActionPerformed

    private void libraryAddSongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_libraryAddSongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_libraryAddSongActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PlayerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlayerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlayerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlayerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new PlayerGUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar applicationMenu;
    private javax.swing.JLabel currentTrackPlaying;
    private javax.swing.JButton fastForwardButton;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem libraryAddSong;
    private javax.swing.JMenu libraryMenu;
    private javax.swing.JMenuItem libraryRemoveSong;
    private javax.swing.JMenuItem libraryShowAllSongs;
    private javax.swing.JMenuItem librarySortList;
    private javax.swing.JMenu menuMainMenu;
    private javax.swing.JButton pauseButton;
    private javax.swing.JButton playButton;
    private javax.swing.JMenuItem playlistAddSong;
    private javax.swing.JMenuItem playlistDeletePlaylist;
    private javax.swing.JMenu playlistMenu;
    private javax.swing.JMenuItem playlistNewPlaylist;
    private javax.swing.JMenuItem playlistRemoveSong;
    private javax.swing.JMenuItem playlistSelectPlaylist;
    private javax.swing.JButton rewindButton;
    private javax.swing.JProgressBar songProgressBar;
    private javax.swing.JButton stopButton;
    private javax.swing.JLabel volumeLabel;
    private javax.swing.JSlider volumeSlider;
    // End of variables declaration//GEN-END:variables
}
