package ar.edu.unju.fi.ejercicio12_Model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Persona {
	private String nombre;
	private String fechaNacimiento;
	private Date anioActual;
	private int anioPersona;
	private Date anio;
	private int mes;
	private int dia;
	Scanner scanner = new Scanner(System.in);
	Calendar calendar = Calendar.getInstance();
	
	
	public void calcularAnio() {
		System.out.println("Nombre: "+ nombre);
		System.out.println("Fecha de nacimiento: " + fechaNacimiento);
		anioActual = calendar.getTime();
		SimpleDateFormat f = new SimpleDateFormat("dd-MM-yyyy");
		try {
			anio = f.parse(fechaNacimiento);
			int re = (anio.getYear());
			int res = (anioActual.getYear());
			anioPersona = re - res;
			System.out.println("Edad: "+ anioPersona);
		} catch (ParseException e) {
			System.out.println("Error al ingresar la Fecha");
		}
		
	}
	
	public void calcularSigno() {
		mes = anio.getMonth()+1;
		switch (mes) {
		case 1:System.out.println("Signo zodiacal: Capricornio");
		break;
		case 2:System.out.println("Signo zodiacal: Acuario");
		break;
		case 3:System.out.println("Signo zodiacal: Piscis");
		break;
		case 4:System.out.println("Signo zodiacal: Aries");
		break;
		case 5:System.out.println("Signo zodiacal: Tauro");
		break;
		case 6:System.out.println("Signo zodiacal: Geminis");
		break;
		case 7:System.out.println("Signo zodiacal: Cancer");
		break;
		case 8:System.out.println("Signo zodiacal: Leo");
		break;
		case 9:System.out.println("Signo zodiacal: Virgo");
		break;
		case 10:System.out.println("Signo zodiacal: Libra");
		break;
		case 11:System.out.println("Signo zodiacal: Escorpio");
		break;
		case 12:System.out.println("Signo zodiacal: Sagitario");
		break;
		}
	}
	
	
	public void calcularEstacion() {
		if (mes >=1  && mes <=3) {
			System.out.println("Estacion: Verano");
		}
		if (mes >3  && mes <=6) {
			System.out.println("Estacion: Otoño");
		}
		if (mes >6  && mes <=9) {
			System.out.println("Estacion: Invierno");
		}
		if (mes >9  && mes <=12) {
			System.out.println("Estacion: Primavera");
		}
	}
	
public Persona() {
		
		
	}

public Persona(String nombre, String fechaNacimiento, Date anioActual, int anioPersona, Date anio, int mes, int dia) {
	super();
	this.nombre = nombre;
	this.fechaNacimiento = fechaNacimiento;
	this.anioActual = anioActual;
	this.anioPersona = anioPersona;
	this.anio = anio;
	this.mes = mes;
	this.dia = dia;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getFechaNacimiento() {
	return fechaNacimiento;
}

public void setFechaNacimiento(String fechaNacimiento) {
	this.fechaNacimiento = fechaNacimiento;
}

public Date getAnioActual() {
	return anioActual;
}

public void setAnioActual(Date anioActual) {
	this.anioActual = anioActual;
}

public int getAnioPersona() {
	return anioPersona;
}

public void setAnioPersona(int anioPersona) {
	this.anioPersona = anioPersona;
}

public Date getAnio() {
	return anio;
}

public void setAnio(Date anio) {
	this.anio = anio;
}

public int getMes() {
	return mes;
}

public void setMes(int mes) {
	this.mes = mes;
}

public int getDia() {
	return dia;
}

public void setDia(int dia) {
	this.dia = dia;
}
	
	
}
