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
public class Berechnung {
    public static void berechnen(){
        
    for (int h = 0; h < 10; h++) {
        
            
       
      int i=5+(int)(Math.random()*95);
      /*Zufallszahl von 5-100 programmiert
      i = Anfangszahl der Streichhölzer
      */
      int zufzahl = i;
      Statisch.zufzahl = zufzahl;
      int lauf = 0;
      Statisch.lauf = lauf;
      
      
        System.out.println(i);
      //Spieler 1 fängt immer an
      
        
        if (i%4!=1) {
           while(i>3){
       if (i%4==1){
           int k=(int)(Math.random()*3+1);
           System.out.println(k+" Ich stand auf einem Nein-Feld");
           i=i-k; //neues i nachdem Spieler 1 gespielt hat
       Statisch.AnzahlStreichholz[lauf] = k;
               lauf++;
       } //es ist egal was der Computer jetzt macht, denn er hat eh verloren
       
       else{
           int m=i%4;
           //m kann 0, 2 oder 3 sein
           if (m==0) {
               int k=3;
              i=i-k;
              Statisch.AnzahlStreichholz[lauf] = 3;
              lauf++;
              
               System.out.println(k+" Ich kann gewinnen");
           } // wenn der Rest gleich 0 ist, müssen 3 Streichhölzer weggenommen werden
           else if (m==2) {
               int k=1;
               i=i-k;
               Statisch.AnzahlStreichholz[lauf] = 2;
               lauf++;
               
                System.out.println(k+" Ich kann gewinnen");
           } // wenn der Rest gleich 2 ist, muss 1 Streichholz weggenommen werden
           else if (m==3) {
               int k=2;
               i=i-k;
               Statisch.AnzahlStreichholz[lauf] = 1;
               lauf++;
                System.out.println(k+" Ich kann gewinnen");
           } //wenn der Rest gleich 3 ist, müssen 2 Streichhölzer weggenommen werden
           /*Folge: Gegenspieler ist auf einem Nein-Feld,
           ab hier braucht Computer nur noch Folgendes machen*/

          
       }
      }
       if (i==3) {
            int k=2;
            i=i-k;
            Statisch.AnzahlStreichholz[lauf] = 2;
               lauf++;
            
        }
        else if (i==2) {
            int k=1;
            i=i-k;
            Statisch.AnzahlStreichholz[lauf] = 1;
               lauf++;
        }
        else if (i==1) {
            int k=1;
            i=i-k;
            Statisch.AnzahlStreichholz[lauf] = 2;
               lauf++;
        } 
            System.out.println("Ich bin der 1. Spieler und habe gewonnen.");
            Statisch.Spiele10[h]=1;
           
            
       
        }
        else{
            while(i>3){
       if (i%4==1){
           int k=(int)(Math.random()*3+1);
           System.out.println(k+" Ich stand auf einem Nein-Feld");
           i=i-k; //neues i nachdem Spieler 1 gespielt hat
       Statisch.AnzahlStreichholz[lauf] = k;
               lauf++;
       } //es ist egal was der Computer jetzt macht, denn er hat eh verloren
       
       else{
           int m=i%4;
           //m kann 0, 2 oder 3 sein
           if (m==0) {
               int k=3;
              i=i-k;
              Statisch.AnzahlStreichholz[lauf] = 3;
               lauf++;
               System.out.println(k+" Ich kann gewinnen");
           } // wenn der Rest gleich 0 ist, müssen 3 Streichhölzer weggenommen werden
           else if (m==2) {
               int k=1;
               i=i-k;
               Statisch.AnzahlStreichholz[lauf] = 1;
               lauf++;
                System.out.println(k+" Ich kann gewinnen");
           } // wenn der Rest gleich 2 ist, muss 1 Streichholz weggenommen werden
           else if (m==3) {
               int k=2;
               i=i-k;
               Statisch.AnzahlStreichholz[lauf] = 2;
               lauf++;
                System.out.println(k+" Ich kann gewinnen");
           } //wenn der Rest gleich 3 ist, müssen 2 Streichhölzer weggenommen werden
           /*Folge: Gegenspieler ist auf einem Nein-Feld,
           ab hier braucht Computer nur noch Folgendes machen*/

          
       }
      }
       if (i==3) {
            int k=2;
            i=i-k;
            Statisch.AnzahlStreichholz[lauf] = 2;
               lauf++;
        }
        else if (i==2) {
            int k=1;
            i=i-k;
            Statisch.AnzahlStreichholz[lauf] = 1;
               lauf++;
        }
        else if (i==1) {
            int k=1;
            i=i-k;
            Statisch.AnzahlStreichholz[lauf] = 1;
               lauf++;
        }
            System.out.println("Ich bin der 2.Spieler und habe gewonnen.");
        }
       /* computer muss nach obigen Bedingungen die Anzahl der Streichhölzer 
       abziehen
       */
        
//wenn der Rest gleich 3 ist, müssen 2 Streichhölzer weggenommen werden
           /*Folge: Gegenspieler ist auf einem Nein-Feld,
           ab hier braucht Computer nur noch Folgendes machen*/
           
           

       //Spiel ist beendet
         
        
        
    }
    
        
    
        int gew1 =0;
        int gew2 =0;
        for (int u = 0; u < 10; u++) {
            if(Statisch.Spiele10[u]==1){
                gew1++;
            }else{
                gew2++;
            }
            System.out.println(""+Statisch.Spiele10[u]);
        }
        System.out.println(""+gew1+ " "+gew2);
        int prozentgew = gew1*10;
        System.out.println(prozentgew+"%");
        
        Statisch.prozentgew=prozentgew;
        
        for (int z = 0; z < 10; z++) { //Resetet die 10 Spiele-Werte im array
            Statisch.Spiele10[z]=2;
        }
        
    }
}
