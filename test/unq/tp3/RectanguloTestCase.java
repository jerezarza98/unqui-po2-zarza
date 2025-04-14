package unq.tp3;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ar.edu.unq.poo2.tp3.ejercicios8Y9.*;


class RectanguloTestCase {
	
	private Point ubicacion;
	private RectanguloConcreto rectangulo;
	private Point ubicacionCuadrado;
	private Cuadrado cuadrado;
	
	@BeforeEach
	public void setUp() throws Exception {
	    ubicacion = new Point(3, 8);
		rectangulo = new RectanguloConcreto(7, 4, ubicacion);
		ubicacionCuadrado = new Point(6, 9);
		cuadrado = new Cuadrado(4, ubicacionCuadrado);
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
		 RectanguloConcreto otroRectangulo = new RectanguloConcreto(3, 9, new Point());
		 
		 assertTrue(otroRectangulo.esVertical());
	 }
	 
	 @Test
	 void testUnCuadradoTieneLadoYUbicacion() {
		 assertEquals(cuadrado.getLado(), 4);
	 }
	 
	 @Test
	 void testUnCuadradoCalculaSuPerimetro() {
		 assertEquals(cuadrado.getPerimetro(), 16);
	 }

}
