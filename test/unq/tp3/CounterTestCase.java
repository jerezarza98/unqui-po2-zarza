package unq.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.poo2.tp3.counter.Counter;

class CounterTestCase {

	private Counter counter;
	
	@BeforeEach
	public void setUp() throws Exception {
		counter = new Counter();
		
		counter.addNumero(1);
		counter.addNumero(3);
		counter.addNumero(5);
		counter.addNumero(7);
		counter.addNumero(9);
		counter.addNumero(1);
		counter.addNumero(1);
		counter.addNumero(1);
		counter.addNumero(1);
		counter.addNumero(4);
	}
	
	@Test
	public void testNumerosPares() {
		int cantidad = counter.getCantidadDePares();
		
		assertEquals(cantidad, 1);
	}
	
	@Test
	public void testNumerosImpares() {
		int cantidad = counter.getCantidadDeImpares();
		
		assertEquals(cantidad, 9);
	}
	
	@Test
	public void testNumerosMultiplos() {
		int cantidad = counter.getCantidadDeMultiplosDe(3);
		
		assertEquals(cantidad, 2);
	}

}
