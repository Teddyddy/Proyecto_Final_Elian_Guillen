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
        String nombreenemigo = "";
        String nombre= "";
        String clase = "";
        int hpenemigo = 0;
        int atkenemigo = 0;
        int defenemigo = 0;
        int hp = 0;
        int exp = 0;
        int lvl = 0;
        int maxhp = 0;
        int atk = 0;
        int def = 0;
        int intel = 0;
        int claseleccion;
        int daño = 0;
        //variables de menu
        int dificultad = 0;
        int menupelea = 0;
        int lvlup = 0;
        int peleafinal = 0;
        int movimiento = 0;
        int randomencounter = 0;
        //array de enemigos predeterminado
        ArrayList <Enemigos> enemigos = new ArrayList();
        //
        nombre = "Enemigo Facil";
        maxhp = 75;
        atk = 90;
        def = 30;
        enemigos.add(new Enemigos(nombre, maxhp, atk, def));
        //
        nombre = "Enemigo Medio";
        maxhp = 145;
        atk = 125;
        def = 45;
        enemigos.add(new Enemigos(nombre, maxhp, atk, def));
        //
        nombre = "Enemigo Dificil";
        maxhp = 225;
        atk = 175;
        def = 80;
        enemigos.add(new Enemigos(nombre, maxhp, atk, def));
        //
        nombre = "Jefe Final";
        maxhp = 500;
        atk = 300;
        def = 120;
        enemigos.add(new Enemigos(nombre, maxhp, atk, def));
        //Matriz para mapa
        int[][] mapa = new int[5][5];
        mapa [0][0] = 0;
        mapa [0][1] = 1;
        mapa [0][2] = 1;
        mapa [0][3] = 1;
        mapa [0][4] = 3;
        mapa [1][0] = 1;
        mapa [1][1] = 1;
        mapa [1][2] = 2;
        mapa [1][3] = 2;
        mapa [1][4] = 2;
        mapa [2][0] = 1;
        mapa [2][1] = 1;
        mapa [2][2] = 1;
        mapa [2][3] = 1;
        mapa [2][4] = 3;
        mapa [3][0] = 2;
        mapa [3][1] = 1;
        mapa [3][2] = 1;
        mapa [3][3] = 1;
        mapa [3][4] = 1;
        mapa [4][0] = 2;
        mapa [4][1] = 2;
        mapa [4][2] = 1;
        mapa [4][3] = 1;
        mapa [4][4] = 4;
        //Inicio
        System.out.printf("Bienvenido(a)! Ingrese su nombre: ");
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
            atk = 50;
            def = 75;
            intel = 25;
        }
        else if (clase.equalsIgnoreCase("Mago")) {
            exp = 0;
            lvl = 1;
            maxhp = 125;
            atk = 25;
            def = 55;
            intel = 80;
        }
        Jugador usuario = new Jugador (nombre, clase, exp, lvl, maxhp, atk, def, intel);
        hp = maxhp;
        boolean juego = true;
        //ciclo
        do {
            exp = usuario.Getexp();
            while (exp >= 100) {
                lvl = usuario.Getlvl();
                maxhp = usuario.Getmaxhp();
                atk = usuario.Getatk();
                def = usuario.Getdef();
                intel = usuario.Getintel();
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
                usuario.Setexp(exp);
                usuario.Setlvl(lvl);
                usuario.Setmaxhp(maxhp);
                usuario.Setdef(def);
                usuario.Setatk(atk);
                usuario.Setintel(intel);
            }
            if (hp <= 0) {
                break;
            }
            System.out.println("--------------------");
            System.out.println("HP: " + hp);
            System.out.println("--------Menu--------");
            System.out.println("1) Estadisticas del Jugador:");
            System.out.println("2) Batalla random");
            System.out.println("3) Descansar");
            System.out.println("4) Explorar mapa");
            System.out.println("5) Pelear contra Jefe final");
            System.out.println("6) Salir");
            int opcion = scan.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println(usuario.toString());
                    System.out.println("Hit points actuales=" + hp);
                    break;
                
                case 2:
                    System.out.println("Escoga la dificultad del enemigo que desea luchar:");
                    do {
                        System.out.println("1) facil");
                    System.out.println("2) medio");
                    System.out.println("3) dificil");
                    dificultad = scan.nextInt();
                    if (dificultad < 0 || dificultad > 4) {
                        System.out.println("error, escoga de nuevo.");
                    }
                    } while (dificultad < 0 || dificultad > 4);
                    if (dificultad ==1) {
                        nombreenemigo = enemigos.get(dificultad-1).Getnombre();
                        hpenemigo = enemigos.get(dificultad-1).Getmaxhp();
                        atkenemigo = enemigos.get(dificultad-1).Getatk();
                        defenemigo = enemigos.get(dificultad-1).Getdef();
                    }
                    else if (dificultad ==2) {
                        nombreenemigo = enemigos.get(dificultad-1).Getnombre();
                        hpenemigo = enemigos.get(dificultad-1).Getmaxhp();
                        atkenemigo = enemigos.get(dificultad-1).Getatk();
                        defenemigo = enemigos.get(dificultad-1).Getdef();
                    }
                    else if (dificultad ==3) {
                        nombreenemigo = enemigos.get(dificultad-1).Getnombre();
                        hpenemigo = enemigos.get(dificultad-1).Getmaxhp();
                        atkenemigo = enemigos.get(dificultad-1).Getatk();
                        defenemigo = enemigos.get(dificultad-1).Getdef();
                    }
                    nombre = usuario.Getnombre();
                    clase = usuario.Getclase();
                    atk = usuario.Getatk();
                    def = usuario.Getdef();
                    intel = usuario.Getintel();
                    System.out.println("has decidido luchar con un " + nombreenemigo + "!");
                    if (clase.equalsIgnoreCase("Caballero")) {
                        do {
                            System.out.println("HP de "+ nombre +": "+ hp);
                            System.out.println("");
                            System.out.println("HP del " + nombreenemigo + ": " + hpenemigo);
                            System.out.println("Que desea hacer?");
                            System.out.println("");
                            daño = Calculodaño.Daño(atk, defenemigo);
                            hpenemigo = hpenemigo - daño;
                            System.out.println("se le ha hecho " + daño + " al enemigo!");
                            daño = Calculodaño.Daño(atkenemigo, def);
                            hp = hp - daño;
                            System.out.println("El enemigo ha hecho " + daño + " de daño a " + nombre + "!");
                        }while (hp > 0 && hpenemigo > 0);
                    }
                    else {
                        do {
                            System.out.println("HP de "+ nombre +": "+ hp);
                            System.out.println("HP del " + nombreenemigo + ": " + hpenemigo);
                            System.out.println("");
                            daño = Calculodaño.Daño(intel, defenemigo);
                            hpenemigo = hpenemigo - daño;
                            System.out.println("se le ha hecho " + daño + " al enemigo!");
                            daño = Calculodaño.Daño(atkenemigo, def);
                            hp = hp - daño;
                            System.out.println("El enemigo ha hecho " + daño + " de daño a " + nombre + "!");
                        }while (hp > 0 && hpenemigo > 0);
                    }
                    if (hp < 0) {
                        System.out.println("Has sido derrotado...");
                    }
                    else if (hpenemigo < 0){
                        System.out.println("Has derrotado al enemigo!");
                        exp = usuario.Getexp();
                        if (dificultad == 1) {
                            exp = exp + 25;
                            System.out.println("ha ganado 25 puntos de EXP!");
                        }
                        else if (dificultad == 2) {
                            exp = exp + 50;
                            System.out.println("ha ganado 50 puntos de EXP!");
                        }
                        else if (dificultad == 3) {
                            exp = exp + 85;
                            System.out.println("ha ganado 85 puntos de EXP!");
                        }
                        usuario.Setexp(exp);
                    }
                    break;
                
                case 3:
                    hp = maxhp;
                    System.out.println("Descansaste... y regeneraste todos tus puntos de Vida!");
                    break;
                
                case 4:
                    int x = 0;
                    int y = 0;
                    do {
                        Calculodaño.imprimir(mapa);
                        System.out.println("");
                        System.out.println("'0' = tu personaje ");
                        System.out.println("'1' = casilla a la que se puede mover");
                        System.out.println("'2' = paredes");
                        System.out.println("'3' = casilla de curacion");
                        System.out.println("'4' = meta");
                        System.out.println("adonde desea moverse?");
                        System.out.println("");
                        do {
                            System.out.println("1) Arriba");
                            System.out.println("2) Derecha");
                            System.out.println("3) Izquierda");
                            System.out.println("4) Abajo");
                            movimiento = scan.nextInt();
                            if (movimiento<0 || movimiento > 4) {
                                System.out.println("Error, ingrese el movimiento de nuevo.");
                            }
                        } while (movimiento < 0 || movimiento > 4);
                        if (movimiento == 3) {
                            if (mapa[x][y-1] == 1) {
                                System.out.println("movimiento realizado con exito");
                                mapa[x][y] = 1;
                                mapa [x][y-1] = 0;
                                y = y-1;
                            }
                            else if (mapa[x][y-1] == 2) {
                                System.out.println("No se puede realizar el movimiento.");
                            }
                            else if (mapa[x][y-1] == 3) {
                                maxhp = usuario.Getmaxhp();
                                hp = maxhp;
                                System.out.println("Has regenerado todos tus puntos de vida!");
                                mapa[x][y] = 1;
                                mapa [x][y-1] = 0;
                                y = y-1;
                            }
                            else if (mapa[x][y-1] == 4) {
                                System.out.println("Has llegado a la meta!");
                                mapa[x][y] = 1;
                                mapa [x][y-1] = 0;
                                y = y-1;
                            }
                        }
                        else if (movimiento == 4) {
                            if (mapa[x+1][y] == 1) {
                                System.out.println("movimiento realizado con exito");
                                mapa[x][y] = 1;
                                mapa [x+1][y] = 0;
                                x = x+1;
                            }
                            else if (mapa[x+1][y] == 2) {
                                System.out.println("No se puede realizar el movimiento.");
                            }
                            else if (mapa[x+1][y] == 3) {
                                maxhp = usuario.Getmaxhp();
                                hp = maxhp;
                                System.out.println("Has regenerado todos tus puntos de vida!");
                                mapa[x][y] = 1;
                                mapa [x+1][y] = 0;
                                x = x+1;
                            }
                            else if (mapa[x+1][y] == 4) {
                                System.out.println("Has llegado a la meta!");
                                mapa[x][y] = 1;
                                mapa [x+1][y] = 0;
                                x = x+1;
                            }
                        }
                        else if (movimiento == 1) {
                            if (mapa[x-1][y] == 1) {
                                System.out.println("movimiento realizado con exito");
                                mapa[x][y] = 1;
                                mapa [x-1][y] = 0;
                                x = x-1;
                            }
                            else if (mapa[x-1][y] == 2) {
                                System.out.println("No se puede realizar el movimiento.");
                            }
                            else if (mapa[x-1][y] == 3) {
                                maxhp = usuario.Getmaxhp();
                                hp = maxhp;
                                System.out.println("Has regenerado todos tus puntos de vida!");
                                mapa[x][y] = 1;
                                mapa [x-1][y] = 0;
                                x = x-1;
                            }
                            else if (mapa[x-1][y] == 4) {
                                System.out.println("Has llegado a la meta!");
                                mapa[x][y] = 1;
                                mapa [x-1][y] = 0;
                                x = x-1;
                            }
                        }
                        else if (movimiento == 2) {
                            if (mapa[x][y+1] == 1) {
                                System.out.println("movimiento realizado con exito");
                                mapa[x][y] = 1;
                                mapa [x][y+1] = 0;
                                y = y+1;
                            }
                            else if (mapa[x][y+1] == 2) {
                                System.out.println("No se puede realizar el movimiento.");
                            }
                            else if (mapa[x][y+1] == 3) {
                                maxhp = usuario.Getmaxhp();
                                hp = maxhp;
                                System.out.println("Has regenerado todos tus puntos de vida!");
                                mapa[x][y] = 1;
                                mapa [x][y+1] = 0;
                                y = y+1;
                            }
                            else if (mapa[x][y+1] == 4) {
                                System.out.println("Has llegado a la meta!");
                                mapa[x][y] = 1;
                                mapa [x][y+1] = 0;
                                y = y+1;
                            }
                        }
                        randomencounter = rand.nextInt(1, 11);
                        if (randomencounter == 1) {
                            nombreenemigo = enemigos.get(0).Getnombre();
                            hpenemigo = enemigos.get(0).Getmaxhp();
                            atkenemigo = enemigos.get(0).Getatk();
                            defenemigo = enemigos.get(0).Getdef();
                            nombre = usuario.Getnombre();
                            clase = usuario.Getclase();
                            atk = usuario.Getatk();
                            def = usuario.Getdef();
                            intel = usuario.Getintel();
                            System.out.println("un " + nombreenemigo + " te ataca!");
                            if (clase.equalsIgnoreCase("Caballero")) {
                                do {
                                    System.out.println("HP de "+ nombre +": "+ hp);
                                    System.out.println("");
                                    System.out.println("HP del " + nombreenemigo + ": " + hpenemigo);
                                    System.out.println("Que desea hacer?");
                                    System.out.println("");
                                    daño = Calculodaño.Daño(atk, defenemigo);
                                    hpenemigo = hpenemigo - daño;
                                    System.out.println("se le ha hecho " + daño + " al enemigo!");
                                    daño = Calculodaño.Daño(atkenemigo, def);
                                    hp = hp - daño;
                                    System.out.println("El enemigo ha hecho " + daño + " de daño a " + nombre + "!");
                                }while (hp > 0 && hpenemigo > 0);
                            }
                            else {
                                do {
                                    System.out.println("HP de "+ nombre +": "+ hp);
                                    System.out.println("HP del " + nombreenemigo + ": " + hpenemigo);
                                    System.out.println("");
                                    daño = Calculodaño.Daño(intel, defenemigo);
                                    hpenemigo = hpenemigo - daño;
                                    System.out.println("se le ha hecho " + daño + " al enemigo!");
                                    daño = Calculodaño.Daño(atkenemigo, def);
                                    hp = hp - daño;
                                    System.out.println("El enemigo ha hecho " + daño + " de daño a " + nombre + "!");
                                }while (hp > 0 && hpenemigo > 0);
                            }
                            if (hp < 0) {
                                System.out.println("Has sido derrotado...");
                                mapa[4][4] = 0;
                            }
                            else if (hpenemigo < 0){
                                System.out.println("Has derrotado al enemigo!");
                                exp = usuario.Getexp();
                                exp = exp + 25;
                                usuario.Setexp(exp);
                            }
                        }
                    } while (mapa[4][4] == 4);
                    break;
                
                case 5:
                    System.out.println("Esta seguro?");
                    System.out.println("1) Si");
                    System.out.println("2) No");
                    peleafinal = scan.nextInt();
                    if (peleafinal != 1) {
                        System.out.println("Parece que aun no estas seguro, vuelve mas tarde...");
                    }
                    else {
                        nombreenemigo = enemigos.get(3).Getnombre();
                        hpenemigo = enemigos.get(3).Getmaxhp();
                        atkenemigo = enemigos.get(3).Getatk();
                        defenemigo = enemigos.get(3).Getdef();
                        nombre = usuario.Getnombre();
                        clase = usuario.Getclase();
                        atk = usuario.Getatk();
                        def = usuario.Getdef();
                        intel = usuario.Getintel();
                        System.out.println("has decidido luchar con un " + nombreenemigo + "!");
                        if (clase.equalsIgnoreCase("Caballero")) {
                            do {
                                System.out.println("HP de "+ nombre +": "+ hp);
                                System.out.println("");
                                System.out.println("HP del " + nombreenemigo + ": " + hpenemigo);
                                System.out.println("Que desea hacer?");
                                System.out.println("");
                                daño = Calculodaño.Daño(atk, defenemigo);
                                hpenemigo = hpenemigo - daño;
                                System.out.println("se le ha hecho " + daño + " al enemigo!");
                                daño = Calculodaño.Daño(atkenemigo, def);
                                hp = hp - daño;
                                System.out.println("El enemigo ha hecho " + daño + " de daño a " + nombre + "!");
                            }while (hp > 0 && hpenemigo > 0);
                        }
                        else {
                            do {
                                System.out.println("HP de "+ nombre +": "+ hp);
                                System.out.println("HP del " + nombreenemigo + ": " + hpenemigo);
                                System.out.println("");
                                daño = Calculodaño.Daño(intel, defenemigo);
                                hpenemigo = hpenemigo - daño;
                                System.out.println("se le ha hecho " + daño + " al enemigo!");
                                daño = Calculodaño.Daño(atkenemigo, def);
                                hp = hp - daño;
                                System.out.println("El enemigo ha hecho " + daño + " de daño a " + nombre + "!");
                            }while (hp > 0 && hpenemigo > 0);
                        }
                        if (hp < 0) {
                            System.out.println("Has sido derrotado...");
                        }
                        else if (hpenemigo < 0){
                            System.out.println("Has derrotado al jefe final!, Felicidades!");
                        }
                    }
                    break;
                
                default:
                    juego = false;
                    break;
            }
            System.out.println("");
        } while (juego == true && hp>0);
        if (hp <= 0) {
            System.out.println("Has muerto...");
        }
    }
    
}
