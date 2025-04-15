package unq.tp4.trabajador;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.poo2.tp4.trabajador.Ingreso;

class IngresoTest {
	
	private Ingreso enero;
	
	@BeforeEach
	public void setUp() {
		enero = new Ingreso("Enero", "Sueldo", 200);
		
	}

	@Test
	void testConstructo() {
		assertEquals(enero.getMes(), "Enero");
		assertEquals(enero.getConcepto(), "Sueldo");
		assertEquals(enero.getMontoPercibido(), 200);
	}
	
	@Test
	void testMontoAlImpuestoAlTrabajador() {
		assertEquals(enero.getMontoImponibleAlImpuestoAlTrabajador(), 200);
	}

}
