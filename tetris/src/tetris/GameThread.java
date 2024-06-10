
package tetris;

import java.util.logging.Level;
import java.util.logging.Logger;


public class GameThread extends Thread{
    
    private Gamearea ga;
    private Gameform gf;
    private int score;
    
    public GameThread(Gamearea ga,Gameform gf){
        this.ga=ga;
        this.gf=gf;
        
        gf.scoreUpdate(score);
        
        
    }
    
    
    @Override
    public void run(){
        while(1==1){
            ga.spawnBlock();
            
            while(ga.moveBlockDown())
            {
            
                try {
                    
                    Thread.sleep(500);
                    
                } catch (InterruptedException ex) {
                    
                    return;
                }
            }
            if(ga.outofBounds()){
                Tetris.gameOver(score);
                break;
            }
            ga.moveBlockToBackground();
            score += ga.clearLine();
            gf.scoreUpdate(score);
            
            
        }
    }
}
