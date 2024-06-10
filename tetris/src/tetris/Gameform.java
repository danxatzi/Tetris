
package tetris;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.JFrame;
import javax.swing.KeyStroke;


public class Gameform extends JFrame {
    private Gamearea ga;
    private GameThread gt;
    

    public Gameform() {
        initComponents();
        ga = new Gamearea(gameAreaPlaceholder,10);
        this.add (ga);
        
        initControls();
        
    }
    
    private void initControls(){
        
        InputMap im = this.getRootPane().getInputMap();
        ActionMap am= this.getRootPane().getActionMap();
        
        im.put(KeyStroke.getKeyStroke("RIGHT"), "right");
        im.put(KeyStroke.getKeyStroke("LEFT"), "left");
        im.put(KeyStroke.getKeyStroke("UP"), "up");
        im.put(KeyStroke.getKeyStroke("DOWN"), "down");

        
        am.put("right", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
               ga.moveBlockRight();
            }
        });
        am.put("left",  new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
               ga.moveBlockLeft();
            }
        });
        am.put("up",  new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
               ga.rotateBlock();
            }
        });
        am.put("down",  new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
               ga.dropBlock();
            }
        });
        
        
 
    }
    
    public void startGame(){
        
        ga.initBackgroundArrayp();    
        gt = new GameThread(ga, this);
        gt.start();
    }

    public void scoreUpdate(int score){
        scoreUpdate.setText("Score" + score);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gameAreaPlaceholder = new javax.swing.JPanel();
        scoreUpdate = new javax.swing.JLabel();
        Menu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 153));
        setResizable(false);

        gameAreaPlaceholder.setBackground(new java.awt.Color(0, 153, 153));
        gameAreaPlaceholder.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        gameAreaPlaceholder.setForeground(new java.awt.Color(0, 0, 0));
        gameAreaPlaceholder.setToolTipText("");

        javax.swing.GroupLayout gameAreaPlaceholderLayout = new javax.swing.GroupLayout(gameAreaPlaceholder);
        gameAreaPlaceholder.setLayout(gameAreaPlaceholderLayout);
        gameAreaPlaceholderLayout.setHorizontalGroup(
            gameAreaPlaceholderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 214, Short.MAX_VALUE)
        );
        gameAreaPlaceholderLayout.setVerticalGroup(
            gameAreaPlaceholderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 294, Short.MAX_VALUE)
        );

        scoreUpdate.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        scoreUpdate.setText("Score:0");

        Menu.setText("Menu");
        Menu.setFocusable(false);
        Menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(scoreUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(gameAreaPlaceholder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Menu)
                .addGap(108, 108, 108))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(gameAreaPlaceholder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scoreUpdate)
                    .addComponent(Menu)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void MenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuActionPerformed
        
        gt.interrupt();
        this.setVisible(false);
        Tetris.showStartup();
    }//GEN-LAST:event_MenuActionPerformed


    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(Gameform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gameform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gameform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gameform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gameform().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Menu;
    private javax.swing.JPanel gameAreaPlaceholder;
    private javax.swing.JLabel scoreUpdate;
    // End of variables declaration//GEN-END:variables
}
