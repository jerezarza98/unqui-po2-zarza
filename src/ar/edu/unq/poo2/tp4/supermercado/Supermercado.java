package ar.edu.unq.poo2.tp4.supermercado;

import java.util.ArrayList;
import java.util.List;

public class Supermercado {
	private String nombre, direccion;
	private List<Producto> productos;
	
	public Supermercado(String nombre, String direccion) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.productos = new ArrayList<Producto>();
	}
	
	public int getCantidadDeProductos() {
		return this.productos.size();
	}
	
	public double getPrecioTotal() {
		double total = 0;
		
		for(Producto producto: this.productos) {
			total += producto.getPrecio();
		}
		
		return total;
	}
	
	public void agregarProducto(Producto producto) {
		this.productos.add(producto);
	}
}
