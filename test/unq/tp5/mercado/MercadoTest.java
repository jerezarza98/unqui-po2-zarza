package unq.tp5.mercado;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.poo2.tp5.mercado.AgenciaAFIP;
import ar.edu.unq.poo2.tp5.mercado.Caja;
import ar.edu.unq.poo2.tp5.mercado.Mercado;

class MercadoTest {
	
	private Mercado mercado;
	private Caja caja;
	
	@BeforeEach
	public void setUp() {
		mercado = new Mercado();
		caja = new Caja(new AgenciaAFIP());
	}

	@Test
	void testConstructo() {
		assertEquals(mercado.getCantidadDeCajas(), 0);
	}
	
	@Test
	void testAgregarUnaCajaAlMercado() {
		mercado.addCaja(caja);
		
		assertEquals(mercado.getCantidadDeCajas(), 1);
	}

}
