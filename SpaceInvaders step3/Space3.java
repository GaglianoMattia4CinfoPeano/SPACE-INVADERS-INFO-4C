/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spaceinvaders;

import java.awt.Canvas;
import java.awt.Color;

/**
 *
 * @author mattia.gagliano
 */
public class Space extends Canvas{
    
    public Space() {
       System.out.println("Imposta lo sfondo");
       setBackground (Color.BLACK);
       setSize(800, 500);
    }
    
}
    

