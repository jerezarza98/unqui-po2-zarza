package ar.edu.unq.poo2.tp5.mercado;

public class FacturaDeImpuestos implements Factura{
	
	private double montoFijo;
	
	public FacturaDeImpuestos(double montoFijo) {
		this.montoFijo = montoFijo;
	}
	
	public double getMontoFijo() {
		return this.montoFijo;
	}
	
	public double getMontoAPagar() {
		return this.montoFijo;
	}
}
