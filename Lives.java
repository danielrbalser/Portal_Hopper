/*
Daniel Balser
Lives
*/

package nb.test.gamepackagev1;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

public class Lives {// start class
    private int x=0;
    private int y=0;
    private Object g;
     
    public Lives(int x, int y) {// start background method  
        this.x = x;
        this.y = y;
    }// end background method

    public void show(Graphics g) {//start show 
       g.setColor(Color.WHITE);
       g.fillOval(x+100, y+100, 20, 20);
       
       Polygon tri = new Polygon();
        tri.addPoint(x+105,y+103);
        tri.addPoint(x+110,y+90);
        tri.addPoint(x+115,y+103);
        g.fillPolygon(tri);
       

        tri.addPoint(x+105,y+113);
        tri.addPoint(x+110,y+131);
        tri.addPoint(x+115,y+113);
        g.fillPolygon(tri);
        
        tri.addPoint(x+115,y+104);
        tri.addPoint(x+130,y+109);
        tri.addPoint(x+115,y+116);
        g.fillPolygon(tri);
        
        tri.addPoint(x+105,y+104);
        tri.addPoint(x+90,y+109);
        tri.addPoint(x+105,y+116);
        g.fillPolygon(tri);
        
        
    }// end show
       
}// end class  