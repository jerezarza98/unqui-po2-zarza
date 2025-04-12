package unq;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.poo2.tp3.multioperador.Multioperador;

class MultioperadorTestCase {

private Multioperador multioperador;
	
	@BeforeEach
	public void setUp() throws Exception {
		multioperador = new Multioperador();
	}

	@Test
	void testSuma() {
		int resultado = multioperador.sumar(5, 5);
		
		assertEquals(resultado, 10);
	}
	
	@Test
	void testResta() {
		int resultado = multioperador.restar(6,  3);
		
		assertEquals(resultado, 3);
	}
	
	@Test
	void testMultiplicacion() {
		int resultado = multioperador.multiplicar(3, 2);
		
		assertEquals(resultado, 6);
	}

}
