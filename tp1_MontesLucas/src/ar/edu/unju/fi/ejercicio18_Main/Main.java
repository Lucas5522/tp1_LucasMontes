package ar.edu.unju.fi.ejercicio18_Main;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
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
		try {
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
			case 3: modificarPaisDestino();
				if (band== true) {
					;	
				}else {
					System.out.println("Primero debe ingresar un pais");
				}
			break;
			case 4: destuc.clear();
					System.out.println("Se a limpiado la lista de destinos turisticos");
				if (band== true) {
					;
				}else {
					System.out.println("Primero debe ingresar un pais");
				}
			break;
			case 5: ordenarPaisesnombre();
				if (band== true) {
					;
				}else {
					System.out.println("Primero debe ingresar un pais");
				}
			break;
			case 6: ordenarPaisesnombre();
				if (band== true) {
					;
				}else {
					
				}
			break;
			case 7: mostrarPais();
				if (band== true) {
					;	
				}else {
					System.out.println("Primero debe ingresar un pais");
				}
			break; 
			case 8: mostrarPertenecientePais();
			break;
			case 9:System.out.println("adios");
			break;
			default:
				System.out.println("Ingrece una opcion correcta");
			}
		} while (op != 9);
	 }catch (Exception e) {
			System.out.println("Algun dato ingresado no es valido");
		}
	}
	
	
	public static void agregarDestTur() {
	 try {
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
	  }catch (Exception e) {
		System.out.println("Algun dato ingresado no es valido");
	}
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
		paises.add(new Pais(3, "Bolivia"));
		paises.add(new Pais(4, "Brasil"));
	}
		
		
	public static void mostrarDestinos() {
		System.out.println("*************LISTA DE DESTINOS TURISTICOS****************");
		destuc.forEach(d->System.out.println(d));	
	}
	
	public static void modificarPaisDestino() {
		System.out.println("************************MODIFICIACION DE PAIS***************************");
		System.out.println("Igrese pais a modificar");
		String paisModific = scanner.next();
		for (DestinoTuristico destino: destuc) {
			if(destino.getNombre().equals(paisModific)) {
				System.out.println("Ingrese el nuevo nombre: ");
				String nomb = scanner.next(); 
				destino.setNombre(nomb);
			}
			
		}	
	}
			
	public static void eliminarDestino() {
		Iterator<DestinoTuristico> iterator = destuc.iterator();
		try {
			
			System.out.println("Ingrese codigo del destino turistico: ");
			int removdest = scanner.nextInt();
			while (iterator.hasNext()) {
				DestinoTuristico dest = iterator.next();
				if(dest.getCodigo() == removdest){
				iterator.remove();
				}
			}
		 }catch (Exception e) {
				System.out.println("El dato ingresado no es valido");
		 }
	}
	
	public static void ordenarPaisesnombre() {
		System.out.println("*************Destinos turisticos ordenados por nombre*************");
			destuc.sort(Comparator.comparing(DestinoTuristico::getNombre));
			for(DestinoTuristico destinopais: destuc) {
				System.out.println("Pais: " + destinopais.getNombre());
			 }
			}
			
	
	public static void mostrarPais() {
		System.out.println("************************Lista de los paises*********************");
		for(Pais pais: paises) {
			System.out.println("Pais: " + pais.getNombre());
		 }
	}
	
	public static void mostrarPertenecientePais() {
		System.out.println("************************Lista de paises pertenecientes a un pais*********************************");
		try {
			System.out.println("Ingrese codigo del pais: ");
			int codig = scanner.nextInt();
			for(DestinoTuristico destino : destuc) {
				for(Pais pais : paises) {
					if(pais.getCodigo() == codig) {
						System.out.println("Destino turistico: " + destino.getNombre());
					}
				}
			}
		 }catch (Exception e) {
				System.out.println("El dato ingresado no es valido");
		 }
		
		
	}
	
	
	
}
