package ar.edu.unq.poo2.tp4.mercado;

abstract class Producto {
	
	private double precioBase;
	private int stock;
	
	public Producto(double precio, int stock) {
		this.precioBase = precio;
		this.stock = stock;
	}
	
	public double getPrecioBase() {
		return this.precioBase;
	}
	
	public int getStock() {
		return this.stock;
	}
	
	abstract double getPrecio();
	
	public void descrementarStock() {
		this.stock--;
	}
	

}
