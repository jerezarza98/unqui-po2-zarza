package ar.edu.unq.poo2.tp6.banco;

public class EvaluadorDeCreditoHipotecario implements EvaluadorDeCreditoInterface{
	
	@Override
	public boolean esAceptado(SolicitudDeCredito solicitudDeCredito) {
		
		SolicitudDeCreditoHipotecario solicitud = (SolicitudDeCreditoHipotecario) solicitudDeCredito;
		
		Cliente cliente = solicitudDeCredito.getCliente();
		PropiedadInmobiliaria propiedad = solicitud.getPropiedadInmobiliaria();
		
		return solicitud.getMontoDeLaCuotaMensual() < cliente.getSueldoNetoMensual() * 0.50 & solicitud.getMontoSolicitado() < propiedad.getValorFiscal() * 0.70 & cliente.getEdad() + (solicitud.getPlazoEnMeses() / 12) < 65;
	}
}
