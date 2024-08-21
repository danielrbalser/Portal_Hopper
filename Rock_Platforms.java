/*
Daniel Balser
Rock Platforms
 */
package nb.test.gamepackagev1;

import java.awt.Color;
import java.awt.Graphics;

public class Rock_Platforms {// start class
    private int x=0;
    private int y=0;
    private Object g;
     
    public Rock_Platforms(int x, int y) {// start background method  
        this.x = x;
        this.y = y;
    }// end background method

    public void show(Graphics g) {//start show 
       g.setColor(Color.GRAY);
       g.fillRect(x+10, y+ 470, 100,20);
      
       g.fillRect(x+10, y+ 100, 150,20);
       g.fillRect(x+10, y+ 200, 150,20);
       g.fillRect(x+10, y+ 300, 150,20);
       g.fillRect(x+10, y+ 400, 150,20);
       
       g.fillRect(x+180, y+ 150, 150,20);
       g.fillRect(x+180, y+ 250, 150,20);
       g.fillRect(x+180, y+ 350, 150,20);
       g.fillRect(x+180, y+ 450, 150,20);
       
       g.fillRect(x+350, y+ 100, 140,20);
       g.fillRect(x+350, y+ 200, 140,20);
       g.fillRect(x+350, y+ 300, 140,20);
       g.fillRect(x+350, y+ 400, 140,20);
       
       
       
       
       
    }// end show
}// start class
