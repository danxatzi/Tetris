
package tetris;

import javax.swing.ImageIcon;



public class Startmenu extends javax.swing.JFrame {
    
    ImageIcon picture = new ImageIcon("logo");
    
   
    public Startmenu() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        StartButton = new javax.swing.JButton();
        Quit = new javax.swing.JButton();
        Leaderboard = new javax.swing.JButton();
        pic = new javax.swing.JLabel();
        call = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        StartButton.setText("Start Game");
        StartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartButtonActionPerformed(evt);
            }
        });

        Quit.setText("Quit");
        Quit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuitActionPerformed(evt);
            }
        });

        Leaderboard.setText("Leaderboard");
        Leaderboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LeaderboardActionPerformed(evt);
            }
        });

        pic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo.png"))); // NOI18N

        call.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image-removebg-preview-fotor-20231113114146.png"))); // NOI18N
        call.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                callActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(195, 195, 195)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(StartButton, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(Leaderboard, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                        .addComponent(Quit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(9, 9, 9)
                            .addComponent(pic, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(195, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(call, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(286, 286, 286))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pic)
                .addGap(18, 18, 18)
                .addComponent(StartButton)
                .addGap(18, 18, 18)
                .addComponent(Leaderboard)
                .addGap(18, 18, 18)
                .addComponent(Quit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(call, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    private void QuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_QuitActionPerformed

    private void StartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartButtonActionPerformed
        
        
        this.setVisible(false);
        Tetris.start();
        
        
    }//GEN-LAST:event_StartButtonActionPerformed

    private void LeaderboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LeaderboardActionPerformed
        this.setVisible(false);
        Tetris.Leaderboard();
    }//GEN-LAST:event_LeaderboardActionPerformed

    private void callActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_callActionPerformed
        this.setVisible(false);
        Tetris.Contact();
    }//GEN-LAST:event_callActionPerformed

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
            java.util.logging.Logger.getLogger(Startmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Startmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Startmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Startmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Startmenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Leaderboard;
    private javax.swing.JButton Quit;
    private javax.swing.JButton StartButton;
    private javax.swing.JButton call;
    private javax.swing.JLabel pic;
    // End of variables declaration//GEN-END:variables
}
