/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;

/**
 *
 * @author Elena
 */
public class Hello extends javax.swing.JFrame {

    public BTree getPlayers() {
        return Players;
    }

    /**
     * Creates new form Hello
     */
    public void setPlayers(BTree Players) {
        this.Players = Players;
    }

    private static BTree Players;
    public Hello() {
        initComponents();
    }
       public Hello(BTree Players) {
        initComponents();
        this.Players=Players;
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Rules = new javax.swing.JButton();
        Log = new javax.swing.JButton();
        Sign = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(700, 700));
        setMinimumSize(new java.awt.Dimension(700, 700));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Georgia", 0, 24)); // NOI18N
        jLabel1.setText("Bine ați venit!");
        jLabel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 180, 160, -1));

        Rules.setBackground(new java.awt.Color(0, 178, 178));
        Rules.setFont(new java.awt.Font("Georgia", 0, 16)); // NOI18N
        Rules.setText("Regulile jocului");
        Rules.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(250, 240, 241), new java.awt.Color(250, 240, 241), new java.awt.Color(220, 147, 154), new java.awt.Color(220, 147, 154)));
        Rules.setBorderPainted(false);
        Rules.setFocusPainted(false);
        Rules.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RulesMouseClicked(evt);
            }
        });
        getContentPane().add(Rules, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 410, 240, 60));

        Log.setBackground(new java.awt.Color(0, 178, 178));
        Log.setFont(new java.awt.Font("Georgia", 0, 16)); // NOI18N
        Log.setText("Autentificare");
        Log.setBorderPainted(false);
        Log.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogMouseClicked(evt);
            }
        });
        Log.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogActionPerformed(evt);
            }
        });
        getContentPane().add(Log, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 330, 240, 60));

        Sign.setBackground(new java.awt.Color(0, 178, 178));
        Sign.setFont(new java.awt.Font("Georgia", 0, 16)); // NOI18N
        Sign.setText("Înregistrare");
        Sign.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Sign.setBorderPainted(false);
        Sign.setFocusPainted(false);
        Sign.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SignMouseClicked(evt);
            }
        });
        Sign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignActionPerformed(evt);
            }
        });
        getContentPane().add(Sign, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 250, 240, 60));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cat.jpeg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RulesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RulesMouseClicked
        // TODO add your handling code here:
        Reguli f=new Reguli();
        f.setVisible(true);
        this.dispose();
      

    }//GEN-LAST:event_RulesMouseClicked

    private void LogMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogMouseClicked
        // TODO add your handling code here:
        Logare f=new Logare();
        f.setVisible(true);
        this.dispose();
     
    }//GEN-LAST:event_LogMouseClicked

    private void LogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LogActionPerformed

    private void SignMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignMouseClicked
        // TODO add your handling code here:
        Inregistrare f=new Inregistrare();
        f.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_SignMouseClicked

    private void SignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SignActionPerformed

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
            java.util.logging.Logger.getLogger(Hello.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Hello.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Hello.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Hello.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
          
     
  
         
       
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Hello().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Log;
    private javax.swing.JButton Rules;
    private javax.swing.JButton Sign;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
