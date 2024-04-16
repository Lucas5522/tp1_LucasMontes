package ar.edu.unju.fi.ejercicio15_Main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int a;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese un valor entre(3,10)");
		a = scanner.nextInt();
		int[] quince = new int[a];
		for(int i = 0 ; i < quince.length; i++) {
			System.out.println("Ingrese valores");
			int n = scanner.nextInt();
			quince[i]=n;	
		}
		for(int w = 0 ; w < a ; w++) {
			System.out.println( "valor: " + quince[w]);

		}
		System.out.println("**************************");
		for(int f = a-1 ; f >= 0 ; f--) {
			System.out.println( "valor: " + quince[f]);

		}
	}
}
