package ar.edu.unq.poo2.tp6;

public class Cliente {
	
	private String nombre, apellido, direccion;
	private int edad;
	private double sueldoNetoMensual;
	
	public Cliente(String nombre, String apellido, String direccion, int edad, double sueldoNetoMensual) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.edad = edad;
		this.sueldoNetoMensual = sueldoNetoMensual;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public String getApellido() {
		return this.apellido;
	}
	
	public String getDireccion() {
		return this.direccion;
	}
	
	public int getEdad() {
		return this.edad;
	}
	
	public double getSueldoNetoMensual() {
		return this.sueldoNetoMensual;
	}
	
	public double getSueldoNetoAnual() {
		return this.sueldoNetoMensual * 12;
	}
	

}
