
package tetris;

import javax.swing.JOptionPane;

public class Tetris {

    private static Gameform gf;
    private static Startmenu sf;
    private static Leaderboard lf;
    private static Contact contact;
    
    
    public static void start(){
        gf.setVisible(true);
        gf.startGame();
        
        
    }

    
    public static void showStartup(){
        sf.setVisible(true);
    }
    
    public static void gameOver(int score){
        String name = JOptionPane.showInputDialog("write your name");
        
        JOptionPane.showMessageDialog(null, "YOU ARE LOSER", "ERROR 404", JOptionPane.INFORMATION_MESSAGE);
        gf.setVisible(false);
        lf.addPlayer(name,score);
        
    }
    
    public static void Leaderboard(){
        lf.setVisible(true);
    
    }
    
    public static void Contact(){
        contact.setVisible(true);
    
    }
    public static void main(String[] args) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                gf=new Gameform();
                sf=new Startmenu();
                lf=new Leaderboard();
                sf.setVisible(true);
                contact= new Contact();
            }
        });
  
    }
    
}
