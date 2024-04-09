package ar.edu.unju.fi.ejercicio3;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		int num;
		Scanner scanner = new Scanner(System.in);
		System.out.println("ingrese un numero:");
		num = scanner.nextInt();
		if (num % 2 == 0) {
			System.out.println("el numero ingresado es par y su triplo es: " + num * 3);
		}else {
			System.out.println("el numero ingresado es impar y su doble es: " + num * 2);
		
		}

	}

}
