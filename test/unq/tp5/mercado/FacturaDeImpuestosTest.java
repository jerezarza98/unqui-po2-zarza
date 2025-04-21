package unq.tp5.mercado;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.poo2.tp5.mercado.FacturaDeImpuestos;

class FacturaDeImpuestosTest {
	
	private FacturaDeImpuestos factura;
	
	@BeforeEach
	public void setUp() {
		factura = new FacturaDeImpuestos(500);
	}

	@Test
	void testConstructor() {
		assertEquals(factura.getMontoFijo(), 500);
	}
	
	@Test
	void testMontoAPagar() {
		assertEquals(factura.getMontoAPagar(), 500);
	}

}
