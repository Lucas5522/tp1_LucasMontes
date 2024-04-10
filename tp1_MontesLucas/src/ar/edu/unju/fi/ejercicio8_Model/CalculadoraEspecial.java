package ar.edu.unju.fi.ejercicio8_Model;

import java.util.Scanner;

public class CalculadoraEspecial {
	private int n;
	private double sumat= 0;
	private double product= 1;
	Scanner scanner = new Scanner(System.in);
	
	public CalculadoraEspecial(int n, int sumat, int product) {
		super();
		this.n = n;
		this.sumat = sumat;
		this.product = product;
	}
	
	public CalculadoraEspecial() {
		// TODO Auto-generated constructor stub
	}

	public void calcularSumatoria() {
		System.out.println("ingrese el valor de n:");
		n= scanner.nextInt();
		for(int i=1; i <= n; i++) {
			sumat = sumat + Math.pow(i*(i+1)/2, 2);
		}
		System.out.println("El resultado de la sumatoria es: " + sumat);
	}
	
	public void calcularProductoria() {
		System.out.println("ingrese el valor de n:");
		n= scanner.nextInt();
		for(int i=1; i <= n; i++) {
			product = product * (i*(i+4));
		}
		System.out.println("El resultado de la sumatoria es: " + product);
	}
	
	
	
	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}
	public double getSumat() {
		return sumat;
	}
	public void setSumat(int sumat) {
		this.sumat = sumat;
	}
	public double getProduct() {
		return product;
	}
	public void setProduct(int product) {
		this.product = product;
	}
		
	
}
