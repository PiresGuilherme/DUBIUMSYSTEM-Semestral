/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dubiumview;

/**
 *
 * @author Cedup 05
 */
public class MapaCamping extends javax.swing.JFrame {

    /**
     * Creates new form MapaCamping
     */
    public MapaCamping() {
        initComponents();
    }

    // MapaCamping mapacamping = new MapaCamping();
      //  mapacamping.setVisible(true);
       // mapacamping.setSize(1080,520);
       // mapacamping.setLocationRelativeTo(null);
     //*/
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        lCamping2 = new javax.swing.JLabel();
        lCamping3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jLabel2.setForeground(new java.awt.Color(255, 37, 37));
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2);
        jLabel2.setBounds(100, 90, 250, 150);

        lCamping2.setForeground(new java.awt.Color(255, 27, 27));
        lCamping2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lCamping2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lCamping2MouseClicked(evt);
            }
        });
        getContentPane().add(lCamping2);
        lCamping2.setBounds(690, 80, 180, 120);

        lCamping3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lCamping3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lCamping3MouseClicked(evt);
            }
        });
        getContentPane().add(lCamping3);
        lCamping3.setBounds(170, 300, 200, 110);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dubiumicons/icons8_camping_96px_1.png"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(170, 130, 110, 70);

        jButton1.setText("Sair");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(913, 433, 80, 30);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dubiumicons/icons8_camping_96px_1.png"))); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(720, 90, 100, 70);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dubiumicons/icons8_camping_96px_1.png"))); // NOI18N
        jLabel10.setText("jLabel10");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(230, 290, 110, 110);

        jLabel6.setBackground(new java.awt.Color(0, 51, 0));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Escolha uma área");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(390, 20, 390, 50);

        jLabel7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 0), 6, true));
        getContentPane().add(jLabel7);
        jLabel7.setBounds(0, 0, 1080, 520);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dubiumicons/Mapacamping.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1080, 520);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        AgendamentoCamping1 camping1 = new AgendamentoCamping1();
        camping1.setVisible(true);
        camping1.setSize(793,596);
        camping1.setLocationRelativeTo(null);
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2MouseClicked

    private void lCamping2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lCamping2MouseClicked
       AgendamentoCamping2 camping2 = new AgendamentoCamping2();
        camping2.setVisible(true);
        camping2.setSize(793,596);
        camping2.setLocationRelativeTo(null);
        
        // TODO add your handling code here:
    }//GEN-LAST:event_lCamping2MouseClicked

    private void lCamping3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lCamping3MouseClicked
       AgendamentoCamping3 camping3 = new AgendamentoCamping3();
        camping3.setVisible(true);
        camping3.setSize(793,596);
        camping3.setLocationRelativeTo(null);
        
        // TODO add your handling code here:
    }//GEN-LAST:event_lCamping3MouseClicked

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
            java.util.logging.Logger.getLogger(MapaCamping.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MapaCamping.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MapaCamping.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MapaCamping.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MapaCamping().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lCamping2;
    private javax.swing.JLabel lCamping3;
    // End of variables declaration//GEN-END:variables
}
