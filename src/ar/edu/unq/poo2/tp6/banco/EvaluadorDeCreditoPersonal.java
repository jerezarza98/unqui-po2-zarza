package ar.edu.unq.poo2.tp6.banco;

public class EvaluadorDeCreditoPersonal implements EvaluadorDeCreditoInterface{
	
	@Override
	public boolean esAceptado(SolicitudDeCredito solicitudDeCredito) {
		
		Cliente cliente= solicitudDeCredito.getCliente();
		return cliente.getSueldoNetoAnual() >= 15000 & solicitudDeCredito.getMontoDeLaCuotaMensual() < cliente.getSueldoNetoMensual() * 0.70;
	}
}
