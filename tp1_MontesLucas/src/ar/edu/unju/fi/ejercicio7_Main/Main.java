package ar.edu.unju.fi.ejercicio7_Main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio7_Model.Empleado;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int op;
		do {
			System.out.println("opcion 4: Salir:");
			System.out.println("Ingresar opcion:");
			op = scanner.nextInt();
				 Empleado empleado = new Empleado();
				 empleado.mostrarDatos();
				 empleado.Aumento(); 
				 empleado.mostrarDatos();
				    
		} while (op != 4);
		System.out.println("adios");	
		
	}

}
