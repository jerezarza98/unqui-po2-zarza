package ar.edu.unq.poo2.tp6;

public class SolicitudDeCredito {
	
	private Cliente cliente;
	private double montoSolicitado;
	private int plazoEnMeses;
	private EvaluadorDeCreditoInterface evaluador;
	
	public SolicitudDeCredito(Cliente cliente, double montoSolicitado, int plazoEnMeses, EvaluadorDeCreditoInterface evaluador) {
		this.cliente = cliente;
		this.montoSolicitado = montoSolicitado;
		this.plazoEnMeses = plazoEnMeses;
		this.evaluador = evaluador;
	}
	
	public Cliente getCliente() {
		return this.cliente;
	}
	
	public double getMontoSolicitado() {
		return this.montoSolicitado;
	}
	
	public int getPlazoEnMeses() {
		return this.plazoEnMeses;
	}
	
	public EvaluadorDeCreditoInterface getEvaluadorDeCredito() {
		return this.evaluador;
	}
	
	public double getMontoDeLaCuotaMensual() {
		return this.montoSolicitado / this.plazoEnMeses;
	}
}
