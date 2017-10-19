
import java.awt.BorderLayout;
import java.awt.Component;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import javax.media.CannotRealizeException;
import javax.media.Manager;
import javax.media.NoPlayerException;
import javax.media.Player;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Matthew
 */
public class MediaPanel extends javax.swing.JPanel {

    /**
     * Creates new form MediaPanel
     */
    public MediaPanel(File file, LinkedPanelNode _next) throws MalformedURLException, IOException, NoPlayerException, CannotRealizeException {
        listeners = new ArrayList<>();
        initComponents();
        next = _next;
        mediaPanel.setLayout(new BorderLayout());
        //System.out.println(System.getProperty("user.dir") + "\\src\\" + filename);
        URL mediaURL = file.toURI().toURL();
        System.out.println("created URL");
        //create the media player with the media url
        Player mediaPlayer = Manager.createRealizedPlayer(mediaURL);
        System.out.println("created media player");
        //get components for video and playback controls
        Component video = mediaPlayer.getVisualComponent();
        Component controls = mediaPlayer.getControlPanelComponent();
        mediaPanel.add(video,BorderLayout.CENTER);
        mediaPanel.add(controls,BorderLayout.SOUTH);
    }

    public void addListener(MediaListener listener) {
        listeners.add(listener);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mediaPanel = new javax.swing.JPanel();
        flowPanel = new javax.swing.JPanel();
        continueButton = new javax.swing.JButton();
        backgroundLabel = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1600, 900));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mediaPanel.setOpaque(false);
        mediaPanel.setLayout(new java.awt.GridBagLayout());
        add(mediaPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1600, 860));

        flowPanel.setOpaque(false);
        flowPanel.setLayout(new java.awt.GridBagLayout());

        continueButton.setText("Continue");
        flowPanel.add(continueButton, new java.awt.GridBagConstraints());

        add(flowPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 860, 1600, 40));

        backgroundLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background.jpg"))); // NOI18N
        add(backgroundLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1600, 900));
    }// </editor-fold>//GEN-END:initComponents

    private LinkedPanelNode next;
    private ArrayList<MediaListener> listeners;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroundLabel;
    private javax.swing.JButton continueButton;
    private javax.swing.JPanel flowPanel;
    private javax.swing.JPanel mediaPanel;
    // End of variables declaration//GEN-END:variables
}
