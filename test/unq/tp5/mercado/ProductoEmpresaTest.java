package unq.tp5.mercado;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ar.edu.unq.poo2.tp5.mercado.ProductoEmpresa;

class ProductoEmpresaTest {

	@Test
	void testConstructor() {

		ProductoEmpresa producto = new ProductoEmpresa(57.7, 7);
		
		assertEquals(producto.getPrecioBase(), 57.7);
		assertEquals(producto.getPrecio(), 57.7);
		assertEquals(producto.getStock(), 7);
	}

}
