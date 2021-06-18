package src.jugador;

import src.base.*;

public class Controljugador{
	private Jugadores[] player = new Jugadores[5];
	private int nextplayer;

	public Controljugador(){
		nextplayer = 1;

	}

	// agregar peliculas
	public void agregarJugador(int puntos, String nombre, String nickname){
		if(nextplayer > 5){
			System.out.println("Limite de jugadores");
		}
		else{
			player[(nextplayer-1)] = new Jugadores(nextplayer, puntos, nombre, nickname);
		}
		nextplayer++;

	}

	public void agregarJugador(){
		System.out.println("\n\n *****Ingresar 2 jugadores******");
		System.out.println("");
		int puntos = IngresoDatos.getEntero("Numero de Jugador:",false);
		String nombre = IngresoDatos.getTexto("Ingrese su Nombre: ");
		String nickname = IngresoDatos.getTexto("Ingrese su Nickname: ");
		System.out.println("");
		agregarJugador(puntos, nombre, nickname);
        
	}

    //Mostrar peliculas
	public void mostrarjugadores(){
		System.out.println("\n\n Jugadores");
		System.out.println("");
		for (int i = 0; i <(nextplayer-1); i++){
			System.out.println(player[i].getContar());

		}

		System.out.println("\n\n");
	}

	//fin 
}