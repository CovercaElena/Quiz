
import java.util.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Elena
 */
public class Question3 extends javax.swing.JFrame {

    /**
     * Creates new form Question1
     */
    public Question3() {
        initComponents();
    }
    
    BTree players;
    QTree questions;
    List<Integer>numbers;
    
    public Question3(BTree players, QTree questions, String nume,List<Integer>numbers,String punctaj)
    {
        initComponents();
        this.players=players;
        this.questions=questions;
        Name.setText(nume);
        this.numbers=numbers;
        Punctaj.setText(punctaj);
        Integer x=numbers.get(2);
        Question q=questions.findQuestionById(x);
        Txt.setText(q.getText());
        A.setText(q.getOpt1());
        B.setText(q.getOpt2());
        C.setText(q.getOpt3());
        D.setText(q.getOpt4());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        Check = new javax.swing.JButton();
        Next = new javax.swing.JButton();
        Punctaj = new javax.swing.JTextField();
        A = new javax.swing.JRadioButton();
        B = new javax.swing.JRadioButton();
        D = new javax.swing.JRadioButton();
        C = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Stat = new javax.swing.JTextArea();
        Txt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Name = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(700, 700));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Check.setBackground(new java.awt.Color(0, 178, 178));
        Check.setFont(new java.awt.Font("Georgia", 3, 12)); // NOI18N
        Check.setForeground(new java.awt.Color(86, 90, 93));
        Check.setText("Check");
        Check.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 204, 204), new java.awt.Color(0, 204, 204), null, null));
        Check.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CheckMouseClicked(evt);
            }
        });
        Check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckActionPerformed(evt);
            }
        });
        getContentPane().add(Check, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 380, 150, 30));

        Next.setBackground(new java.awt.Color(0, 178, 178));
        Next.setFont(new java.awt.Font("Georgia", 3, 12)); // NOI18N
        Next.setForeground(new java.awt.Color(86, 90, 93));
        Next.setText("Next");
        Next.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 204, 204), new java.awt.Color(0, 204, 204), null, null));
        Next.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NextMouseClicked(evt);
            }
        });
        Next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextActionPerformed(evt);
            }
        });
        getContentPane().add(Next, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 570, 90, 30));

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
        getContentPane().add(Punctaj, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, 130, 30));

        A.setBackground(new java.awt.Color(0, 153, 153));
        buttonGroup1.add(A);
        A.setFont(new java.awt.Font("Georgia", 0, 16)); // NOI18N
        A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AActionPerformed(evt);
            }
        });
        getContentPane().add(A, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, 280, 30));

        B.setBackground(new java.awt.Color(0, 153, 153));
        buttonGroup1.add(B);
        B.setFont(new java.awt.Font("Georgia", 0, 16)); // NOI18N
        getContentPane().add(B, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, 280, 30));

        D.setBackground(new java.awt.Color(0, 153, 153));
        buttonGroup1.add(D);
        D.setFont(new java.awt.Font("Georgia", 0, 16)); // NOI18N
        getContentPane().add(D, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 310, 280, -1));

        C.setBackground(new java.awt.Color(0, 153, 153));
        buttonGroup1.add(C);
        C.setFont(new java.awt.Font("Georgia", 0, 16)); // NOI18N
        getContentPane().add(C, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 270, 280, 30));

        jLabel3.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jLabel3.setText("Punctaj:");
        jLabel3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, 90, -1));

        jScrollPane1.setBackground(new java.awt.Color(0, 153, 153));
        jScrollPane1.setEnabled(false);
        jScrollPane1.setOpaque(false);

        Stat.setColumns(20);
        Stat.setRows(5);
        jScrollPane1.setViewportView(Stat);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 430, 250, 100));

        Txt.setBackground(new java.awt.Color(0, 153, 153));
        Txt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Txt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 102, 102)));
        Txt.setDragEnabled(true);
        Txt.setEnabled(false);
        Txt.setOpaque(false);
        Txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtActionPerformed(evt);
            }
        });
        getContentPane().add(Txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 570, 40));

        jLabel2.setFont(new java.awt.Font("Georgia", 0, 24)); // NOI18N
        jLabel2.setText("Intrebarea 3");
        jLabel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, 190, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cat.jpeg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Name.setBackground(new java.awt.Color(0, 153, 153));
        Name.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 102, 102)));
        Name.setDragEnabled(true);
        Name.setEnabled(false);
        Name.setOpaque(false);
        Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameActionPerformed(evt);
            }
        });
        getContentPane().add(Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 220, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameActionPerformed

    private void TxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtActionPerformed

    private void PunctajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PunctajActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PunctajActionPerformed

    private void NextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NextMouseClicked
        // TODO add your handling code here:
         Question4 f=new Question4(players,questions,Name.getText(),numbers,Punctaj.getText());
        f.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_NextMouseClicked

    private void NextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextActionPerformed
        // TODO add your handling code here:
     
    }//GEN-LAST:event_NextActionPerformed

    private void CheckMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CheckMouseClicked
        // TODO add your handling code here:
         Integer x=numbers.get(2);
        Question q=questions.findQuestionById(x);
        
            if(q.getRasp().equals("A"))
                if(A.isSelected())
        {
            Stat.setText("Raspuns corect!");
            Integer p=Integer.parseInt(Punctaj.getText());
            p=p+10;
            Punctaj.setText(p.toString());
        }
            else
                {
                    Stat.setText("raspuns gresit!Raspuns corect: "+A.getText());
                }
            
            
             if(q.getRasp().equals("B"))
                if(B.isSelected())
        {
            Stat.setText("Raspuns corect!");
            Integer p=Integer.parseInt(Punctaj.getText());
            p=p+10;
            Punctaj.setText(p.toString());
        }
            else
                {
                    Stat.setText("raspuns gresit!Raspuns corect: "+B.getText());
                }
             
             
                if(q.getRasp().equals("C"))
                if(C.isSelected())
        {
            Stat.setText("Raspuns corect!");
            Integer p=Integer.parseInt(Punctaj.getText());
            p=p+10;
            Punctaj.setText(p.toString());
        }
            else
                {
                    Stat.setText("raspuns gresit!Raspuns corect: "+C.getText());
                }
            
            
            
            
       
    }//GEN-LAST:event_CheckMouseClicked

    private void CheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CheckActionPerformed

    private void AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AActionPerformed

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
            java.util.logging.Logger.getLogger(Question1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Question1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Question1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Question1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Question1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton A;
    private javax.swing.JRadioButton B;
    private javax.swing.JRadioButton C;
    private javax.swing.JButton Check;
    private javax.swing.JRadioButton D;
    private javax.swing.JTextField Name;
    private javax.swing.JButton Next;
    private javax.swing.JTextField Punctaj;
    private javax.swing.JTextArea Stat;
    private javax.swing.JTextField Txt;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
