package src.base;

import src.tablero.Tablero;
import src.jugador.Controljugador;

public class Principal {

    public static void main(String[] args){
        Principal t = new Principal();
    }

    private Controljugador play = new Controljugador();
    private Tablero tab = new Tablero();

    public Principal(){

        int menu = 0;

        while(menu >= 0){
            System.out.print("");
            System.out.println("\n\n *****Bienvenido a Juego de damas****** \n\n");
            System.out.println("1) Ingresar jugadores");
            System.out.println("2) Mostrar jugadores");
            System.out.println("3) tabla del juego");
            System.out.println("4) jugar");
            System.out.println("-1) Salir");
            System.out.println("\n");
            menu = IngresoDatos.getEntero("Ingrese la opción ", true);

            if (menu == 1 ){
                //ingresar los jugadores
                play.agregarJugador();
            }
            if (menu == 2){
                //mostrar jugadores
                play.mostrarjugadores();
            }
            if (menu == 3){
                //tabla del juego
                tab.pintartabla();
            }
            if (menu == 4){
                //juego
                //tab.imprimirtabla([][] tab, fil, col);
 
            }

        }

    }

    
}
