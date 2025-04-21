package ar.edu.unq.poo2.tp5.mercado;

import java.util.ArrayList;


public class AgenciaAFIP implements Agencia {
	
	private ArrayList<Double> pagos;
	
	public AgenciaAFIP() {
		this.pagos = new ArrayList<>();
	}
	
	public int getCantidadDePagos() {
		return this.pagos.size();
	}
	
	public void registrarPago(Factura factura) {
		this.pagos.add(factura.getMontoAPagar());
	}

}
