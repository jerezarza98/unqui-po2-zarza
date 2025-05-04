package unq.tp6.banco;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.poo2.tp6.banco.Cliente;
import ar.edu.unq.poo2.tp6.banco.EvaluadorDeCreditoHipotecario;
import ar.edu.unq.poo2.tp6.banco.EvaluadorDeCreditoInterface;
import ar.edu.unq.poo2.tp6.banco.PropiedadInmobiliaria;
import ar.edu.unq.poo2.tp6.banco.SolicitudDeCreditoHipotecario;

class EvaluadorDeCreditoHipotecarioTest {
	
	private Cliente cliente;
	private PropiedadInmobiliaria propiedad;
	private EvaluadorDeCreditoInterface evaluador;
	private SolicitudDeCreditoHipotecario solicitud;
	
	@BeforeEach
	public void setUp() {
		propiedad = new PropiedadInmobiliaria("Casa", "420, Paper St. Wilmington, DE 19886", 600000);
		cliente = new Cliente("Pepe", "Perez", "420, Paper St. Wilmington, DE 19886", 27, 250000);
		evaluador = new EvaluadorDeCreditoHipotecario();
		solicitud = new SolicitudDeCreditoHipotecario(cliente, 300000, 6, evaluador, propiedad);
	}

	@Test
	void testEsAceptado() {
		
		assertEquals(evaluador.esAceptado(solicitud), true);
	}
	
	
	@Test
	void testNoEsAceptadoCuandoLaCuotaMensualSuperaLos50PorcientosDelSueldoNetoMensualDelCliente() {
		cliente = new Cliente("Pepe", "Perez", "420, Paper St. Wilmington, DE 19886", 27, 250000);
		solicitud = new SolicitudDeCreditoHipotecario(cliente, 600000, 4, evaluador, propiedad);
		
		assertEquals(evaluador.esAceptado(solicitud), false);
	}
	
	@Test
	void testNoEsAceptadoCuandoElMontoSolicitadoSeaMayorAl70PorcientosDelValorFiscalDeLaPropiedad() {
		solicitud = new SolicitudDeCreditoHipotecario(cliente, 600000, 6, evaluador, propiedad);
		
		assertEquals(evaluador.esAceptado(solicitud), false);
	}
	
	@Test
	void testNoEsAceptadoCuandoElClienteSupereLos65AniosDeEdadCuandoTermineDePagarLasCuotas() {
		cliente = new Cliente("Pepe", "Perez", "420, Paper St. Wilmington, DE 19886", 65, 250000);
		solicitud = new SolicitudDeCreditoHipotecario(cliente, 300000, 6, evaluador, propiedad);
		
		assertEquals(evaluador.esAceptado(solicitud), false);
	}

}



