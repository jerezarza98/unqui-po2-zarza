package unq;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ar.edu.unq.poo2.tp3.multiplos.Multiplo;

class MultiploTestCase {

	@Test
	void testMultiploDeXEY() {
		Multiplo multiplo = new Multiplo();
		
		int numero = multiplo.multiplo(3, 9);
		
		assertEquals(numero, 999);
 	}
	
	@Test
	void testSinMultiploDeXEY() {
		Multiplo multiplo = new Multiplo();
		
		int numero = multiplo.multiplo(3, 1001);
		
		assertEquals(numero, -1);
	}

}
