package ar.edu.unju.fi.ejercicio13_Main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] numLsit = new int[8];

		for(int i = 0 ; i < numLsit.length ; i++ ) {
			System.out.println("Ingrese valores enteros: ");
			int n = scanner.nextInt();
			numLsit[i] = n;
		}
		for(int j = 0 ; j < numLsit.length ; j++) {
			System.out.println("Posicion: " + j + " valor: " + numLsit[j]);
		}
		
		
	}

}
