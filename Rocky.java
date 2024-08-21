/*
Daniel Balser
Rocky Class
 */
package nb.test.gamepackagev1;

import java.awt.*;

public class Rocky {



    private int x = 0;
    private int y = 0;
    private Object g;

    public Rocky(int x, int y) {// start background method  
        this.x = x;
        this.y = y;
    }// end background method

    public void show(Graphics g) {//start show 
        g.setColor(Color.GRAY);
        g.fillOval(x + 40, y + 395, 30, 30);
     
       g.setColor(Color.DARK_GRAY);
       g.fillOval(x+ 43, y+ 399, 10, 10);
       g.fillOval(x+ 56, y+ 412, 10, 10);
       g.fillOval(x+ 45, y+ 410, 10, 10);

       
       g.setColor(Color.BLACK);
       g.fillOval(x+ 48, y+ 403, 10, 10);
       g.fillOval(x+ 53, y+ 415, 10, 10);
       g.fillOval(x+ 58, y+ 400, 10, 10);    
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

    boolean getVisible() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
  
            
}// end class
