package ar.edu.unq.poo2.tp4.supermercado;

public class ProductoPrimeraNecesidad extends Producto{
	
	private double descuento;
	
	public ProductoPrimeraNecesidad(String nombre, double precio, boolean esPrecioCuidado, double descuento) {
		super(nombre, precio, esPrecioCuidado);
		this.descuento = descuento / 100.0;
	}
	
	public ProductoPrimeraNecesidad(String nombre, double precio) {
		super(nombre, precio);
	}
	
	@Override
	public double getPrecio() {
		return super.getPrecio() - (super.getPrecio() * this.descuento);
	}
}
