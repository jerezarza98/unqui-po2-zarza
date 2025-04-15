package ar.edu.unq.poo2.tp4.trabajador;

public class IngresoPorHorasExtras extends Ingreso {
	
	private int horasExtras;
	
	public IngresoPorHorasExtras(String mes, String concepto, double montoPercibido, int horasExtras) {
		super(mes, concepto, montoPercibido);
		this.horasExtras = horasExtras;
	}
	
	public int getHorasExtras() {
		return this.horasExtras;
	}
	
	@Override
	public double getMontoImponibleAlImpuestoAlTrabajador() {
		return 0;
	}
	}
