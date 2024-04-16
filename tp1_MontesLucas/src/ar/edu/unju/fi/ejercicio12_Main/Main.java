package ar.edu.unju.fi.ejercicio12_Main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio12_Model.Persona;

public class Main {

	public static void main(String[] args) {
		Persona persona = new Persona();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese su nombre: ");
		String nombre = scanner.next();
		System.out.println("Ingrese fecha de nacimiento(dia-mes-año): ");
		String fechaNacimiento = scanner.next();
		persona.setNombre(nombre);
		persona.setFechaNacimiento(fechaNacimiento);
		persona.calcularAnio();
		persona.calcularSigno();
		persona.calcularEstacion();

	}

}
