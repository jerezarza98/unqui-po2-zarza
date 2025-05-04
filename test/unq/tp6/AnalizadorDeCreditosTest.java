package unq.tp6;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.poo2.tp6.AnalizadorDeCreditos;
import ar.edu.unq.poo2.tp6.AnalizadorDeCreditosInterface;
import ar.edu.unq.poo2.tp6.Cliente;
import ar.edu.unq.poo2.tp6.EvaluadorDeCreditoInterface;
import ar.edu.unq.poo2.tp6.EvaluadorDeCreditoPersonal;
import ar.edu.unq.poo2.tp6.SolicitudDeCredito;

class AnalizadorDeCreditosTest {
	
	private AnalizadorDeCreditosInterface analizador;
	private ArrayList<SolicitudDeCredito> solicitudes;
	private SolicitudDeCredito solicitud;
	private Cliente cliente;
	private EvaluadorDeCreditoInterface evaluador;
	
	@BeforeEach
	public void setUp() {
		analizador = new AnalizadorDeCreditos();
		solicitudes = new ArrayList<SolicitudDeCredito>();
		cliente = new Cliente("Pepe", "Perez", "420, Paper St. Wilmington, DE 19886", 27, 250000);
		evaluador = new EvaluadorDeCreditoPersonal();
		solicitud = new SolicitudDeCredito(cliente, 800000, 4, evaluador);
	}

	@Test
	void testContructor() {

		assertEquals(analizador.getMontoTotalADesembolsar(solicitudes), 0);
	}
	
	@Test
	void testGetMontoTotalADesembolsarCuandoHaySolicitudesDeCreditosQueNoFueronAprobados() {
		
		solicitudes.add(solicitud);
		
		assertEquals(analizador.getMontoTotalADesembolsar(solicitudes), 0);
	}
	
	@Test
	void testGetMontoTotalADesembolsarCuandoHaySolicitudesDeCreditosAprobados() {
		
		solicitud = new SolicitudDeCredito(cliente, 800000, 5, evaluador);
		
		solicitudes.add(solicitud);
		
		assertEquals(analizador.getMontoTotalADesembolsar(solicitudes), 800000);
	}

}
