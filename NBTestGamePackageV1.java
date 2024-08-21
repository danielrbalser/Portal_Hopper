/*
Daniel Balser 
Game Project
 */
package nb.test.gamepackagev1;

import edu.sjcny.gpv1.*;
import java.awt.*;
import javax.swing.JOptionPane;

public class NBTestGamePackageV1 extends DrawableAdapter {  // start class 

    static NBTestGamePackageV1 ge = new NBTestGamePackageV1();
    static GameBoard gb = new GameBoard(ge, "PORTAL_HOPPER");
    static Rocky Rock = new Rocky(0, 40);
    static Rock_Platforms RPF = new Rock_Platforms(0, 0);

    static Green_Coin GC = new Green_Coin(0, 0);
    static Green_Coin GC2 = new Green_Coin(0, 300);
    static Green_Coin GC3 = new Green_Coin(160, 150);
    static Green_Coin GC4 = new Green_Coin(170, 350);
    
    static Green_Coin GC5 = new Green_Coin(330, 300);

    static Portals BP = new Portals(0, 0);
    static Portals BP2 = new Portals(130, 0);
    static Portals BP3 = new Portals(0, 100);
    static Portals BP4 = new Portals(130, 100);
    static Portals BP5 = new Portals(0, 200);
    static Portals BP6 = new Portals(130, 200);
    static Portals BP7 = new Portals(0, 300);
    static Portals BP8 = new Portals(130, 300);

    static Portals BP9 = new Portals(0, 370);
    static Portals BP10 = new Portals(80, 370);

    static Portals BP11 = new Portals(170, 50);
    static Portals BP12 = new Portals(300, 50);
    static Portals BP13 = new Portals(170, 150);
    static Portals BP14 = new Portals(300, 150);
    static Portals BP15 = new Portals(170, 250);
    static Portals BP16 = new Portals(300, 250);
    static Portals BP17 = new Portals(170, 350);
    static Portals BP18 = new Portals(300, 350);

    static Portals BP19 = new Portals(340, 0);
    static Portals BP20 = new Portals(460, 0);
    static Portals BP21 = new Portals(340, 100);
    static Portals BP22 = new Portals(460, 100);
    static Portals BP23 = new Portals(340, 200);
    static Portals BP24 = new Portals(460, 200);
    static Portals BP25 = new Portals(340, 300);
    static Portals BP26 = new Portals(460, 300);

    private boolean visible = true;
    static int count = 15; // a class level variable
    static int points = 0;

    public static void main(String[] args) {//main    
        showGameBoard(gb);
        gb.setBackground(Color.BLACK);

    }//main

    public void draw(Graphics g) {//draw

        RPF.show(g);
        BP.show(g);
        BP2.show(g);
        BP3.show(g);
        BP4.show(g);
        BP5.show(g);
        BP6.show(g);
        BP7.show(g);
        BP8.show(g);
        BP9.show(g);
        BP10.show(g);
        BP11.show(g);
        BP12.show(g);
        BP13.show(g);
        BP14.show(g);
        BP15.show(g);
        BP16.show(g);
        BP17.show(g);
        BP18.show(g);
        BP19.show(g);
        BP20.show(g);
        BP21.show(g);
        BP22.show(g);
        BP23.show(g);
        BP24.show(g);
        BP25.show(g);
        BP26.show(g);

        GC.show(g);
        GC2.show(g);
        GC3.show(g);
        GC4.show(g);
        GC5.show(g);
        //GC6.show(g);

        Rock.show(g);

        g.setColor(Color.WHITE);
        g.setFont(new Font("Times New Roman", +Font.BOLD, 16));
        g.drawString("time: " + count + "s", 10, 50);
        g.drawString("Score: " + points + "pts", 400, 50);
        g.drawString("START", 30, 485);
        // collisions

//BP 1       
        System.out.println("BP1 x= " + Rock.getX() + " y= " + Rock.getY());
        if (((Rock.getX() >= -20) && (Rock.getX() < -10)) && ((Rock.getY() >= -335) && (Rock.getY() < -325))) {
            System.out.println("collision BP1");
            Rock.getX();
            Rock.getY();
            Rock.setX(Rock.getX() + 215);
            Rock.setY(Rock.getY() + 50);
            score();
        }

//BP 2        
        System.out.println("BP1 x= " + Rock.getX() + " y= " + Rock.getY());
        if (((Rock.getX() >= 70) && (Rock.getX() < 80)) && ((Rock.getY() >= -335) && (Rock.getY() < -325))) {
            System.out.println("collision BP1");
            Rock.getX();
            Rock.getY();
            Rock.setX(Rock.getX() + 115);
            Rock.setY(Rock.getY() + 350);
            score();
        }

//BP 3
        System.out.println("BP3 x= " + Rock.getX() + " y= " + Rock.getY());
        if (((Rock.getX() >= -25) && (Rock.getX() < -15)) && ((Rock.getY() >= -235) && (Rock.getY() < -225))) {// bp3   
            System.out.println("collision BP3");
            Rock.getX();
            Rock.getY();
            Rock.setX(Rock.getX() + 370);
            Rock.setY(Rock.getY() - 100);

        }// bp3

//BP 4        
        System.out.println("BP4 x= " + Rock.getX() + " y= " + Rock.getY());
        if (((Rock.getX() >= 75) && (Rock.getX() < 85)) && ((Rock.getY() >= -235) && (Rock.getY() < -225))) {
            System.out.println("collision BP4");
            Rock.getX();
            Rock.getY();
            Rock.setX(Rock.getX() - 50);
            Rock.setY(Rock.getY() + 200);
            score();
        }

//BP 5       
        System.out.println("BP5 x= " + Rock.getX() + " y= " + Rock.getY());
        if (((Rock.getX() >= -30) && (Rock.getX() < -20)) && ((Rock.getY() >= -135) && (Rock.getY() < -125))) {
            System.out.println("collision BP5");
            Rock.getX();
            Rock.getY();
            Rock.setX(Rock.getX() + 50);
            Rock.setY(Rock.getY() - 200);
            score();
        }

//BP 6        
        System.out.println("BP6 x= " + Rock.getX() + " y= " + Rock.getY());
        if (((Rock.getX() >= 80) && (Rock.getX() < 90)) && ((Rock.getY() >= -135) && (Rock.getY() < -125))) {
            System.out.println("collision BP6");
            Rock.getX();
            Rock.getY();
            Rock.setX(Rock.getX() + 250);
            Rock.setY(Rock.getY() + 100);
            score();

        }

//BP 7       
        System.out.println("BP7 x= " + Rock.getX() + " y= " + Rock.getY());
        if (((Rock.getX() >= -25) && (Rock.getX() < -15)) && ((Rock.getY() >= -35) && (Rock.getY() < -25))) {
            System.out.println("collision BP7");
            Rock.getX();
            Rock.getY();
            Rock.setX(Rock.getX() + 220);
            Rock.setY(Rock.getY() - 250);

        }

//BP 8       
        System.out.println("BP8 x= " + Rock.getX() + " y= " + Rock.getY());
        if (((Rock.getX() >= 75) && (Rock.getX() < 85)) && ((Rock.getY() >= -35) && (Rock.getY() < -25))) {
            System.out.println("collision BP8");
            Rock.getX();
            Rock.getY();
            Rock.setX(Rock.getX() + 115);
            Rock.setY(Rock.getY() - 50);

        }

//BP 9        
        System.out.println("BP9 x= " + Rock.getX() + " y= " + Rock.getY());
        if (((Rock.getX() >= -21) && (Rock.getX() < 0)) && ((Rock.getY() >= 35) && (Rock.getY() < 45))) {
            //  System.out.println("no collision");
            System.out.println("collision BP9");
            int x = 40;
            int y = -230;
            Rock.setX(x);
            Rock.setY(y);
        }

//BP 10
        System.out.println("BP10 x= " + Rock.getX() + " y= " + Rock.getY());
        if (((Rock.getX() >= 25) && (Rock.getX() < 35)) && ((Rock.getY() >= 35) && (Rock.getY() < 45))) {
            System.out.println("collision BP10");
            Rock.getX();
            Rock.getY();
            Rock.setX(Rock.getX() + 330);
            Rock.setY(Rock.getY() - 70);
            score();
        }

//BP 11
        System.out.println("BP11 x= " + Rock.getX() + " y= " + Rock.getY());
        if (((Rock.getX() >= 145) && (Rock.getX() < 155)) && ((Rock.getY() >= -285) && (Rock.getY() < -275))) {
            System.out.println("collision BP11");
            Rock.getX();
            Rock.getY();
            Rock.setX(Rock.getX() - 130);
            Rock.setY(Rock.getY() + 320);

        }

//BP 12
        System.out.println("BP12 x= " + Rock.getX() + " y= " + Rock.getY());
        if (((Rock.getX() >= 245) && (Rock.getX() < 255)) && ((Rock.getY() >= -285) && (Rock.getY() < -275))) {
            System.out.println("collision BP12");
            Rock.getX();
            Rock.getY();
            Rock.setX(Rock.getX() + 110);
            Rock.setY(Rock.getY() + 50);

        }

//BP 13
        System.out.println("BP13 x= " + Rock.getX() + " y= " + Rock.getY());
        if (((Rock.getX() >= 145) && (Rock.getX() < 155)) && ((Rock.getY() >= -185) && (Rock.getY() < -175))) {//bp13
            System.out.println("collision BP13");
            Rock.getX();
            Rock.getY();
            Rock.setX(Rock.getX() - 110);
            Rock.setY(Rock.getY() + 50);

        }//bp13

//BP 14
        System.out.println("BP20 x= " + Rock.getX() + " y= " + Rock.getY());
        if (((Rock.getX() >= 245) && (Rock.getX() < 255)) && ((Rock.getY() >= -185) && (Rock.getY() < -175))) {//bp14
            System.out.println("collision BP20");
            Rock.getX();
            Rock.getY();
            Rock.setX(Rock.getX() - 220);
            Rock.setY(Rock.getY() - 50);

        }//bp14

//BP 15        
        System.out.println("BP15 x= " + Rock.getX() + " y= " + Rock.getY());
        if (((Rock.getX() >= 140) && (Rock.getX() < 150)) && ((Rock.getY() >= -85) && (Rock.getY() < -75))) {
            //  System.out.println("no collision");
            System.out.println("collision BP15");
            Rock.getX();
            Rock.getY();
            Rock.setX(Rock.getX() + 215);
            Rock.setY(Rock.getY() - 250);

        }

//BP 16       
        System.out.println("BP16 x= " + Rock.getX() + " y= " + Rock.getY());
        if (((Rock.getX() >= 220) && (Rock.getX() < 230)) && ((Rock.getY() >= -85) && (Rock.getY() < -75))) {
            //  System.out.println("no collision");
            System.out.println("collision BP16");
            Rock.getX();
            Rock.getY();
            Rock.setX(Rock.getX() - 20);
            Rock.setY(Rock.getY() + 100);
            score();
        }

//BP 17       
        System.out.println("BP17 x= " + Rock.getX() + " y= " + Rock.getY());
        if (((Rock.getX() >= 140) && (Rock.getX() < 150)) && ((Rock.getY() >= 15) && (Rock.getY() < 25))) {
            //  System.out.println("no collision");
            System.out.println("collision BP17");
            Rock.getX();
            Rock.getY();
            Rock.setX(Rock.getX() - 100);
            Rock.setY(Rock.getY() - 350);
            score();
        }

//BP 18       
        System.out.println("BP18 x= " + Rock.getX() + " y= " + Rock.getY());
        if (((Rock.getX() >= 245) && (Rock.getX() < 255)) && ((Rock.getY() >= 15) && (Rock.getY() < 25))) {
            //  System.out.println("no collision");
            System.out.println("collision BP18");
            Rock.getX();
            Rock.getY();
            Rock.setX(Rock.getX() - 250);
            Rock.setY(Rock.getY() - 150);

        }

//BP 19              
        System.out.println("BP19 x= " + Rock.getX() + " y= " + Rock.getY());
        if (((Rock.getX() >= 315) && (Rock.getX() < 325)) && ((Rock.getY() >= -335) && (Rock.getY() < -325))) {//bp19
            System.out.println("collision BP19");
            Rock.getX();
            Rock.getY();
            Rock.setX(Rock.getX() + 50);
            Rock.setY(Rock.getY() + 200);
        }// bp19

//BP 20
        System.out.println("BP20 x= " + Rock.getX() + " y= " + Rock.getY());
        if (((Rock.getX() >= 405) && (Rock.getX() < 415)) && ((Rock.getY() >= -335) && (Rock.getY() < -325))) {
            System.out.println("collision BP20");
            Rock.getX();
            Rock.getY();
            Rock.setX(Rock.getX() - 220);
            Rock.setY(Rock.getY() + 150);
            score();
        }

//BP 21
        System.out.println("BP21 x= " + Rock.getX() + " y= " + Rock.getY());
        if (((Rock.getX() >= 310) && (Rock.getX() < 320)) && ((Rock.getY() >= -235) && (Rock.getY() < -225))) {
            System.out.println("collision BP21");
            Rock.getX();
            Rock.getY();
            Rock.setX(Rock.getX() - 120);
            Rock.setY(Rock.getY() + 150);

        }

//BP 22
        System.out.println("BP22 x= " + Rock.getX() + " y= " + Rock.getY());
        if (((Rock.getX() >= 410) && (Rock.getX() < 420)) && ((Rock.getY() >= -235) && (Rock.getY() < -225))) {
            System.out.println("collision BP22");
            Rock.getX();
            Rock.getY();
            Rock.setX(Rock.getX() - 50);
            Rock.setY(Rock.getY() + 200);
            score();
        }

//BP 23
        System.out.println("BP23 x= " + Rock.getX() + " y= " + Rock.getY());
        if (((Rock.getX() >= 310) && (Rock.getX() < 320)) && ((Rock.getY() >= -135) && (Rock.getY() < -125))) {
            System.out.println("collision BP23");
            Rock.getX();
            Rock.getY();
            Rock.setX(Rock.getX() - 100);
            Rock.setY(Rock.getY() - 150);

        }

//BP 24
        System.out.println("BP24 x= " + Rock.getX() + " y= " + Rock.getY());
        if (((Rock.getX() >= 405) && (Rock.getX() < 415)) && ((Rock.getY() >= -135) && (Rock.getY() < -125))) {
            System.out.println("collision BP24");
            Rock.getX();
            Rock.getY();
            Rock.setX(Rock.getX() - 400);
            Rock.setY(Rock.getY() + 100);
            score();
        }

//BP 25
        System.out.println("BP25 x= " + Rock.getX() + " y= " + Rock.getY());
        if (((Rock.getX() >= 310) && (Rock.getX() < 320)) && ((Rock.getY() >= -35) && (Rock.getY() < -25))) {
            System.out.println("collision BP25");
            Rock.getX();
            Rock.getY();
            Rock.setX(Rock.getX() - 120);
            Rock.setY(Rock.getY() - 150);
            score();
        }

//BP 26
        System.out.println("BP26 x= " + Rock.getX() + " y= " + Rock.getY());
        if (((Rock.getX() >= 410) && (Rock.getX() < 420)) && ((Rock.getY() >= -35) && (Rock.getY() < -25))) {
            System.out.println("collision BP26");
            Rock.getX();
            Rock.getY();
            Rock.setX(Rock.getX() - 50);
            Rock.setY(Rock.getY() - 200);

        }
//GC 
        /*if (((Rock.getX() >= 193) && (Rock.getX() < 197)) && ((Rock.getY() >= -182) && (Rock.getY() < -178))) {
            GC3.getX();
            GC3.getY();
            GC3.setX(GC3.getX() - 1000);
            GC3.setY(GC3.getY() - 1000);
            score();
        }
        if (((Rock.getX() >= 28) && (Rock.getX() < 32)) && ((Rock.getY() >= -32) && (Rock.getY() < -28))) {
            GC2.getX();
            GC2.getY();
            GC2.setX(GC2.getX() + 1000);
            GC2.setY(GC2.getY() - 1000);
            score();
        }
        if (((Rock.getX() >= 20) && (Rock.getX() < 40)) && ((Rock.getY() >= -332) && (Rock.getY() < -328))) {
            GC.getX();
            GC.getY();
            GC.setX(GC.getX() + 1000);
            GC.setY(GC.getY() - 1000);
            score();
        }
        if (((Rock.getX() >= 358) && (Rock.getX() < 362)) && ((Rock.getY() >= -32) && (Rock.getY() < -28))) {
            GC6.getX();
            GC6.getY();
            GC6.setX(GC6.getX() - 1000);
            GC6.setY(GC6.getY() - 1000);
            score();
        }
      
         */

    }//end draw

    public void rightButton() {//right button
        moveRight(Rock);
    }//right button

    public void moveRight(Rocky aRocky) {//move right
        int currentX = aRocky.getX();
        currentX = currentX + 10;
        aRocky.setX(currentX);

    }//move right

    public void leftButton() {//left button
        moveLeft(Rock);
    }//left button

    public void moveLeft(Rocky aRocky) {//move left
        int currentX = aRocky.getX();
        currentX = currentX - 10;
        aRocky.setX(currentX);
    }//move left

    public void keyStruck(char key) {//keystruck
        switch (key) {//switch
            case 'D':
            case 'd':
                moveRight(Rock);
                break;
            case 'a':
            case 'A':
                moveLeft(Rock);
        }//switch
    }//keystruck

    public void timer1() {//timer
        count = count - 1;
        if (count == 0) {
            JOptionPane.showMessageDialog(null, "YOU LOSE");
        }
        if (count == -1) {//if
            count = 15;
        }//if

    }// timer

    public void score() {//points

        points = points + 100;
        if (points == 400) {
            JOptionPane.showMessageDialog(null, "Contratulations you win");
        }
        //ADD COLLISION WITH GREEN COIN
    }//points

    public boolean getVisible() { //get visible

        return visible;
    }// get visible

    public void setVisible(boolean newVisible) {// set visible
        visible = newVisible;
    }// set visible
}// end class

