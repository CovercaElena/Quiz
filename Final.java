
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Elena
 */
public class Final extends javax.swing.JFrame {

    /**
     * Creates new form Inregistrare
     */
    public Final() {
        initComponents();
    }
    
      public Final(BTree players, QTree questions, String nume,String punctaj) {
        initComponents();
        Name.setText(nume);
        Punctaj.setText(punctaj);
        Integer p=Integer.parseInt(punctaj);
        this.players=players;
        this.questions=questions;
        
        this.players.setPlayerScore(nume,p);
       ( this.players).writeTree();
        BTree aux=new BTree(3);
        aux=Read.readPlayersFile(3);
        this.players=aux;
        List<Player>list=new ArrayList<>();
        list=this.players.getTopPlayers();
        String clasament="";
        String puncte="";
        for(Player p1:list)
        {   if(!p1.getName().equals("Admin"))
        {   puncte="";
            for(int i=1;i<p1.points.size()-1;i++)
            
                puncte+=p1.points.get(i)+",";
                puncte+=p1.points.get(p1.points.size()-1);
                
            clasament=clasament+p1.name+","+puncte+"\n";
        }
            
        }
        Clasament.setText(clasament);
        
    }
      
     BTree players;
    QTree questions;
    List<Integer>numbers;

    public BTree getPlayers() {
        return players;
    }

    public void setPlayers(BTree players) {
        this.players = players;
    }

    public QTree getQuestions() {
        return questions;
    }

    public void setQuestions(QTree questions) {
        this.questions = questions;
    }

    public List<Integer> getNumbers() {
        return numbers;
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        Clasament = new javax.swing.JTextArea();
        Punctaj = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Name = new javax.swing.JTextField();
        Back = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(700, 700));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jLabel4.setText("Clasament");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 270, 174, 37));

        Clasament.setColumns(20);
        Clasament.setRows(5);
        getContentPane().add(Clasament, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 310, 360, 280));

        Punctaj.setBackground(new java.awt.Color(0, 153, 153));
        Punctaj.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        Punctaj.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 102, 102)));
        Punctaj.setDragEnabled(true);
        Punctaj.setEnabled(false);
        Punctaj.setOpaque(false);
        Punctaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PunctajActionPerformed(evt);
            }
        });
        getContentPane().add(Punctaj, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 190, 130, -1));

        jLabel2.setFont(new java.awt.Font("Georgia", 0, 24)); // NOI18N
        jLabel2.setText("Felicitari!");
        jLabel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 80, 160, -1));

        jLabel3.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jLabel3.setText("Ai obtinut:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 190, 174, 37));

        Name.setBackground(new java.awt.Color(0, 153, 153));
        Name.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 102, 102)));
        Name.setDragEnabled(true);
        Name.setOpaque(false);
        Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameActionPerformed(evt);
            }
        });
        getContentPane().add(Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, 273, 40));

        Back.setBackground(new java.awt.Color(0, 178, 178));
        Back.setFont(new java.awt.Font("Georgia", 3, 12)); // NOI18N
        Back.setForeground(new java.awt.Color(86, 90, 93));
        Back.setText("Back");
        Back.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 204, 204), new java.awt.Color(0, 204, 204), null, null));
        Back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackMouseClicked(evt);
            }
        });
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        getContentPane().add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 600, 90, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cat.jpeg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 320, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameActionPerformed

    private void BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseClicked
        // TODO add your handling code here:
        Hello f=new Hello();
        f.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_BackMouseClicked

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BackActionPerformed

    private void PunctajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PunctajActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PunctajActionPerformed

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
            java.util.logging.Logger.getLogger(Inregistrare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inregistrare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inregistrare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inregistrare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inregistrare().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JTextArea Clasament;
    private javax.swing.JTextField Name;
    private javax.swing.JTextField Punctaj;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}