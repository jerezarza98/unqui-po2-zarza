package unq.tp4.trabajador;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.poo2.tp4.trabajador.IngresoPorHorasExtras;

class IngresoPorHorasExtrasTest {
	
	private IngresoPorHorasExtras enero;
	
	@BeforeEach
	public void setUp() {
		enero = new IngresoPorHorasExtras("Enero", "Sueldo", 300, 3);
	}

	@Test
	void testConstructor() {
		assertEquals(enero.getMes(), "Enero");
		assertEquals(enero.getConcepto(), "Sueldo");
		assertEquals(enero.getMontoPercibido(), 300);
		assertEquals(enero.getHorasExtras(), 3);
	}
	
	@Test
	void testMontoImponibleAlImpuestoAlTrabajador() {
		assertEquals(enero.getMontoImponibleAlImpuestoAlTrabajador(), 0);
	}

}
