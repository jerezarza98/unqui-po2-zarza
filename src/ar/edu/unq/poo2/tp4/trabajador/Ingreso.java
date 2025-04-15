package ar.edu.unq.poo2.tp4.trabajador;

public class Ingreso {
	
	private String mes, concepto;
	private double montoPercibido;
	
	public Ingreso(String mes, String concepto, double montoPercibido) {
		this.mes = mes;
		this.concepto = concepto;
		this.montoPercibido = montoPercibido;
	}
	
	public String getMes() {
		return this.mes;
	}
	
	public String getConcepto() {
		return this.concepto;
	}
	
	public double getMontoPercibido() {
		return this.montoPercibido;
	}
	
	public double getMontoImponibleAlImpuestoAlTrabajador() {
		return this.montoPercibido;
	}
}
