package ar.edu.unju.fi.ejercicio9_Main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio9_Model.Model;

public class Main {
	public static void main(String[] args) {
		int continuar= 0;
	do {
		Scanner scanner = new Scanner(System.in);
		Model model = new Model();
		System.out.println("Ingrese nombre del producto: ");
		String nombre =scanner.next();
		System.out.println("Ingrese codigo del producto: ");
		int codigo = scanner.nextInt();
		System.out.println("Ingrese precio del producto: ");
		double precio = scanner.nextDouble();
		System.out.println("Cuanto descuento tiene el producto (0%,50%): ");
		int descuento = scanner.nextInt();
		model.setNombre(nombre);
		model.setCodigo(codigo);
		model.setPrecio(precio);
		model.setDescuento(descuento);
		model.calcularDescuento();
		System.out.println("Desea ingresar otro producto (1 para si)(0 para no): ");
		continuar = scanner.nextInt();
	} while (continuar == 1);
	}

}
