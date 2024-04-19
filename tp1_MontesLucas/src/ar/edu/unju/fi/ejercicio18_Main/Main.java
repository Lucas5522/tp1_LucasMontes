package ar.edu.unju.fi.ejercicio18_Main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio18_Model.DestinoTuristico;
import ar.edu.unju.fi.ejercicio18_Model.Pais;


public class Main {
	private static Scanner scanner;
	private static List<Pais> pais;
	private static List<DestinoTuristico>destuc;
	
	public static void main(String[] args) {
		int op;
		boolean band = false;
		destuc = new ArrayList<>();
		scanner = new Scanner(System.in);
		
		do {
			System.out.println("****************************************************************************");
			System.out.println("opcion 1: Alta del destino turistico");
			System.out.println("opcion 2: Mostrar todos los destinos turisticos");
			System.out.println("opcion 3: Modificar el pais de un destino turistico");
			System.out.println("opcion 4: Limpiar ArrayList de los destinos turisticos");
			System.out.println("opcion 5: Eliminar un destino turistico");
			System.out.println("opcion 6: Ordenar los destinos turisticos por nombre");
			System.out.println("opcion 7: Mostrar todos los paises");
			System.out.println("opcion 8: Mostrar todos los destinos turisticos que pertenecen a un pais");
			System.out.println("opcion 9: Salir");
			System.out.println("*******************************************************************************");
			System.out.println("Ingrece una opcion: ");
			op = scanner.nextInt();
			switch (op) {
			case 1: ;agregarDestTur();
					band = true;
			break;
			case 2:
				if (band== true) {
					;
				}else {
					System.out.println("Primero debe ingresar un pais");
				}
			break;
			case 3: 
				if (band== true) {
					;	
				}else {
					System.out.println("Primero debe ingresar un pais");
				}
			break;
			case 4: 
				if (band== true) {
					;
				}else {
					System.out.println("Primero debe ingresar un pais");
				}
			break;
			case 5: 
				if (band== true) {
					;
				}else {
					System.out.println("Primero debe ingresar un pais");
				}
			break;
			case 6:
				if (band== true) {
					;
				}else {
					
				}
			break;
			case 7: 
				if (band== true) {
					;	
				}else {
					System.out.println("Primero debe ingresar un pais");
				}
			break;
			case 8: System.out.println("Fin del programa");
			break;
			
			
			default:
				System.out.println("Ingrece una opcion correcta");
			}
		} while (op != 9);

	}
	
	public static void agregarPais() {
		if (pais == null) {
			pais = new ArrayList<>();
		}
		
		System.out.println("Ingrese pais: ");
		String pa= scanner.next();
		System.out.println("Ingrese codigo: ");
		int cod= scanner.nextInt();
		pais.add(new Pais(cod, pa));	
		
	}
	public static void agregarDestTur() {
		DestinoTuristico destuc = new DestinoTuristico();
		System.out.println("Ingrese codigo: ");
		destuc.setCodigo(scanner.nextInt());
		System.out.println("Ingrese nombre: ");
		destuc.setNombre(scanner.next());
		System.out.println("Ingrese precio: ");
		destuc.setPrecio(scanner.nextDouble());
		System.out.println("Ingrese pais");
		String paiss = scanner.next();
		System.out.println("Ingrese cantidad de dias: ");
		destuc.setCantidadDias(scanner.nextInt());
		
	}
	
	
	
	
	

}
