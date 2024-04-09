package ar.edu.unju.fi.ejercicio4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int num;
		int fact;
		Scanner scanner = new Scanner(System.in);
		do {
		System.out.println("ingrese un numero entre [0,10] para hacer su factorial:");
		num = scanner.nextInt();
		if (num >10) {
			System.out.println("ingrese nuevamente un valor entre 1 y 10");
		}
		} while (num > 10  );
		System.out.println("el numero ingresado es: " + num);
		fact = num;
		while (num != 1) {
			num = num - 1;
			fact = fact*num;
		}
		System.out.println("el factorial es= " + fact);
	}

}
