/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juego_rpg;
import java.util.Random;
/**
 *
 * @author elianguillen
 */
public class Calculodaño {
    
    public static int Daño (int atk, int defenemigo) {
        Random rand = new Random ();
        int daño = atk - (defenemigo);
        int critico = rand.nextInt(1,101);
        if (critico <=5) {
            daño = (int) (daño * 1.5);
        }
        return daño;
    }
    
    public static void imprimir (int[][] a) {
        for (int cont = 0; cont<a.length ; cont++) {
            for (int cont2 = 0; cont2<a.length ; cont2++) {
                System.out.print("[" + a[cont][cont2] + "]");
            }
            System.out.println("");
        }
    }
}
