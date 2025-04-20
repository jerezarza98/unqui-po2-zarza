package ar.edu.unq.poo2.tp5.mercado;

public class ProductoEmpresa extends Producto{
	
	public ProductoEmpresa(double precio, int stock) {
		super(precio, stock);
	}
	
	public double getPrecio() {
		return super.getPrecioBase();
	}
}
