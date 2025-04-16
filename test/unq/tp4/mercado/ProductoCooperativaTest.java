package unq.tp4.mercado;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ar.edu.unq.poo2.tp4.mercado.ProductoCooperativa;

class ProductoCooperativaTest {

	@Test
	void testConstructor() {
		ProductoCooperativa producto = new ProductoCooperativa(28.5, 7);
		
		assertEquals(producto.getPrecioBase(), 28.5);
		assertEquals(producto.getStock(), 7);
		assertEquals(producto.getPrecio(), 25.65);
	}

}
