package ar.edu.unju.fi.ejercicio17_Model;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Jugador {
	private String nombre;
	private String apellido;
	private String fechaNacimiento;
	private String nacionalidad;
	private float estatura;
	private float peso;
	private String posicion;
	Scanner scanner = new Scanner(System.in);
	
	public void calcularEdad() {
		LocalDate fechaActual = LocalDate.now();
		LocalDate fecha = LocalDate.parse(fechaNacimiento);
		Period anio = Period.between(fecha, fechaActual);
		int año = anio.getYears();
		System.out.println("Edad: " + año);
	}	
	
		
	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", apellido=" + apellido + ", fechaNacimiento=" + fechaNacimiento
				+ ", nacionalidad=" + nacionalidad + ", estatura=" + estatura + ", peso=" + peso + ", posicion="
				+ posicion + "]";
	}

	public Jugador() {
	}
	
	public Jugador(String nombre, String apellido, String fechaNacimiento, String nacionalidad, float estatura,
			float peso, String posicion) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = fechaNacimiento;
		this.nacionalidad = nacionalidad;
		this.estatura = estatura;
		this.peso = peso;
		this.posicion = posicion;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public String getFechaNacimiento() {
		return fechaNacimiento;
	}


	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}


	public String getNacionalidad() {
		return nacionalidad;
	}


	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}


	public float getEstatura() {
		return estatura;
	}


	public void setEstatura(float estatura) {
		this.estatura = estatura;
	}


	public float getPeso() {
		return peso;
	}


	public void setPeso(float peso) {
		this.peso = peso;
	}


	public String getPosicion() {
		return posicion;
	}


	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}	
	
	
}
