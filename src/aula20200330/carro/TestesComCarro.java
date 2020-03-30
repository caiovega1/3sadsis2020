package aula20200330.carro;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestesComCarro {

	@Test
	void testarConsumo() {
		Carro palioABC3333 = new Carro(0.00);
		Carro golAGJ1234 = new Carro(0.00);

		assertTrue(palioABC3333.isDesligado());
		assertTrue(golAGJ1234.isDesligado());

		palioABC3333.abastecer(10.00);
		golAGJ1234.abastecer(25.00);

		palioABC3333.ligar();
		assertEquals(9.75, palioABC3333.getCombustivelNoTanqueEmLitros());

		golAGJ1234.ligar();
		assertEquals(24.75, golAGJ1234.getCombustivelNoTanqueEmLitros());

		palioABC3333.acelerar();
		palioABC3333.acelerar();
		palioABC3333.acelerar();
		assertEquals(9.00, palioABC3333.getCombustivelNoTanqueEmLitros());

		golAGJ1234.acelerar();
		assertEquals(24.50, golAGJ1234.getCombustivelNoTanqueEmLitros());
	}

	@Test
	void testeDesligarAutomaticamenteAoLigar() {
		Carro monza3633 = new Carro(0.24);
		Carro opala53A54 = new Carro(0.24);
		monza3633.ligar();

		opala53A54.ligar();

		assertTrue(monza3633.isDesligado());
		assertTrue(opala53A54.isDesligado());
	}

	@Test
	void testeDesligarAutomaticamenteAoAcelerar() {
		Carro monza3633 = new Carro(0.99);
		Carro opala53A54 = new Carro(0.99);

		monza3633.ligar();

		opala53A54.ligar();

		monza3633.acelerar();
		monza3633.acelerar();
		monza3633.acelerar();

		opala53A54.acelerar();
		opala53A54.acelerar();
		opala53A54.acelerar();

		assertTrue(monza3633.isDesligado());
		assertTrue(opala53A54.isDesligado());

	}

	@Test
	void testeReabastecer() {
		Carro monza3633 = new Carro(0.25);
		Carro opala53A54 = new Carro(0.25);

		monza3633.abastecer(0.75);
		opala53A54.abastecer(0.75);

		assertEquals(1.00, monza3633.getCombustivelNoTanqueEmLitros());

		assertEquals(1.00, opala53A54.getCombustivelNoTanqueEmLitros());

	}

	@Test
	void testeCriacaoComCombustivel() {
		Carro monza3633 = new Carro(1.00);
		Carro opala53A54 = new Carro(1.00);

		assertEquals(1.00, monza3633.getCombustivelNoTanqueEmLitros());

		assertEquals(1.00, opala53A54.getCombustivelNoTanqueEmLitros());

	}

}
