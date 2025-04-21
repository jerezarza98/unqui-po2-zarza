package ar.edu.unq.poo2.tp5.mercado;


public class Caja {

	private double montoAPagar;
	private Agencia agencia;
	
	public Caja(Agencia agencia) {
		this.montoAPagar = 0;
		this.agencia = agencia;
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
	
	public void registrarFactura(Factura factura) {
		this.montoAPagar += factura.getMontoAPagar();
		this.agencia.registrarPago(factura);
	}
}
