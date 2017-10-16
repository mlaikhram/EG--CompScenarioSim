
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

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
     * @param _code
     * @param _next
     */
    public LinkedPanelNode(String _description, String _movie, String _code, LinkedPanelNode _next) {
        listeners = new ArrayList<>();
        description = _description;
        movie = _movie;
        passCode = _code;
        next = _next;
        initComponents();
        initVisibility();
    }
    
    public LinkedPanelNode(String _description, String _movie, String _code) {
        listeners = new ArrayList<>();
        description = _description;
        movie = _movie;
        passCode = _code;
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
        if (movie.equals("")){ 
            replayButton.setVisible(false);
            padLabel1.setVisible(false);
        }
        if (passCode.equals("")){
            codeTextField.setVisible(false);
            padLabel2.setVisible(false);
        }
        if (next == null){
            continueButton.setText("Finish");
        }
    }
    
    public LinkedPanelNode getNext() {
        return next;
    }  
     
    public void playMovie() {
        if (!movie.equals("")) {
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
        java.awt.GridBagConstraints gridBagConstraints;

        flowPanel = new javax.swing.JPanel();
        replayButton = new javax.swing.JButton();
        padLabel1 = new javax.swing.JLabel();
        codeTextField = new javax.swing.JTextField();
        padLabel2 = new javax.swing.JLabel();
        continueButton = new javax.swing.JButton();
        contentPanel = new javax.swing.JPanel();
        descriptionLabel = new javax.swing.JLabel();
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

        descriptionLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        descriptionLabel.setForeground(new java.awt.Color(255, 255, 255));
        descriptionLabel.setText(description);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(116, 382, 91, 364);
        contentPanel.add(descriptionLabel, gridBagConstraints);

        add(contentPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1600, 500));

        backgroundLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background.jpg"))); // NOI18N
        backgroundLabel.setMaximumSize(new java.awt.Dimension(1600, 900));
        backgroundLabel.setMinimumSize(new java.awt.Dimension(1600, 900));
        backgroundLabel.setPreferredSize(new java.awt.Dimension(1600, 900));
        add(backgroundLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void replayButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_replayButtonMouseClicked
        playMovie();
    }//GEN-LAST:event_replayButtonMouseClicked

    private void continueButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_continueButtonMouseClicked
        if ("".equals(passCode) || codeTextField.getText().equals(passCode)) {
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
    private String passCode;
    private LinkedPanelNode next;
    private ArrayList<FinishedListener> listeners;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroundLabel;
    private javax.swing.JTextField codeTextField;
    private javax.swing.JPanel contentPanel;
    private javax.swing.JButton continueButton;
    private javax.swing.JLabel descriptionLabel;
    private javax.swing.JPanel flowPanel;
    private javax.swing.JLabel padLabel1;
    private javax.swing.JLabel padLabel2;
    private javax.swing.JButton replayButton;
    // End of variables declaration//GEN-END:variables

}
