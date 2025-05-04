package unq.tp6.banco;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.poo2.tp6.banco.PropiedadInmobiliaria;

class PropiedadInmobiliariaTest {
	
	private PropiedadInmobiliaria propiedad;
	
	@BeforeEach
	public void setUp() {
		propiedad = new PropiedadInmobiliaria("Casa", "420, Paper St. Wilmington, DE 19886", 600000);
	}

	@Test
	void testConstructor() {
		
		assertEquals(propiedad.getDescripcion(), "Casa");
		assertEquals(propiedad.getDireccion(), "420, Paper St. Wilmington, DE 19886");
		assertEquals(propiedad.getValorFiscal(), 600000);
	}

}
