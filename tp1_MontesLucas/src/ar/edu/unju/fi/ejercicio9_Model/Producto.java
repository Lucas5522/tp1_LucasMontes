package ar.edu.unju.fi.ejercicio9_Model;

public class Producto {
	private String nombre;
	private int codigo;
	private double precio;
	private int descuento;
	private double total;
	private double total1;
	
	
	public void calcularDescuento() {
		if (descuento != 0) {
			total = (precio * descuento)/ 100;
			total1= precio - total;
		}else {
			total1 = precio;
		}
		System.out.println("El precio del producto es: " + total1);
	}
	
	public Producto(String nombre, int codigo, double precio, int descuento, double total) {
		super();
		this.nombre = nombre;
		this.codigo = codigo;
		this.precio = precio;
		this.descuento = descuento;
		this.total = total;
	}
	
	public Producto() {
		// TODO Auto-generated constructor stub
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getDescuento() {
		return descuento;
	}
	public void setDescuento(int descuento) {
		this.descuento = descuento;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	
	
}
