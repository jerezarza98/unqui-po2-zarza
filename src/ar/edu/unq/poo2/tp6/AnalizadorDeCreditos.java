package ar.edu.unq.poo2.tp6;

import java.util.ArrayList;

public class AnalizadorDeCreditos implements AnalizadorDeCreditosInterface {
	
	@Override
	public double getMontoTotalADesembolsar(ArrayList<SolicitudDeCredito> solicitudesDeCreditos) {
		
		double montoTotal = 0;
		
		for(SolicitudDeCredito solicitudDeCredito: solicitudesDeCreditos) {
			EvaluadorDeCreditoInterface evaluador = solicitudDeCredito.getEvaluadorDeCredito(); 
			if(evaluador.esAceptado(solicitudDeCredito)) {
				montoTotal = solicitudDeCredito.getMontoSolicitado();
			}
		}
		
		return montoTotal;
	}
}
