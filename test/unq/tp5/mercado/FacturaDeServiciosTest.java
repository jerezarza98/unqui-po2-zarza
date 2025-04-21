package unq.tp5.mercado;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.poo2.tp5.mercado.FacturaDeServicios;

class FacturaDeServiciosTest {
	
	private FacturaDeServicios factura;

	@BeforeEach
	public void setUp() {
		factura = new FacturaDeServicios(57.8, 78);
	}
	
	@Test
	void testConstructor() {
		assertEquals(factura.getCostoPorUnidadConsumida(), 57.8);
		assertEquals(factura.getCantidadDeUnidadesConsumidas(), 78);
	}
	
	@Test
	void testMontoAPagar() {
		assertEquals(factura.getMontoAPagar(), 4508.4);
	}

}
