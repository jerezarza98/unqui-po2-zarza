package ar.edu.unq.poo2.tp6;

public class SolicitudDeCreditoHipotecario extends SolicitudDeCredito{
	
	private PropiedadInmobiliaria propiedad;
	
	public SolicitudDeCreditoHipotecario(Cliente cliente, double montoSolicitado, int plazoEnMeses, EvaluadorDeCreditoInterface evaluador, PropiedadInmobiliaria propiedad) {
		super(cliente, montoSolicitado, plazoEnMeses, evaluador);
		this.propiedad = propiedad;
	}
	
	public PropiedadInmobiliaria getPropiedadInmobiliaria() {
		return this.propiedad;
	}

}
