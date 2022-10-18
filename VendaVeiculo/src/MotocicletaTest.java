import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MotocicletaTest {

	@Test
	void testPrecoMotocicleta() {
		double preco = 40000;
		Motocicleta c = new Motocicleta("BMW", "BigTrail", preco, 1);
		double precoVenda = preco * 1.30 + 500;
		assertEquals(precoVenda, c.precoVenda());
	}

}
