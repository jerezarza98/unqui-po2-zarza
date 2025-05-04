package unq.tp6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.poo2.tp6.Cliente;
import ar.edu.unq.poo2.tp6.EvaluadorDeCreditoInterface;
import ar.edu.unq.poo2.tp6.EvaluadorDeCreditoPersonal;
import ar.edu.unq.poo2.tp6.SolicitudDeCredito;

class SolicitudDeCreditoPersonalTest {
	
	private Cliente cliente;
	private EvaluadorDeCreditoInterface evaluador;
	private SolicitudDeCredito solicitudDeCredito;
	
	@BeforeEach
	public void setUp() {
		cliente = new Cliente("Pepe", "Perez", "420, Paper St. Wilmington, DE 19886", 27, 250000);
		evaluador = new EvaluadorDeCreditoPersonal();
		solicitudDeCredito = new SolicitudDeCredito(cliente, 600000, 4, evaluador);
	}

	@Test
	void testConstructor() {

		assertEquals(solicitudDeCredito.getCliente(), cliente);
		assertEquals(solicitudDeCredito.getMontoSolicitado(), 600000);
		assertEquals(solicitudDeCredito.getPlazoEnMeses(), 4);
		assertEquals(solicitudDeCredito.getEvaluadorDeCredito(), evaluador);
	}
	
	@Test
	void testGetMontoDeLaCuotaMensual() {
		
		assertEquals(solicitudDeCredito.getMontoDeLaCuotaMensual(), 150000);
	}

}
