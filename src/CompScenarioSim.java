
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Matthew Laikhram
 */
public class CompScenarioSim extends javax.swing.JFrame {

    /**
     * Creates new form ProjectMM
     */
    public CompScenarioSim() {
        
        String annoying = "When Mr. Bilbo Baggins of Bag End announced that he would shortly be celebrating his eleventy-first birthday with a party of special magnificence, there was much talk and excitement in Hobbiton. \n" +
"\n" +
"Bilbo was very rich and very peculiar, and had been the wonder of the Shire for sixty years, ever since his remarkable disappearance and unexpected return. The riches he had brought back from his travels had now become a local legend, and it was popularly believed, whatever the old folk might say, that the Hill at Bag End was full of tunnels stuffed with treasure. And if that was not enough for fame, there was also his prolonged vigour to marvel at. Time wore on, but it seemed to have little effect on Mr. Baggins. At ninety he was much the same as at fifty. At ninety-nine they began to call him well-preserved; but unchanged would have been nearer the mark. There were some that shook their heads and thought this was too much of a good thing; it seemed unfair that anyone should possess (apparently) perpetual youth as well as (reputedly) inexhaustible wealth. \n" +
"\n" +
"\"It will have to be paid for,\" they said. \"It isn't natural, and trouble will come of it!\" \n" +
"\n" +
"But so far trouble had not come; and as Mr. Baggins was generous with his money, most people were willing to forgive him his oddities and his good fortune. He remained on visiting terms with his relatives (except, of course, the Sackville-Bagginses), and he had many devoted admirers among the hobbits of poor and unimportant families. But he had no close friends, until some of his younger cousins began to grow up. \n" +
"\n" +
"The eldest of these, and Bilbo's favourite, was young Frodo Baggins. When Bilbo was ninety-nine he adopted Frodo as his heir, and brought him to live at Bag End; and the hopes of the Sackville- Bagginses were finally dashed. Bilbo and Frodo happened to have the same birthday, September 22nd. \"You had better come and live here, Frodo my lad,� said Bilbo one day; \"and then we can celebrate our birthday-parties comfortably together.\" At that time Frodo was still in his tweens, as the hobbits called the irresponsible twenties between childhood and coming of age at thirty-three. \n" +
"\n" +
"Twelve more years passed. Each year the Bagginses had given very lively combined birthday-parties at Bag End; but now it was understood that something quite exceptional was being planned for that autumn. Bilbo was going to be eleventy-one, 111, a rather curious number, and a very respectable age for a hobbit (the Old Took himself had only reached 130); and Frodo was going to be thirty- three, 33, an important number: the date of his \"coming of age\". ";
        
        link = new LinkedPanel(
                new LinkedPanelNode(annoying, "/lab8/scene1.mov", 
                    new LinkedPanelNode("This is a test description designed to overflow to another line in the hopes that it becomes multiple lines with the code i wrote. However, i still have to test with longer lines of words just to make sure things are working properly down the line if there's a realllllly long list of stringss put together in an annoying way like what i'm doing right now to be honest.", "", "hi",
                        new LinkedPanelNode("Welcome to the second panel!", "6_20.mp4", "bye",
                                new LinkedPanelNode("This is it", "2017-03-27-2329-40.mp4")                               
                        )
                    )
                )
            );
        initComponents();
        add(link);
    }
    
    public CompScenarioSim(File f) throws FileNotFoundException {
        Scanner scanner = new Scanner(f);
        scanner.useDelimiter("\r\n");
        
        ArrayList<LinkedPanelNode> nodes = new ArrayList<LinkedPanelNode>();
        
        String description;
        String movie;
        String passcode;
        
        while (scanner.hasNext()) {
            description = scanner.next();
            movie = scanner.next();
            passcode = scanner.next();
            System.out.println(description + "|" + movie + "|" + passcode);
            nodes.add(new LinkedPanelNode(description, movie, passcode));
        }
        System.out.println("tet1");
        for(int i = 1; i < nodes.size(); ++i) {
            nodes.get(i-1).setNext(nodes.get(i));
        }
        System.out.println("test2");
        link = new LinkedPanel(nodes.get(0));
        initComponents();
        add(link);
    }
    
    /*
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(link.getPreferredSize()
        );
        setResizable(false);
        getContentPane().setLayout(new java.awt.CardLayout());

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CompScenarioSim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CompScenarioSim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CompScenarioSim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CompScenarioSim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new CompScenarioSim(new File(System.getProperty("user.dir") + "/src/lab8/lab8.txt")).setVisible(true);
                } catch (FileNotFoundException ex) {
                    System.out.println("Error: file not found" + ex);
                    System.out.println(System.getProperty("user.dir"));
                }
                //new CompScenarioSim().setVisible(true);
            }
        });
    }

    private LinkedPanel link;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
