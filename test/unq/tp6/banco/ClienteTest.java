package unq.tp6.banco;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.poo2.tp6.banco.Cliente;

class ClienteTest {
	
	private Cliente cliente;
	
	@BeforeEach
	public void setUp() {
		cliente = new Cliente("Pepe", "Perez", "420, Paper St. Wilmington, DE 19886", 27, 250000);
	}

	@Test
	void testConstructor() {
		
		assertEquals(cliente.getNombre(), "Pepe");
		assertEquals(cliente.getApellido(), "Perez");
		assertEquals(cliente.getDireccion(), "420, Paper St. Wilmington, DE 19886");
		assertEquals(cliente.getEdad(), 27);
		assertEquals(cliente.getSueldoNetoMensual(), 250000);
	}
	
	@Test
	void testGetSueldoNetoAnual() {
		
		assertEquals(cliente.getSueldoNetoAnual(), 3000000);
	}

}
