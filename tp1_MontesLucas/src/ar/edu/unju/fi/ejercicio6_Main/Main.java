package ar.edu.unju.fi.ejercicio6_Main;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio6_Model.Persona;

public class Main {

	public static void main(String[] args) {
		
		Persona persona = new Persona();
		Scanner scanner = new Scanner(System.in);
		System.out.println("ingrese DNI:");
		long dni = scanner.nextInt();
		System.out.println("ingrese Nombre:");
		String nombre = scanner.next();
		System.out.println("ingrese fecha de nacimiento Año-mes-dia:");
		String fecha = scanner.next();
		LocalDate fechaNacimiento = LocalDate.parse(fecha);
		LocalDate fechaActual = LocalDate.now();
		Period anio = Period.between(fechaNacimiento, fechaActual);
		int año = anio.getYears();
		String provincia = "Jujuy";
		
		persona.setDni(dni);
		persona.setNombre(nombre);
		persona.setFechaNacimiento(fechaNacimiento);
		persona.setAño1(año);
		persona.setProvincia(provincia);
	
	System.out.println(persona.toString());
	
	
	}
}
