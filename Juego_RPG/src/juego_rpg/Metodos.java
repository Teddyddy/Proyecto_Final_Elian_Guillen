/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juego_rpg;
import java.util.Scanner;

/**
 *
 * @author elianguillen
 */
public class Metodos {
    public static int levelup (Jugador usuario) {
        Scanner scan = new Scanner (System.in);
        int lvlup = 0;
        int exp = usuario.Getexp();
        int lvl = usuario.Getlvl();
        int maxhp = usuario.Getmaxhp();
        int atk = usuario.Getatk();
        int def = usuario.Getdef();
        int intel = usuario.Getintel();
        lvl = lvl +1;
        maxhp = maxhp +5;
        atk = atk + 1;
        def = def +1;
        intel = intel +1;
        exp = exp - 100;
        System.out.println("Felicidades! ha subido de nivel!");
        System.out.println("Todas sus estadisticas han mejorado un poco!");
        System.out.println("Escoga cual estadistica desea mejorar aun mas!");
        do {
            System.out.println("1) HP + 5");
            System.out.println("2) DEF + 4");
            System.out.println("3) ATK + 4");
            System.out.println("4) INT + 4");
            System.out.print("su eleccion? ");
            lvlup = scan.nextInt();
            if (lvlup < 0 || lvlup > 4) {
                System.out.println("Error. intente de nuevo.");
            }
        } while (lvlup < 0 || lvlup > 4);
        if (lvlup == 1) {
            maxhp = maxhp + 5;
        }
        else if (lvlup == 2) {
            def = def + 4;
        }
        else if (lvlup == 3) {
            atk = atk + 4;
        }
        else if (lvlup == 4) {
            intel = intel +4;
        }
        usuario.Setlvl(lvl);
        usuario.Setmaxhp(maxhp);
        usuario.Setdef(def);
        usuario.Setatk(atk);
        usuario.Setintel(intel);
        return exp;
    }
}
