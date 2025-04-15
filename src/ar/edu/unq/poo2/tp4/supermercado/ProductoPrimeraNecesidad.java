package ar.edu.unq.poo2.tp4.supermercado;

public class ProductoPrimeraNecesidad extends Producto{
	public ProductoPrimeraNecesidad(String nombre, double precio, boolean esPrecioCuidado) {
		super(nombre, precio, esPrecioCuidado);
	}
	
	public ProductoPrimeraNecesidad(String nombre, double precio) {
		super(nombre, precio);
	}
	
	@Override
	public double getPrecio() {
		return super.getPrecio() * 0.9;
	}
}
