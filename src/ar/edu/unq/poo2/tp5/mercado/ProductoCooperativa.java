package ar.edu.unq.poo2.tp5.mercado;

public class ProductoCooperativa extends Producto {
	
	public ProductoCooperativa(double precio, int stock) {
		super(precio, stock);
	}
	
	public double getPrecio() {
		double descuento = super.getPrecioBase() * 0.1;
		return super.getPrecioBase() - descuento;
	}
}
