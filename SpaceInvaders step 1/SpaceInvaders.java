/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spaceinvaders;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

/**
 *
 * @author mattia.gagliano
 */
public class SpaceInvaders extends JFrame{
    
    public SpaceInvaders(){
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Intro intro = new Intro();
        this.add(intro);
        this.pack();
        this.setVisible(true);
        intro.run();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new SpaceInvaders();
    }
    
}
