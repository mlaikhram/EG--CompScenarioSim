
import java.awt.Desktop;
import java.awt.FontMetrics;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Matthew Laikhram
 */
public class LinkedPanelNode extends javax.swing.JPanel {
    
    /**
     * Creates new form LinkedPanel
     * @param _description
     * @param _movie
     * @param _passcode
     * @param _next
     */
    public LinkedPanelNode(String _description, String _movie, String _passcode, LinkedPanelNode _next) {
        listeners = new ArrayList<>();
        description = _description;
        movie = _movie;
        passCode = _passcode;
        next = _next;
        initComponents();
        initVisibility();
    }
    
    public LinkedPanelNode(String _description, String _movie, String _passcode) {
        listeners = new ArrayList<>();
        description = _description;
        movie = _movie;
        passCode = _passcode;
        next = null;
        initComponents();
        initVisibility();
    }
    
    public LinkedPanelNode(String _description, String _movie, LinkedPanelNode _next) {
        listeners = new ArrayList<>();
        description = _description;
        movie = _movie;
        passCode = "";
        next = _next;
        initComponents();
        initVisibility();
    }
    
    public LinkedPanelNode(String _description, LinkedPanelNode _next) {
        listeners = new ArrayList<>();
        description = _description;
        movie = "";
        passCode = "";
        next = _next;
        initComponents();
        initVisibility();
    }

    public LinkedPanelNode(String _description, String _movie) {
        listeners = new ArrayList<>();
        description = _description;
        movie = _movie;
        passCode = "";
        next = null;
        initComponents();
        initVisibility();
    }
    
    private void initVisibility() {
        try {
            if (movie.equals("") || movie.equals("none")){ 
                replayButton.setVisible(false);
                padLabel1.setVisible(false);
                media = null;
            }
            else {
                //media = new MediaPanel(movie, this);
            }
            if (passCode.equals("") || passCode.equals("none")){
                codeTextField.setVisible(false);
                padLabel2.setVisible(false);
            }
            if (next == null){
                continueButton.setText("Finish");
            } else {
                continueButton.setText("Continue");
            }
        } catch (Exception ex) {
            System.out.println("Something went wrong with media player");
        }
    }
    
    public LinkedPanelNode getNext() {
        return next;
    }  
     
    public void setNext(LinkedPanelNode newNext) {
        next = newNext;
        initVisibility();
    }
    
    public MediaPanel getMedia() {
        return media;
    }
    
    public void playMovie() {
        if (!(movie.equals("") || movie.equals("none"))) {
            try {          
                File file = new File(System.getProperty("user.dir") + "/src", movie);
                Desktop.getDesktop().open(file);             
            } catch (IOException ex) {
                Logger.getLogger(CompScenarioSim.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this passCode. The content of this method is always
 regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        flowPanel = new javax.swing.JPanel();
        replayButton = new javax.swing.JButton();
        padLabel1 = new javax.swing.JLabel();
        codeTextField = new javax.swing.JTextField();
        padLabel2 = new javax.swing.JLabel();
        continueButton = new javax.swing.JButton();
        contentPanel = new javax.swing.JPanel();
        descriptionScrollPane = new javax.swing.JScrollPane();
        descriptionTextPane = new javax.swing.JTextPane();
        backgroundLabel = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1600, 900));
        setMinimumSize(new java.awt.Dimension(1600, 900));
        setPreferredSize(new java.awt.Dimension(1600, 900));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        flowPanel.setMaximumSize(new java.awt.Dimension(780, 170));
        flowPanel.setMinimumSize(new java.awt.Dimension(780, 170));
        flowPanel.setOpaque(false);
        flowPanel.setPreferredSize(new java.awt.Dimension(780, 170));
        flowPanel.setLayout(new java.awt.GridBagLayout());

        replayButton.setText("Replay Movie");
        replayButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                replayButtonMouseClicked(evt);
            }
        });
        flowPanel.add(replayButton, new java.awt.GridBagConstraints());

        padLabel1.setText("                 ");
        flowPanel.add(padLabel1, new java.awt.GridBagConstraints());

        codeTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        codeTextField.setText("Input code to continue");
        codeTextField.setMaximumSize(new java.awt.Dimension(140, 30));
        codeTextField.setMinimumSize(new java.awt.Dimension(140, 30));
        codeTextField.setPreferredSize(new java.awt.Dimension(140, 30));
        flowPanel.add(codeTextField, new java.awt.GridBagConstraints());

        padLabel2.setText("                 ");
        flowPanel.add(padLabel2, new java.awt.GridBagConstraints());

        continueButton.setText("Next");
        continueButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                continueButtonMouseClicked(evt);
            }
        });
        flowPanel.add(continueButton, new java.awt.GridBagConstraints());

        add(flowPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 1600, 400));

        contentPanel.setMaximumSize(new java.awt.Dimension(780, 240));
        contentPanel.setMinimumSize(new java.awt.Dimension(780, 240));
        contentPanel.setOpaque(false);
        contentPanel.setPreferredSize(new java.awt.Dimension(780, 240));
        contentPanel.setLayout(new java.awt.GridBagLayout());

        descriptionScrollPane.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        descriptionScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        descriptionScrollPane.setViewportBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        descriptionScrollPane.setMaximumSize(new java.awt.Dimension(900, 450));
        descriptionScrollPane.setMinimumSize(new java.awt.Dimension(900, 33));
        descriptionScrollPane.setOpaque(false);
        descriptionScrollPane.getViewport().setOpaque(false);
        descriptionScrollPane.setPreferredSize(new java.awt.Dimension(900, 33));

        descriptionTextPane.setEditable(false);
        descriptionTextPane.setBackground(new java.awt.Color(255, 255, 255, 0));
        descriptionTextPane.setBorder(null);
        descriptionTextPane.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        descriptionTextPane.setForeground(new java.awt.Color(255, 255, 255));
        descriptionTextPane.setText(description);
        descriptionTextPane.setOpaque(false);
        descriptionTextPane.setPreferredSize(new java.awt.Dimension(900, 87));
        StyledDocument doc = descriptionTextPane.getStyledDocument();
        SimpleAttributeSet center = new SimpleAttributeSet();
        StyleConstants.setAlignment(center, StyleConstants.ALIGN_CENTER);
        doc.setParagraphAttributes(0, doc.getLength(), center, false);
        descriptionScrollPane.setViewportView(descriptionTextPane);
        //count lines to determine width of scrollpane
        int lineCount = 1;
        FontMetrics fm = descriptionTextPane.getFontMetrics(descriptionTextPane.getFont());
        int width = descriptionTextPane.getPreferredSize().width;
        String text = descriptionTextPane.getText();
        String line = "";
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c != '\n') {
                if (fm.stringWidth(line + c) <= width) {
                    line += c;
                } else {
                    ++lineCount;
                    line = "" + c;
                }
            }
        }
        //find a new height within the bounds of the scrollPane
        int newHeight = descriptionScrollPane.getPreferredSize().height * lineCount;
        if (newHeight > descriptionScrollPane.getMaximumSize().height) {
            newHeight = descriptionScrollPane.getMaximumSize().height;
        }
        descriptionScrollPane.setPreferredSize(new java.awt.Dimension(descriptionScrollPane.getPreferredSize().width, newHeight));

        //move scrollbar to the top of the text
        descriptionTextPane.setCaretPosition(0);

        contentPanel.add(descriptionScrollPane, new java.awt.GridBagConstraints());

        add(contentPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1600, 500));

        backgroundLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background.jpg"))); // NOI18N
        add(backgroundLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void replayButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_replayButtonMouseClicked
        playMovie();
    }//GEN-LAST:event_replayButtonMouseClicked

    private void continueButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_continueButtonMouseClicked
        if ("".equals(passCode) || "none".equals(passCode) || codeTextField.getText().equals(passCode)) {
            //if (next == null) System.exit(0);         
            //codeTextField.setText("Correct Code");
            for (FinishedListener f : listeners) {
                f.fireFinished();
            }
        }
        else {
            codeTextField.setText("Incorrect Code");
        }
    }//GEN-LAST:event_continueButtonMouseClicked

    public void addListener(FinishedListener listener) {
        listeners.add(listener);
    }
    
    private String description;
    private String movie;
    private MediaPanel media;
    private String passCode;
    private LinkedPanelNode next;
    private ArrayList<FinishedListener> listeners;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroundLabel;
    private javax.swing.JTextField codeTextField;
    private javax.swing.JPanel contentPanel;
    private javax.swing.JButton continueButton;
    private javax.swing.JScrollPane descriptionScrollPane;
    private javax.swing.JTextPane descriptionTextPane;
    private javax.swing.JPanel flowPanel;
    private javax.swing.JLabel padLabel1;
    private javax.swing.JLabel padLabel2;
    private javax.swing.JButton replayButton;
    // End of variables declaration//GEN-END:variables

}
