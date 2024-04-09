package ar.edu.unju.fi.ejercicio5;

import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int num;
		int tabla;
		Scanner scanner = new Scanner(System.in);
		do {
		System.out.println("ingrese un numero entre [1,9]:");
		num = scanner.nextInt();
		if (num > 9) {
			System.out.println("solo ingrese valores entre 1 y 9");
		}
		} while (num > 9);
		System.out.println("el numero ingresado es: " + num + " y su tabla de multiplicar es:");
		for (int i=0 ; i <= 10 ; i++) {
			tabla = i * num;
			System.out.println(num + "x" + i + " = " + tabla);
		}
		
		
		
	}

}
