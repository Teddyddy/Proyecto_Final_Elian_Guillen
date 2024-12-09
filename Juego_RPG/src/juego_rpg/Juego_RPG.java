/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package juego_rpg;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
/**
 *
 * @author elianguillen
 */
public class Juego_RPG {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        Random rand = new Random ();
        // Variables para el Juego
        String nombre= "";
        String clase = "";
        int exp = 0;
        int lvl = 0;
        int maxhp = 0;
        int maxstamina = 0;
        int atk = 0;
        int def = 0;
        int intel = 0;
        int res = 0;
        int claseleccion;
        //Variables para Habilidades
        boolean fuego = false;
        boolean regen = false;
        boolean debilitar = false;
        boolean incinerar = false;
        boolean bloqueo = false;
        boolean grito = false;
        boolean directo = false;
        boolean giro = false;
        //Clases para habilidades
        Caballero knight = new Caballero (bloqueo, grito, directo, giro);
        Mago mage = new Mago (fuego, regen, debilitar, incinerar);
        //Inicio
        System.out.print("Bienvenido(a)! Ingrese su nombre: ");
        nombre = scan.next();
        System.out.println("Escoja su Clase:");
        System.out.println("1) Caballero (utiliza Ataques fisicos con gran defensa y resistencia y habilidades con un enfoque defensivo)");
        System.out.println("2) Mago (utiliza Ataques magicos con gran inteligencia y habilidades con un enfoque ofensivo)");
        do {
            claseleccion = scan.nextInt();
            if (claseleccion == 1) {
                clase = "Caballero";
                System.out.println("Ha elegido la clase de Caballero!");
            }
            else if (claseleccion == 2) {
                clase = "Mago";
                System.out.println("Ha elegido la clase de Mago!");
            }
            else {
                System.out.println("Error al elegir la clase, escoja de nuevo.");
            }
        //estadisticas de clases
        } while (claseleccion != 1 && claseleccion !=2); 
        if (clase.equalsIgnoreCase("Caballero")) {
            exp = 0;
            lvl= 1;
            maxhp = 200;
            maxstamina = 100;
            atk = 50;
            def = 75;
            intel = 25;
            res = 75;
        }
        else if (clase.equalsIgnoreCase("Mago")) {
            exp = 0;
            lvl = 1;
            maxhp = 125;
            maxstamina = 150;
            atk = 25;
            def = 45;
            intel = 80;
            res = 65;
        }
        Jugador usuario = new Jugador (nombre, clase, exp, lvl, maxhp, maxstamina, atk, def, intel, res);
        int hp = maxhp;
        boolean juego = true;
        //ciclo
        do {
            System.out.println("--------Menu--------");
            System.out.println("1) Estadisticas del Jugador:");
            System.out.println("2) Habilidades de Clase");
            System.out.println("3) Batalla random");
            System.out.println("4) Descansar");
            System.out.println("5) Explorar mapa");
            System.out.println("6) Pelear contra Jefe final");
            System.out.println("7) Salir");
            int opcion = scan.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println(usuario.toString());
                    System.out.println("Hit points actuales=" + hp);
                    break;
                
                case 2:
                    usuario.Getclase();
                    System.out.println("Habilidades de " + clase +":");
                    System.out.print("Nivel 5: ");
                    if (clase.equalsIgnoreCase("Caballero")){
                        System.out.print("Bloqueo ");
                        knight.Getbloqueo();
                        if (bloqueo == false) {
                            System.out.println("(no desbloqueado) bloquea todo el daño por el turno");
                        }
                        else if (bloqueo == true) {
                            System.out.println("(desbloqueado) bloquea todo el daño por el turno");
                        }
                    }
                    else{
                        System.out.println("Bola de Fuego ");
                        mage.Getfuego();
                        if (fuego == false) {
                            System.out.println("(no desbloqueado) lanza una bola de fuego");
                        }
                        else if (fuego == true) {
                            System.out.println("(desbloqueado) lanza una bola de fuego");
                        }
                    }
                    System.out.print("Nivel 10: ");
                    if (clase.equalsIgnoreCase("Caballero")){
                        System.out.print("Grito de Guerra ");
                        knight.Getgrito();
                        if (grito == false) {
                            System.out.println("(no desbloqueado) grita para aumentar el daño");
                        }
                        else if (grito == true) {
                            System.out.println("(desbloqueado) grita para aumentar el daño");
                        }
                    }
                    else{
                        System.out.println("Regeneracion ");
                        mage.Getregen();
                        if (regen == false) {
                            System.out.println("(no desbloqueado) regenera el 25% de vida");
                        }
                        else if (regen == true) {
                            System.out.println("(desbloqueado) regenera el 25% de vida");
                        }
                    }
                    System.out.print("Nivel 15: ");
                    if (clase.equalsIgnoreCase("Caballero")){
                        System.out.print("Golpe Directo ");
                        knight.Getdirecto();
                        if (directo == false) {
                            System.out.println("(no desbloqueado) asegura que el siguiente golpe sea un golpe critico");
                        }
                        else if (directo == true) {
                            System.out.println("(desbloqueado) asegura que el siguiente golpe sea un golpe critico");
                        }
                    }
                    else{
                        System.out.println("Debilitar ");
                        mage.Getdebilitar();
                        if (debilitar == false) {
                            System.out.println("(no desbloqueado) debilita al enemigo, cortando su defensa por 5 puntos");
                        }
                        else if (debilitar == true) {
                            System.out.println("(desbloqueado) debilita al enemigo, cortando su defensa por 5 puntos");
                        }
                    }
                    System.out.print("Nivel 20: ");
                    if (clase.equalsIgnoreCase("Caballero")){
                        System.out.print("Corte Giratorio ");
                        knight.Getgiro();
                        if (giro == false) {
                            System.out.println("(no desbloqueado) Lanza un potente golpe giratorio");
                        }
                        else if (giro == true) {
                            System.out.println("(desbloqueado) Lanza un potente golpe giratorio");
                        }
                    }
                    else{
                        System.out.println("Incinerar ");
                        mage.Getincinerar();
                        if (incinerar == false) {
                            System.out.println("(no desbloqueado) envuelve al enemigo en llamas potentes");
                        }
                        else if (incinerar == true) {
                            System.out.println("(desbloqueado) envuelve al enemigo en llamas potentes");
                        }
                    }
                    break;
                
                case 3:
                    System.out.println("Hola Mundo");
                    break;
                
                case 4:
                    hp = maxhp;
                    System.out.println("Descansaste... y regeneraste todos tus puntos de Vida!");
                    break;
                
                case 5:
                    System.out.println("Hola Mundo");
                    break;
                
                case 6:
                    System.out.println("Hola Mundo");
                    break;
                
                default:
                    juego = false;
                    break;
            }
            System.out.println("");
        } while (juego == true);
    }
    
}
