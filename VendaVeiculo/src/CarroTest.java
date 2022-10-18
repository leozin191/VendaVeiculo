import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CarroTest {

	@Test
	void testPrecoCarro() {
		double preco = 83500;
		Carro c = new Carro("Hyundai", "HB20", preco);
		double precoVenda = preco * 1.30;
		assertEquals(precoVenda, c.precoVenda());

	}

}
