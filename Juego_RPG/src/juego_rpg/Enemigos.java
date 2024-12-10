/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juego_rpg;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
/**
 *
 * @author elianguillen
 */
public class Enemigos {
    private String nombre;
    private int maxhp;
    private int atk;
    private int def;
    
    
    public Enemigos (String nombre, int maxhp, int atk, int def) {
        this.nombre = nombre;
        this.maxhp = maxhp;
        this.atk = atk;
        this.def = def;
    }
    
    public String Getnombre() {
        return nombre;
    }
    
    public int Getmaxhp() {
        return maxhp;
    }
    
    public int Getatk() {
        return atk;
    }
    
    public int Getdef() {
        return def;
    }

    public void Setnombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void Setmaxhp(int maxhp) {
        this.maxhp = maxhp;
    }
    
    public void Setatk(int atk) {
        this.atk = atk;
    }
    
    public void Setdef(int def) {
        this.def = def;
    }
}
