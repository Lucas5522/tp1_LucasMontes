package ar.edu.unju.fi.ejercicio6_Model;

import java.time.LocalDate;
import java.time.Period;

public class Persona {
	private Long dni;
	private String nombre;
	private LocalDate fechaNacimiento;
	private LocalDate fechaActual;
	private Period anios;
	private int año1;
	private String provincia;
	
	public Persona() {
		// TODO Auto-generated constructor stub
	}
	
	public Persona(Long dni, String nombre, LocalDate fechaNacimiento, LocalDate fechaActual, Period anios, int año1, String provincia) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.fechaActual = fechaActual;
		this.anios = anios;
		this.año1 = año1;
		this.provincia = provincia;
	}

	@Override
	public String toString() {
		return "Datos [dni=" + dni + ", nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento + ", año=" + año1 + ", provincia="
				+ provincia + "]";
	}

	public double getDni() {
		return dni;
	}

	public void setDni(Long dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public LocalDate getFechaActual() {
		return fechaActual;
	}

	public void setFechaActual(LocalDate fechaActual) {
		this.fechaActual = fechaActual;
	}

	public Period getAnios() {
		return anios;
	}

	public void setAnios(Period anios) {
		this.anios = anios;
	}

	public int getAño1() {
		return año1;
	}

	public void setAño1(int año1) {
		this.año1 = año1;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	
}	

	




