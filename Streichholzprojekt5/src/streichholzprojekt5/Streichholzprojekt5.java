/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streichholzprojekt5;

/**
 *
 * @author lynnbo
 */
public class Streichholzprojekt5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Oberflaeche o= new Oberflaeche();
        //zeichnen o= new zeichnen();
        o.setVisible(true);
        Berechnung.berechnen();
    }
    
}
