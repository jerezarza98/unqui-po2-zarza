package unq.tp6.banco;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.poo2.tp6.banco.Cliente;
import ar.edu.unq.poo2.tp6.banco.EvaluadorDeCreditoHipotecario;
import ar.edu.unq.poo2.tp6.banco.EvaluadorDeCreditoInterface;
import ar.edu.unq.poo2.tp6.banco.PropiedadInmobiliaria;
import ar.edu.unq.poo2.tp6.banco.SolicitudDeCreditoHipotecario;

class SolicitudDeCreditoHipotecarioTest {
	
	private Cliente cliente;
	private EvaluadorDeCreditoInterface evaluador;
	private SolicitudDeCreditoHipotecario solicitudDeCredito;
	private PropiedadInmobiliaria propiedad;
	
	@BeforeEach
	public void setUp() {
		cliente = new Cliente("Pepe", "Perez", "420, Paper St. Wilmington, DE 19886", 27, 250000);
		evaluador = new EvaluadorDeCreditoHipotecario();
		solicitudDeCredito = new SolicitudDeCreditoHipotecario(cliente, 600000, 4, evaluador, propiedad);
	}

	@Test
	void testConstructor() {
		
		assertEquals(solicitudDeCredito.getCliente(), cliente);
		assertEquals(solicitudDeCredito.getMontoSolicitado(), 600000);
		assertEquals(solicitudDeCredito.getPlazoEnMeses(), 4);
		assertEquals(solicitudDeCredito.getPropiedadInmobiliaria(), propiedad);
	}
	
	@Test
	void testGetMontoDeLaCuotaMensual() {
		
		assertEquals(solicitudDeCredito.getMontoDeLaCuotaMensual(), 150000);
	}

}
