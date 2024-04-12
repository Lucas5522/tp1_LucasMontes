package ar.edu.unju.fi.ejercicio9_Main;

import ar.edu.unju.fi.ejercicio9_Model.Pizza;

public class Main {

	public static void main(String[] args) {
		
		Pizza pizza = new Pizza();
		pizza.ingresoDatos();
		pizza.calcularPrecio();
		pizza.calcularArea();
		
		System.out.println("Diametro: " + pizza.getDiametro());
		System.out.println("Ingredientes especiales: " + pizza.equals(pizza) );
		System.out.println("Precio pizza: "+ pizza.getPrecio());
		System.out.println("Area de la pizza: "+ pizza.getArea());
		
		
		
		
	}

}
