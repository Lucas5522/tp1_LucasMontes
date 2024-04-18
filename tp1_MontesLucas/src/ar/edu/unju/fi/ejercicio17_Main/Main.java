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
			case 1: CargaJugador();
			break;
			case 2: mostrarJugador();
			break;
			case 3: ordenarApellido();
			break;
			case 4: modificarJugador();
			case 5: eliminarJugador();
			case 6: 
			case 7: 
			case 8: System.out.println("Fin del programa");
			break;
			
			
			default:
				System.out.println("Ingrece una opcion correcta");
			}
			
			
			
			
			
			
			
		} while (op!=8);

	}
	
	public static void CargaJugador() {
		if(jugador == null) {
				jugador = new ArrayList<>(); 
		}
		System.out.println("Ingrese nombre del jugador: ");
		String nom= scanner.next();
		System.out.println("Ingrese apellido del jugador: ");
		String ap= scanner.next();
		System.out.println("Ingrese Fecha de nacimiendo del jugador(dia-mes-año): ");
		String fech= scanner.next();
		System.out.println("Ingrese nacionalidad del jugador: ");
		String nac= scanner.next();
		System.out.println("Ingrese altura del jugador: ");
		float alt= scanner.nextFloat();
		System.out.println("Ingrese peso del jugador: ");
		float pes= scanner.nextFloat();
		System.out.println("Ingrese posicion del jugador(delantero,medio,defensa,arquero): ");
		String pos = scanner.next();
		jugador.add(new Jugador(nom, ap, fech, nac, alt, pes, pos));
	}
	
	public static void mostrarJugador() {
		System.out.println("*************LISTA DE JUGADORES****************");
		jugador.forEach(j->System.out.println(j));
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
		System.out.println("Ingrese apellido del jugador a modificiar: ");
		String ape = scanner.next();
		for(Jugador jug: jugador) {
			if ( jug.getNombre().equals(nom) && jug.getApellido().equals(ape)) {
				System.out.println("Ingrese nombre del jugador: ");
				String nn= scanner.next();
				System.out.println("Ingrese apellido del jugador: ");
				String np= scanner.next();
				System.out.println("Ingrese Fecha de nacimiendo del jugador(dia-mes-año): ");
				String nf= scanner.next();
				System.out.println("Ingrese nacionalidad del jugador: ");
				String nc= scanner.next();
				System.out.println("Ingrese altura del jugador: ");
				float na= scanner.nextFloat();
				System.out.println("Ingrese peso del jugador: ");
				float npe= scanner.nextFloat();
				System.out.println("Ingrese posicion del jugador(delantero,medio,defensa,arquero): ");
				String npo= scanner.next();
				jug.setNombre(nn);
				jug.setApellido(np);
				jug.setFechaNacimiento(nf);
				jug.setNacionalidad(nc);
				jug.setEstatura(na);
				jug.setPeso(npe);
				jug.setPosicion(npo);
			}
		}
		
		
		
	}
	
	public static void eliminarJugador() {
		
	}

}
 