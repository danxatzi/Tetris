
package tetris;

import java.awt.Color;
import java.util.Random;




public class TetrisBlock {
    private int[][] shape;
    private Color color;
    private int x,y;
    
    private int[][][] shapes;
    
    private int CurrentRotation;
    private Color[] moreColors={Color.DARK_GRAY,Color.BLACK,Color.WHITE,Color.red,Color.BLUE,Color.magenta};
    
    public TetrisBlock(int[][] shape){
        this.shape=shape;
        
        initShapes();
    }
    
    private void initShapes(){
        shapes=new int[4][][];
        for(int i=0;i<4;i++){
            int r = shape[0].length;
            int c=shape.length;
            shapes[i]=new int [r][c];
            for(int y=0; y<r;y++){
                for(int x=0;x<c;x++){
                    shapes[i][y][x]=shape[c-x-1][y];
                }
            }
            shape = shapes[i];
        }
        
    }
    
    public void spawn(int gridWidth){
        
        Random r=new Random();
        CurrentRotation= r.nextInt(shapes.length);
        shape=shapes[CurrentRotation];
        
        y=-getHeight();
        x=r.nextInt(gridWidth-getWidth());
        color=moreColors[r.nextInt(moreColors.length)];
    }
    
    
    
    public int[][] getShape(){
        return shape;
    }
    public Color getColor(){
        return color;
    }
    
    public int getHeight(){
        return shape.length;
    }
    public int getWidth(){
        return shape[0].length;
    }
    public int getX(){
        return x;
       
    }

    public void setX(int newX) {
        x = newX;
    }

    public void setY(int newY) {
        y = newY;
    }
    public int getY(){
        return y;
    }
    
    public void moveDown(){
        y++;
    }
    public void moveLeft(){
        x--;
    }
    public void moveRight(){
        x++;
    }
    
    public int getBottomEdge(){
        return y+ getHeight();
    }
    
    public void rotate(){
        CurrentRotation++;
        if(CurrentRotation>3){
            CurrentRotation=0;
        }
        shape = shapes[CurrentRotation];
            
    }
    public int getLeftEdge(){
        return x;
    }
    
    public int getRightEdge(){
        return x+getWidth() ;
    }
     public void rotateBack() {
        CurrentRotation--;
        if (CurrentRotation < 0) {
            CurrentRotation = 3;
        }
        shape = shapes[CurrentRotation];
    }
}
    

