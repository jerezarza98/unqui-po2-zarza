package unq.tp5.mercado;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.poo2.tp5.mercado.Agencia;
import ar.edu.unq.poo2.tp5.mercado.AgenciaAFIP;
import ar.edu.unq.poo2.tp5.mercado.Caja;
import ar.edu.unq.poo2.tp5.mercado.Factura;
import ar.edu.unq.poo2.tp5.mercado.FacturaDeImpuestos;
import ar.edu.unq.poo2.tp5.mercado.FacturaDeServicios;
import ar.edu.unq.poo2.tp5.mercado.ProductoCooperativa;
import ar.edu.unq.poo2.tp5.mercado.ProductoEmpresa;

class CajaTest {

	private Caja caja;
	private ProductoCooperativa productoUno;
	private ProductoEmpresa productoDos;
	private Agencia agencia;
	private Factura facturaDeServicios, facturaDeImpuestos;

	@BeforeEach
	public void setUp() {
		agencia = new AgenciaAFIP();
		caja = new Caja(agencia);
		productoUno = new ProductoCooperativa(28.9, 8);
		productoDos = new ProductoEmpresa(25, 3);
		facturaDeServicios = new FacturaDeServicios(30.5, 6);
		facturaDeImpuestos = new FacturaDeImpuestos(500);
		
	}

	@Test
	void testConstructor() {
		assertEquals(caja.getMontoTotalAPagar(), 0);
	}
	
	@Test
	void testRegistrarProductos() {
		caja.registrarProducto(productoUno);
		caja.registrarProducto(productoDos);
		
		assertEquals(caja.getMontoTotalAPagar(), 51.01);
	}
	
	@Test
	void testRegistrarFacturas() {
		caja.registrarFactura(facturaDeImpuestos);
		caja.registrarFactura(facturaDeServicios);
		
		assertEquals(caja.getMontoTotalAPagar(), 683);
	}

}
