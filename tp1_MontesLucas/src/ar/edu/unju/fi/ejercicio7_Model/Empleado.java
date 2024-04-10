package ar.edu.unju.fi.ejercicio7_Model;

import java.util.Scanner;

public class Empleado {

	private String nombre;
	private int legajo;
	private float salario;
	int salMinimo = 210000;
	int aumMerito = 20000;
	Scanner scanner = new Scanner(System.in);
	
	public Empleado() {
		System.out.println("Ingrese nombre del empleado: ");
		nombre = scanner.next();
		System.out.println("Ingrese legajo del empleado: ");
		legajo = scanner.nextInt();
		System.out.println("Ingrese salario del empleado: ");
		salario = scanner.nextFloat();
		if (salario < 210000) {
			this.salario = salMinimo;
			System.out.println("se modifico el salario al minimo");
		}
	}
	public void mostrarDatos() {
		System.out.println("Nombre del empleado: " + nombre);
		System.out.println("Legajo: " + legajo);
		System.out.println("Salario: " + salario);
	}
	
	public void Aumento() {
		salario = salario + aumMerito;
		System.out.println("Se a aumentoado el salario, ahora es: " + salario);
		
	}
	
	
}
