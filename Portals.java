/*
Daniel Balser
Portals
 */
package nb.test.gamepackagev1;

import java.awt.Color;
import java.awt.Graphics;

public class Portals {// start class

    private int x = 0;
    private int y = 0;
    private Object g;
    int getX;
    static Color my_blue = new Color(0,191,255);   
    
    public Portals(int x, int y) {// start background method  
        this.x = x;
        this.y = y;
    }// end background method

    public void show(Graphics g) {//start show 
        g.setColor(my_blue);

        g.fillOval(x + 10, y + 60, 20, 40);

    }//end show

    public int getX() {// start getX
        return x;
    }// end getX

    public void setX(int newX) {//start setX
        x = newX;
    }// end setX    

    public int getY() {// start getY
        return y;
    }// end getY

    public void setY(int newY) {//start setY
        y = newY;
    }// end setY   

    void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    boolean getVisible() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}//class

