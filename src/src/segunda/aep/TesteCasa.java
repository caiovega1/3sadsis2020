package segunda.aep;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TesteCasa {
	@Test
	void TestarNaoAtivo() {
    Casa Casa1 = new Casa("Rua itatiaia", 241, 1500);

		assertFalse(Casa1.getAlugada());
	}

	@Test
	void TestarSenhaErrada() {
		Casa Casa2 = new Casa("Rua Paulo Emanuel Ribas", 351, 1900);

    Casa2.alugarCasa();
		assert(Casa2.getAlugada());
	}



}
