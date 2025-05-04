package unq.tp6.banco;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.poo2.tp6.banco.Cliente;
import ar.edu.unq.poo2.tp6.banco.GestorDeClientes;
import ar.edu.unq.poo2.tp6.banco.GestorDeClientesInterface;

class GestorDeClientesTest {
	
	private Cliente cliente;
	private GestorDeClientesInterface gestor;

	@BeforeEach
	public void setUp() {
		cliente = new Cliente("Pepe", "Perez", "420, Paper St. Wilmington, DE 19886", 27, 250000);
		gestor = new GestorDeClientes();
	}
	
	@Test
	void testConstructor() {

		assertEquals(gestor.getCantidadDeClientes(), 0);
	}
	
	@Test
	void testAgregarCliente() {
		
		gestor.agregarCliente(cliente);
		
		assertEquals(gestor.getCantidadDeClientes(), 1);
	}

}
