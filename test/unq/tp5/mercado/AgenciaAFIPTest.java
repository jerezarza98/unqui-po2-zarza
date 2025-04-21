package unq.tp5.mercado;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.poo2.tp5.mercado.AgenciaAFIP;
import ar.edu.unq.poo2.tp5.mercado.FacturaDeImpuestos;

class AgenciaAFIPTest {
	
	private AgenciaAFIP agencia;
	
	@BeforeEach
	public void setUP() {
		agencia = new AgenciaAFIP();
	}

	@Test
	void testConstructo() {
		assertEquals(agencia.getCantidadDePagos(), 0);
	}
	
	@Test
	void testRegistrarUnPago() {
		agencia.registrarPago(new FacturaDeImpuestos(500));
		
		assertEquals(agencia.getCantidadDePagos(), 1);
	}

}
