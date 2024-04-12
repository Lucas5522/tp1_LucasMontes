package ar.edu.unju.fi.ejercicio9_Model;

import java.util.Scanner;

public class Pizza {
	private int diametro;
	private int precio;
	private double area;
	private boolean ingreEspe;
	private int ingreEspe20 = 500;
	private int ingreEspe30 = 750;
	private int ingreEspe40 = 1000;
	private int total =0;
	Scanner scanner = new Scanner(System.in);
	
	public void ingresoDatos() {
		do {
			System.out.println("ingrese el valor del diametro de la piza(20,30,40):");
			diametro= scanner.nextInt();
			System.out.println("Contiene ingredientes especiales true o flase:");
			ingreEspe= scanner.nextBoolean();
	    
		} while (diametro !=20 && diametro != 30 && diametro != 40);	
					
	}
	
	public void calcularPrecio() {
		if (diametro == 20  && ingreEspe == false) {
			total = 4500;
		}
		if (diametro == 20  && ingreEspe == true) {
			total = 4500 + ingreEspe20;
		}
		if (diametro == 30  && ingreEspe == false) {
			total = 4800;
		}
		if (diametro == 30  && ingreEspe == true) {
			total = 4800 + ingreEspe30;
		}
		if (diametro == 40  && ingreEspe == false) {
			total = 5500;
		}
		if (diametro == 40  && ingreEspe == true) {
			total = 5500 + ingreEspe40;
		}
	}
	
	
	public void calcularArea() {
		area = Math.pow(diametro/2, 2)*3.1415;
	}
	
	
	public Pizza(int diametro, int precio, int area, boolean ingreEspe, int ingreEspe20, int ingreEspe30,
			int ingreEspe40) {
		super();
		this.diametro = diametro;
		this.precio = precio;
		this.area = area;
		this.ingreEspe = ingreEspe;
		this.ingreEspe20 = ingreEspe20;
		this.ingreEspe30 = ingreEspe30;
		this.ingreEspe40 = ingreEspe40;
	}
	
	public Pizza() {
		// TODO Auto-generated constructor stub
	}

	public int getDiametro() {
		return diametro;
	}
	public void setDiamentro(int diamentro) {
		this.diametro = diamentro;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public double getArea() {
		return area;
	}
	public void setArea(int area) {
		this.area = area;
	}
	public boolean isIngreEspe() {
		return ingreEspe;
	}
	public void setIngreEspe(boolean ingreEspe) {
		this.ingreEspe = ingreEspe;
	}
	public int getIngreEspe20() {
		return ingreEspe20;
	}
	public void setIngreEspe20(int ingreEspe20) {
		this.ingreEspe20 = ingreEspe20;
	}
	public int getIngreEspe30() {
		return ingreEspe30;
	}
	public void setIngreEspe30(int ingreEspe30) {
		this.ingreEspe30 = ingreEspe30;
	}
	public int getIngreEspe40() {
		return ingreEspe40;
	}
	public void setIngreEspe40(int ingreEspe40) {
		this.ingreEspe40 = ingreEspe40;
	}
	
	
	
	
	
	
}
