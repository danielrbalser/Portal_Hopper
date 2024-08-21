/*
Daniel Balser
Green Coin
 */
package nb.test.gamepackagev1;

import java.awt.Color;
import java.awt.Graphics;

public class Green_Coin {// start class
    private int x=0;
    private int y=0;
    private Object g;
    int getX;
     
    public Green_Coin (int x, int y) {// start background method  
        this.x = x;
        this.y = y;
    }// end background method

    public void show(Graphics g) {//start show 
    
       g.setColor(Color.GREEN);
       g.fillOval(x+80, y+80, 15, 15);
       }// end show

    public int getX()
    {// start getX
        return x;
    }// end getX
    
    public void setX(int newX)
    {//start setX
        x=newX;
    }// end setX    

    public int getY()
    {// start getY
        return y;
    }// end getY
    
    public void setY(int newY)
    {//start setY
        y=newY;
    }// end setY   
}// start class

