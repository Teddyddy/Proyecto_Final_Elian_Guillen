/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juego_rpg;

/**
 *
 * @author elianguillen
 */
public class Caballero {
    private boolean Bloqueo;
    private boolean Grito;
    private boolean Directo;
    private boolean Giro;
    
    public Caballero (boolean Bloqueo, boolean Grito, boolean Directo, boolean Giro) {
        this.Bloqueo=Bloqueo;
        this.Grito=Grito;
        this.Directo=Directo;
        this.Giro=Giro;
    }
    
    public boolean Getbloqueo () {
        return Bloqueo;
    }
    
    public boolean Getgrito () {
        return Grito;
    }
    
    public boolean Getdirecto () {
        return Directo;
    }
    
    public boolean Getgiro () {
        return Giro;
    }
    
    public void Setbloqueo (boolean bloqueo) {
        this.Bloqueo = bloqueo;
    }
    
    public void Setgrito (boolean grito) {
        this.Grito = grito;
    }
    
    public void Setdirecto (boolean directo) {
        this.Directo = directo;
    }
    
    public void Setgiro (boolean giro) {
        this.Giro = giro;
    }
}
