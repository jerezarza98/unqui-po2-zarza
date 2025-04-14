package unq.tp3;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.poo2.tp3.persona.Persona;

class PersonaTestCase {
	
	private Persona persona;
	
	@BeforeEach
	public void setUp() throws Exception {
		persona = new Persona("Jere", LocalDate.of(1999, 11, 05));
	}
	

	@Test
	void testUnaPersonaTieneNombreFechaDeNacimientoYEdad() {

		assertEquals(persona.getNombre(), "Jere");
		assertEquals(persona.getFechaDeNacimiento(), LocalDate.of(1999, 11, 05));
		assertEquals(persona.getEdad(), 26);
	}
	
	@Test
	void testUnaPersonaEsMenorQueOtraPersona() {
		Persona otraPersona = new Persona("Pepe", LocalDate.of(1990, 12, 04));
		
		assertTrue(persona.menorQue(otraPersona));
	}
	
	@Test
	void testUnaPersonaNoEsMenorQueOtraPersona() {
		Persona otraPersona = new Persona("Pepe", LocalDate.of(2000, 12, 04));
		
		assertFalse(persona.menorQue(otraPersona));
	}

}
