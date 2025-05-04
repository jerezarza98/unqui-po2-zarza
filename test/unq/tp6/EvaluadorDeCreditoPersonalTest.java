package unq.tp6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.poo2.tp6.Cliente;
import ar.edu.unq.poo2.tp6.EvaluadorDeCreditoInterface;
import ar.edu.unq.poo2.tp6.EvaluadorDeCreditoPersonal;
import ar.edu.unq.poo2.tp6.SolicitudDeCredito;

class EvaluadorDeCreditoPersonalTest {
	
	private Cliente cliente;
	private SolicitudDeCredito solicitud;
	private EvaluadorDeCreditoInterface evaluador;

	@BeforeEach
	public void setUp() {
		cliente = new Cliente("Pepe", "Perez", "420, Paper St. Wilmington, DE 19886", 27, 250000);
		evaluador = new EvaluadorDeCreditoPersonal();
		solicitud = new SolicitudDeCredito(cliente, 800000, 5, evaluador);
	}
	
	@Test
	void testEsAceptado() {
		
		assertEquals(evaluador.esAceptado(solicitud), true);
	}
	
	@Test
	void testNoEsAceptadoCuandoElSueldoNetoAnualDelClienteEsMenorA15000() {
		
		cliente = new Cliente("Pepe", "Perez", "420, Paper St. Wilmington, DE 19886", 27, 600);
		solicitud = new SolicitudDeCredito(cliente, 800000, 5, evaluador);
		
		assertEquals(evaluador.esAceptado(solicitud), false);
	}
	
	@Test
	void testNoEsAceptadoCuandoElMontoMensualDeLaSolicitudSuperaLos70PorcientosDelSueldoMensualDelCliente() {
		
		solicitud = new SolicitudDeCredito(cliente, 800000, 4, evaluador);
		
		assertEquals(evaluador.esAceptado(solicitud), false);
	}
	
	

}
