package ar.edu.unju.fi.ejercicio14_Main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int x;
		int total = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese un valor entre(3,10)");
		x = scanner.nextInt();
		int[] listi = new int[x];
		
		
		for(int i = 0 ; i < listi.length ; i++ ) {
			System.out.println("Ingrese valores enteros: ");
			int n = scanner.nextInt();
			listi[i] = n;
			total= total + listi[i];
		}
		
		for(int j = 0 ; j < listi.length ; j++) {
			System.out.println( "valor: " + listi[j]);
		}
		System.out.println("suma total: " + total);
		
		
		
		
		


	}

}
