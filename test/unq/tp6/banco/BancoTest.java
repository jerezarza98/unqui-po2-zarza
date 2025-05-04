package unq.tp6.banco;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.poo2.tp6.banco.AnalizadorDeCreditos;
import ar.edu.unq.poo2.tp6.banco.AnalizadorDeCreditosInterface;
import ar.edu.unq.poo2.tp6.banco.Banco;
import ar.edu.unq.poo2.tp6.banco.Cliente;
import ar.edu.unq.poo2.tp6.banco.EvaluadorDeCreditoInterface;
import ar.edu.unq.poo2.tp6.banco.EvaluadorDeCreditoPersonal;
import ar.edu.unq.poo2.tp6.banco.GestorDeClientes;
import ar.edu.unq.poo2.tp6.banco.GestorDeClientesInterface;
import ar.edu.unq.poo2.tp6.banco.SolicitudDeCredito;

class BancoTest {
	
	private Banco banco;
	private GestorDeClientesInterface gestorDeClientes;
	private AnalizadorDeCreditosInterface analizadorDeCreditos;
	private Cliente cliente;
	private SolicitudDeCredito solicitudDeCredito;
	private EvaluadorDeCreditoInterface evaluador;
	
	@BeforeEach
	public void setUp() {
		gestorDeClientes = new GestorDeClientes();
		analizadorDeCreditos = new AnalizadorDeCreditos();
		banco = new Banco(gestorDeClientes, analizadorDeCreditos);
		cliente = new Cliente("Pepe", "Perez", "420, Paper St. Wilmington, DE 19886", 27, 250000);
		evaluador = new EvaluadorDeCreditoPersonal();
		solicitudDeCredito = new SolicitudDeCredito(cliente, 600000, 4, evaluador);
	}

	@Test
	void testConstructor() {
		
		assertEquals(banco.getCantidadDeClientes(), 0);
		assertEquals(banco.getCantidadDeSolicitudesDeCreditos(), 0);
		assertEquals(banco.getMontoTotalADesembolsar(), 0);
	} 
	
	@Test
	void testAgregarCliente() {
		
		banco.agregarCliente(cliente);
		
		assertEquals(banco.getCantidadDeClientes(), 1);
	}
	
	@Test
	void testAgregarSolicitudDeCredito() {
		banco.agregarSolicitudDeCredito(solicitudDeCredito);
		
		assertEquals(banco.getCantidadDeSolicitudesDeCreditos(), 1);
	}
	
	@Test
	void testGetMontoTotalAPagarCuandoSeApruebaUnaSolicitudesDeCreditos() {
		banco.agregarSolicitudDeCredito(solicitudDeCredito);
		
		assertEquals(banco.getMontoTotalADesembolsar(), solicitudDeCredito.getMontoSolicitado());
	}
	
	@Test
	void testGetMontoTotalAPagarCuandoNoSeApruebanSolicitudesDeCreditos() {
		cliente = new Cliente("Pepe", "Perez", "420, Paper St. Wilmington, DE 19886", 27, 600);
		solicitudDeCredito = new SolicitudDeCredito(cliente, 800000, 5, evaluador);
		
		banco.agregarSolicitudDeCredito(solicitudDeCredito);
		
		assertEquals(banco.getMontoTotalADesembolsar(), 0);
	}

}
