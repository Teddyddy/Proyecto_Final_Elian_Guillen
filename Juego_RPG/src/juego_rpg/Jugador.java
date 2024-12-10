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
public class Jugador {
    private String nombre;
    private String clase;
    private int exp;
    private int lvl;
    private int maxhp;
    private int atk;
    private int def;
    private int intel;
    
    public Jugador (String nombre, String clase, int exp, int lvl, int maxhp, int atk, int def, int intel) {
        this.nombre = nombre;
        this.clase = clase;
        this.exp = 0;
        this.lvl = 1;
        this.maxhp = maxhp;
        this.atk = atk;
        this.def = def;
        this.intel = intel;
    }
    
    public String Getnombre() {
        return nombre;
    }
    
    public String Getclase() {
        return clase;
    }
    
    public int Getexp() {
        return exp;
    }
    
    public int Getlvl() {
        return lvl;
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
    
    public int Getintel() {
        return intel;
    }
    
    public void Setnombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void Setclase(String clase) {
        this.clase = clase;
    }
    
    public void Setexp(int exp) {
        this.exp = exp;
    }
    
    public void Setlvl(int lvl) {
        this.lvl = lvl;
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
    
    public void Setintel(int intel) {
        this.intel = intel;
    }
    
    @Override
    public String toString() {
        return "Estadisticas del Jugador: " + '\n' +
                "Nombre=" + nombre + '\n' +
                "Nivel=" + lvl + '\n' +
                "EXP=" + exp + '\n' +
                "HP=" + maxhp + '\n' +
                "Atk=" + atk + '\n' +
                "Def=" + def + '\n' +
                "Int=" + intel;
    }
}
