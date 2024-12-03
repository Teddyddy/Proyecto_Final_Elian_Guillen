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
    private int hp;
    private int atk;
    private int def;
    private int intel;
    private int res;
    
    public Enemigos (String nombre, int hp, int atk, int def, int intel, int res) {
        this.nombre = nombre;
        this.hp = hp;
        this.atk = atk;
        this.def = def;
        this.intel = intel;
        this.res = res;
    }
    
    public String Getnombre() {
        return nombre;
    }
    
    public int Gethp() {
        return hp;
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
    
    public int Getres() {
        return res;
    }
    
    public void Setnombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void Sethp(int hp) {
        this.hp = hp;
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
    
    public void Setres(int res) {
        this.res = res;
    }
}
