package ar.edu.unq.poo2.tp5.mercado;


public class Caja {

	private double montoAPagar;
	
	public Caja() {
		this.montoAPagar = 0;
	}

	
	public double getMontoTotalAPagar() {
		double monto = this.montoAPagar;
		this.montoAPagar = 0;
		
		return monto;
	}
	
	public void registrarProducto(Producto producto) {
		this.montoAPagar += producto.getPrecio();
		producto.descrementarStock();
	}
}
