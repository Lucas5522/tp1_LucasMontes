package ar.edu.unju.fi.ejercicio17_Main;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import ar.edu.unju.fi.ejercicio17_Model.Jugador;

public class Main {
	private static Scanner scanner;
	private static List<Jugador> jugador;
	
	public static void main(String[] args) {
		int op;
		scanner = new Scanner(System.in);
		
		
		do {
			System.out.println("*********************************************************************************");
			System.out.println("opcion 1: Alta del jugador");
			System.out.println("opcion 2: Mostrar datos del juagdor");
			System.out.println("opcion 3: Mostar los juagdores ordenados por apellido");
			System.out.println("opcion 4: Modificar los datos de un jugador");
			System.out.println("opcion 5: Eliminar un jugador");
			System.out.println("opcion 6: Mostar la cantidad de jugadores");
			System.out.println("opcion 7: Mostrar la cantidad de jugadores que pertenece a una nacionalidad");
			System.out.println("opcion 8: Salir");
			System.out.println("*********************************************************************************");
			System.out.println("Ingrese opcion");
			op = scanner.nextInt();
			switch (op) {
			case 1:preCargaJugador();
			break;
			case 2: mostrarJugador();
			break;
			case 3: ordenarApellido();
			break;
			case 4: 
			case 5: 
			case 6: 
			case 7: 
			case 8: System.out.println("Fin del programa");
			break;
			
			
			default:
				System.out.println("Ingrece una opcion correcta");
			}
			
			
			
			
			
			
			
		} while (op!=8);
		
		
		
		
		
		

	}
	
	public static void preCargaJugador() {
		if(jugador == null) {
				jugador = new ArrayList<>(); 
		}
		jugador.add(new Jugador("Tenedor", "erro", "19-07-1995", "Argentino", 1.80f, 79f, "defensa"));
		jugador.add(new Jugador("Cuchara", "Mamani", "13-09-1990", "Argentino", 1.70f, 70f, "arquero"));
		jugador.add(new Jugador("Leo", "Mes", "19-07-1995", "Argentino", 1.50f, 70f, "delantero"));
		jugador.add(new Jugador("Ector", "Pala", "19-07-1995", "Argentino", 1.90f, 85f, "defensa"));
	}
	
	public static void mostrarJugador() {
		System.out.println("*************LISTA DE JUGADORES****************");
		jugador.forEach(j->System.out.println(j));
		/*for(Jugador jug:jugador) {
			System.out.println("Nombre: " + jug.getNombre());
		}*/
	}
	
	public static Jugador buscarJugador(String nomb, String apell) {
		Jugador jugencont = null;
		for(Jugador jug: jugador) {
			if (jug.getNombre().equals(nomb) && jug.getApellido().equals(apell) ) {
				jugencont = jug;
				break;
			}
		}
		return jugencont;
	}
	
	public static void ordenarApellido() {
		System.out.println("*************Lista de Jugadres ordenada*************");
		jugador.sort(Comparator.comparing(Jugador::getApellido));
		for(Jugador jug:jugador) {
			System.out.println("Nombre: " + jug.getApellido());
		}
		
	}
	
	public static void modificarJugador() {
		System.out.println("*************Modificar jugador*****************");
		System.out.println("Ingrese nombe del jugador a modificiar: ");
		String nom = scanner.next();
		System.out.println("Ingrese nombe del jugador a modificiar: ");
		String ape = scanner.next();
		for(Jugador jug: jugador) {
			if ( jug.getNombre().equals(nom) && jug.getApellido().equals(ape)) {
				System.out.println("Ingrese nuevo nombre: ");
				String nn = scanner.next();
				System.out.println("ingrese nuevo apellido: ");
				String ap = scanner.next();
				Jugador jug = buscarJugador(nom, ape);
				jug.setNombre(nn);
				jug.setApellido(ap);
				
			}
		}
		
		
		
	}
	
	

}
