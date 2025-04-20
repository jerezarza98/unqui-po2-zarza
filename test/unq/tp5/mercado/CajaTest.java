package unq.tp5.mercado;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.poo2.tp5.mercado.Caja;
import ar.edu.unq.poo2.tp5.mercado.ProductoCooperativa;
import ar.edu.unq.poo2.tp5.mercado.ProductoEmpresa;

class CajaTest {

	private Caja caja;
	private ProductoCooperativa productoUno;
	private ProductoEmpresa productoDos;

	@BeforeEach
	public void setUp() {
		caja = new Caja();
		productoUno = new ProductoCooperativa(28.9, 8);
		productoDos = new ProductoEmpresa(25, 3);
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

}
