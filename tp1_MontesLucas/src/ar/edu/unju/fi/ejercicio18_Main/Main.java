package ar.edu.unju.fi.ejercicio18_Main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio18_Model.DestinoTuristico;
import ar.edu.unju.fi.ejercicio18_Model.Pais;


public class Main {
	private static Scanner scanner;
	private static List<Pais> paises;
	private static List<DestinoTuristico>destuc;
	
	public static void main(String[] args) {
		int op;
		boolean band = false;
		scanner = new Scanner(System.in);
		preagregarPais();
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
					mostrarDestinos();
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
	
	
	public static void agregarDestTur() {
		if (destuc == null) {
			destuc = new ArrayList<>();
		}
		System.out.println("Ingrese codigo: ");
		int codigo = scanner.nextInt();
		System.out.println("Ingrese nombre: ");
		String nom= scanner.next();
		System.out.println("Ingrese precio: ");
		double prec = scanner.nextDouble(); 
		System.out.println("Ingrese codigopais: ");
		int codigoPais = scanner.nextInt();
		Pais pais = getPaisBy(codigoPais);
		System.out.println("Ingrese cantidad de dias: ");
		int candi = scanner.nextInt();
		destuc.add(new DestinoTuristico(codigo, nom, prec, pais, candi));
	}
	
	private static Pais getPaisBy(int codigoPais) {
		for(Pais pais : paises) {
			if (pais.getCodigo() == codigoPais) {
				return pais;
			}
			
			
		}
		return null;
	}


	public static void preagregarPais() {
		if (paises == null) {
			paises = new ArrayList<>();
		}
		/*System.out.println("Ingrese codigo: ");
		int codi = scanner.nextInt();
		System.out.println("Ingrese nombre: ");
		String nomb = scanner.next();*/
		paises.add(new Pais(1, "Argentina"));
		paises.add(new Pais(2, "Chile"));
	}
		
		
	public static void mostrarDestinos() {
		System.out.println("*************LISTA DE DESTINOS TURISTICOS****************");
		destuc.forEach(d->System.out.println(d));
		
		
		
	}
	
			
		
	
	
	
	

}
