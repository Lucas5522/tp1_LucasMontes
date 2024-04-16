package ar.edu.unju.fi.ejercicio16_Main;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		int num = 0;
		byte valor;
		int otro = 0;
		Scanner scanner = new Scanner(System.in);
		String[] lista = new String[5];
		
		for(int i = 0 ; i < lista.length; i++) {
			System.out.println("Ingrese nombre: ");
			lista[i]=scanner.next();	
		}
		
		System.out.println("******************************");
		//muestra lista 
		while (num < 5) {
			System.out.println(lista[num]);
			num++;
		}
		num=0;
		System.out.println("***********************************");
		//eliminar un elemento de la lista desplazando los otros elementos
		System.out.println("Ingrese posicion a eliminar");
		valor = scanner.nextByte();
		do {
			if (otro == valor) {
				lista[otro-1]= null;
			}
			
			otro++;
		} while (otro < lista.length);
		System.out.println("***********************************");
		//mostar lista de nuevo
		while (num < lista.length) {
			System.out.println(lista[num]);
			num++;
		}
		
		
		
		
		
		
		
		
		
		
		
	}
}
