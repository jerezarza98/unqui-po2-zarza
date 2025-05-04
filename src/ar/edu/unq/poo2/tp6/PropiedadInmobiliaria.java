package ar.edu.unq.poo2.tp6;

public class PropiedadInmobiliaria {
	
	private String descripcion, direccion;
	private double valorFiscal;
	
	public PropiedadInmobiliaria(String descripcion, String direccion, double valorFiscal) {
		this.descripcion = descripcion;
		this.direccion = direccion;
		this.valorFiscal = valorFiscal;
	}
	
	public String getDescripcion() {
		return this.descripcion;
	}
	
	public String getDireccion() {
		return this.direccion;
	}
	
	public double getValorFiscal() {
		return this.valorFiscal;
	}

}
