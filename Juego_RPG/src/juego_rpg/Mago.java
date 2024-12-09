/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juego_rpg;

/**
 *
 * @author elianguillen
 */
public class Mago {
    private boolean Fuego;
    private boolean Regen;
    private boolean Debilitar;
    private boolean Incinerar;
    
    public Mago (boolean Fuego, boolean Regen, boolean Debilitar, boolean Incinerar) {
        this.Fuego=Fuego;
        this.Regen=Regen;
        this.Debilitar=Debilitar;
        this.Incinerar=Incinerar;
    }
    
    public boolean Getfuego () {
        return Fuego;
    }
    
    public boolean Getregen () {
        return Regen;
    }
    
    public boolean Getdebilitar () {
        return Debilitar;
    }
    
    public boolean Getincinerar () {
        return Incinerar;
    }
    
    public void Setfuego (boolean fuego) {
        this.Fuego = fuego;
    }
    
    public void Setregen (boolean regen) {
        this.Regen = regen;
    }
    
    public void Setdebilitar (boolean debilitar) {
        this.Debilitar = debilitar;
    }
    
    public void Setincinerar (boolean incinerar) {
        this.Incinerar = incinerar;
    }
    
    
    
}
