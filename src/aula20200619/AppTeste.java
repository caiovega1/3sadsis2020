package aula20200619;

import java.util.Date;

public class AppTeste {
	// A superclasse competiçoes e as subclasses torneio e corrida
	public static void main(String[] args) {
		Corrida quinhentosMetros = new Corrida("Corrida 500 metros", new Date(2022, 5, 13),
				"Corrida 500 mentros regional");
		Torneio boxeAmador = new Torneio("Torneio de boxe amador", new Date(2020, 7, 21),
				"Torneio amador para aspirantes premio de 1000 reais custo de inscrição 100 reais");
		System.out.println(quinhentosMetros.getNome());
		System.out.println(boxeAmador.getNome());
	}

}
