package unq.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.poo2.tp3.equipoDeTrabajo.EquipoDeTrabajo;
import ar.edu.unq.poo2.tp3.equipoDeTrabajo.Persona;

class EquipoDeTrabajoTestCase {
	
	private EquipoDeTrabajo equipoDeTrabajo;
	private Persona pepe, daniel, carlos, miguel, luis;
	
	@BeforeEach
	public void setUp() throws Exception {
		equipoDeTrabajo = new EquipoDeTrabajo("Equipo 1");
		pepe = new Persona("Pepe", "Perez", 26);
		daniel = new Persona("Daniel", "Daniels", 29);
		carlos = new Persona("Carlos", "Carles", 22);
		miguel = new Persona("Miguel", "Miguéles", 27);
		luis = new Persona("Luis", "Luque", 23);
	}
	
	public static void main(String[] args) {
		EquipoDeTrabajo equipoDeTrabajoPrueba;
		Persona pepe, daniel, carlos, miguel, luis;
		
		equipoDeTrabajoPrueba = new EquipoDeTrabajo("Equipo 1");
		pepe = new Persona("Pepe", "Perez", 26);
		daniel = new Persona("Daniel", "Daniels", 29);
		carlos = new Persona("Carlos", "Carles", 22);
		miguel = new Persona("Miguel", "Miguéles", 27);
		luis = new Persona("Luis", "Luque", 23);
		
		equipoDeTrabajoPrueba.addPersona(pepe);
		equipoDeTrabajoPrueba.addPersona(daniel);
		equipoDeTrabajoPrueba.addPersona(carlos);
		equipoDeTrabajoPrueba.addPersona(miguel);
		equipoDeTrabajoPrueba.addPersona(luis);
		
		equipoDeTrabajoPrueba.printPromedio();
	}
	
	@Test
	void testUnaPersonaTieneUnNombreUnApellidoYUnaEdad() {
		Persona persona = new Persona("Pepe", "Perez", 28);
		
		assertEquals(persona.getNombre(), "Pepe");
		assertEquals(persona.getApellido(), "Perez");
		assertEquals(persona.getEdad(), 28);
	}

	@Test
	void testUnEquipoDeTrabajoTieneUnNombre() {

		assertEquals(equipoDeTrabajo.getNombre(), "Equipo 1");
	}
	
	@Test
	void testUnEquipoDeTrabajoInicialmenteNoTieneIntegrantes() {
		
		assertEquals(equipoDeTrabajo.getCantidadDePersonas(), 0);
	}
	
	@Test
	void testCuandoAUnEquipoDeTrabajoSeAgregaUnaPersona_laCantidadDePersonasAumenta() {
		
		equipoDeTrabajo.addPersona(new Persona("Pepe", "Perez", 27));
		
		assertEquals(equipoDeTrabajo.getCantidadDePersonas(), 1);
	}
	
	@Test
	void testElPromedioDeEdadEnUnEquipoDeTrabajoVacioEs0() {
		
		assertEquals(equipoDeTrabajo.getPromedioDeEdadDeIntegrantes(), 0);
	}
	
	@Test
	void testElPromedioDeEdadDeUnEquipoDeTrabajoCon5Personas() {
		equipoDeTrabajo.addPersona(pepe);
		equipoDeTrabajo.addPersona(daniel);
		equipoDeTrabajo.addPersona(carlos);
		equipoDeTrabajo.addPersona(miguel);
		equipoDeTrabajo.addPersona(luis);
		
		assertEquals(equipoDeTrabajo.getPromedioDeEdadDeIntegrantes(), 25.4);
	}
}
