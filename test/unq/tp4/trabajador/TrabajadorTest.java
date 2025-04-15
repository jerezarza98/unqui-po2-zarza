package unq.tp4.trabajador;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.poo2.tp4.trabajador.Ingreso;
import ar.edu.unq.poo2.tp4.trabajador.IngresoPorHorasExtras;
import ar.edu.unq.poo2.tp4.trabajador.Trabajador;

class TrabajadorTest {
	
	private Trabajador trabajador;
	private Ingreso enero, febrero, marzo, abril, mayo, junio, julio, agosto, septiembre, octubre, noviembre, diciembre;
	
	@BeforeEach
	public void setUp() {
		
		trabajador = new Trabajador();
		
		enero = new Ingreso("Enero", "Sueldo", 200);
		febrero = new Ingreso("Febrero", "Bono", 150);
		marzo = new Ingreso("Marzo", "Sueldo", 300);
		abril = new IngresoPorHorasExtras("Abril", "Horas Extras", 400, 6);
		mayo = new Ingreso("Mayo", "Sueldo", 250);
		junio = new Ingreso("Junio", "Sueldo", 230);
		julio = new Ingreso("Julio", "Bono", 300);
		agosto = new Ingreso("Agosto", "Sueldo", 400);
		septiembre = new IngresoPorHorasExtras("Septiembre", "HorasExtras", 350, 3);
		octubre = new IngresoPorHorasExtras("Octubre", "Horas Extras", 350, 4);
		noviembre = new Ingreso("Noviembre", "Sueldo", 150);
		diciembre = new Ingreso("Diciembre", "Bono", 450);
	}
	
	

	@Test
	void testTotalPercibido() {
		assertEquals(trabajador.getTotalPercibido(), 0);
		
		trabajador.agregarIngreso(enero);
		trabajador.agregarIngreso(abril);
		
		assertEquals(trabajador.getTotalPercibido(), 600);
	}
	
	@Test
	void testMontoImponible() {
		assertEquals(trabajador.getMontoImponible(), 0);
		
		trabajador.agregarIngreso(enero);
		trabajador.agregarIngreso(abril);
		
		assertEquals(trabajador.getMontoImponible(), 200);
	}
	
	@Test
	void testImpuestoAPagar() {
		assertEquals(trabajador.getImpuestoAPagar(), 0);
		
		trabajador.agregarIngreso(enero);
		trabajador.agregarIngreso(febrero);
		trabajador.agregarIngreso(marzo);
		trabajador.agregarIngreso(abril);
		trabajador.agregarIngreso(mayo);
		trabajador.agregarIngreso(junio);
		trabajador.agregarIngreso(julio);
		trabajador.agregarIngreso(agosto);
		trabajador.agregarIngreso(septiembre);
		trabajador.agregarIngreso(octubre);
		trabajador.agregarIngreso(noviembre);
		trabajador.agregarIngreso(diciembre);
		
		assertEquals(trabajador.getImpuestoAPagar(), 48.6);
	}

}
