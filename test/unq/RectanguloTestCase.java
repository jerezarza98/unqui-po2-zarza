package unq;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.poo2.tp3.ejercicios8Y9.Point;
import ar.edu.unq.poo2.tp3.ejercicios8Y9.Rectangulo;

class RectanguloTestCase {
	
	private Point ubicacion;
	private Rectangulo rectangulo;
	
	@BeforeEach
	public void setUp() throws Exception {
	    ubicacion = new Point(3, 8);
		rectangulo = new Rectangulo(7, 4, ubicacion);
		
	}

	@Test
	void testUnRectanguloTieneBaseAlturaYUbicacion() {
		
		assertEquals(rectangulo.getBase(), 7);
		assertEquals(rectangulo.getAltura(), 4);
		assertEquals(rectangulo.getUbicacion(), ubicacion);
	}
	
	
	@Test
	void testUnRectanguloCalculaSuArea() {
		
		assertEquals(rectangulo.getArea(), 28);
	}
	
	@Test
	void testUnRectanguloCalculaSuPerimetro() {
		assertEquals(rectangulo.getPerimetro(), 22);
	}
	
	 @Test
	 void testUnRectanguloEsHorizontal() {
		 assertTrue(rectangulo.esHorizontal());
	 }
	 
	 @Test
	 void testUnRectanguloEsVertical() {
		 Rectangulo otroRectangulo = new Rectangulo(3, 9, new Point());
		 
		 assertTrue(otroRectangulo.esVertical());
	 }

}
