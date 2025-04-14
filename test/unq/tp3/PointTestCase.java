package unq.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ar.edu.unq.poo2.tp3.ejercicios8Y9.Point;

class PointTestCase {

	@Test
	void testUnPointSeInicializaConCoordenadas() {
		Point point = new Point(3, 6);
		
		assertEquals(point.getX(), 3);
		assertEquals(point.getY(), 6);
	}
	
	@Test
	void testUnPointSeInicializaSinCoordenadas() {
		Point point = new Point();
		
		assertEquals(point.getX(), 0);
		assertEquals(point.getY(), 0);
	}
	
	@Test
	void testUnPointSeMueveAOTraPosicion() {
		Point point = new Point();
		
		point.moverA(5, 8);
		
		assertEquals(point.getX(), 5);
		assertEquals(point.getY(), 8);
	}
	
	@Test
	void testUnPointSeUneConOtro() {
		Point point = new Point(4, 7);
		Point otroPoint = new Point(5, 9);
		
		Point newPoint = point.unirCon(otroPoint);
		
		assertEquals(newPoint.getX(), 9);
		assertEquals(newPoint.getY(), 16);
	}

}
