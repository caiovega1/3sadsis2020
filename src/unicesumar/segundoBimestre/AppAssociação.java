package unicesumar.segundoBimestre;

public class AppAssociação {
	public static void main(String[] args) {
		// criando prato
		Prato pratoDoDia = new Prato("Pao de Queijo");

		// criando acompanhamento
		Acompanhamento acompanhamento1 = new Acompanhamento(pratoDoDia, "ketchup Extra");

		// mostrando nome do prato
		System.out.println(pratoDoDia.getNomePrato());

		// mostrando nome do acompanhamento do prato
		System.out.println(pratoDoDia.getAcompanhamento());

		// trocando nome do prato
		pratoDoDia.setNomePrato("Macarrao");

		// trocando nome do acompanhamento
		acompanhamento1.setNomeAcompanhamento("Queijo Extra");

		// mostrando nome do prato do acompanhamento
		System.out.println(acompanhamento1.getPratoPrincipal());

		// mostrando acompanhamento
		System.out.println(acompanhamento1.getNomeAcompanhamento());

		// criando segundo prato
		Prato pratoDoDia2 = new Prato("Frango xadrex");

		// criando cardapio com um prato
		Cardapio cardapioDiario = new Cardapio("Cardapio do Almoço", pratoDoDia);

		// adicionando prato ao cardapio
		cardapioDiario.adicionarPratos(pratoDoDia2);

		// mostrando nome do cardapio
		System.out.println(cardapioDiario.getNome());

		// mostrando pratos do cardapio
		for (Prato pratos : cardapioDiario.getPratos()) {
			System.out.println(pratos.getNomePrato());
		}

		// criando promoçao sem cardapio
		Promocoes promoDoAlmoco = new Promocoes("Macarrao o kilo 10 reais");

		// mostrando nome da promocao
		System.out.println(promoDoAlmoco.getPromoName());

		// trocando nome da promocao
		promoDoAlmoco.setPromoName("Frango xadrez 6 reais o kilo");

		// criando segunda promocao
		Promocoes promoDoAlmoco1 = new Promocoes("compre 1 leve 2 ");

		// adicionando promocoes ao cardapio
		cardapioDiario.adicionarPromocoes(promoDoAlmoco1);
		cardapioDiario.adicionarPromocoes(promoDoAlmoco);

		// criando nomo cardapio
		Cardapio cardapioDiario2 = new Cardapio("Cardapio da Janta", pratoDoDia);

		// adicionando cardapio a promocao
		promoDoAlmoco.adicionarCardapio(cardapioDiario);

		// adicionando cardapio 2 a promocao
		promoDoAlmoco.adicionarCardapio(cardapioDiario2);

		// mostrando cardapios da promocao
		for (Cardapio cardapio : promoDoAlmoco.getCardapios()) {
			System.out.println(cardapio.getNome());
		}

		// mostrando promocoes do cardapio
		for (Promocoes promocao : cardapioDiario.getPromocoes()) {
			System.out.println(promocao.getPromoName());
		}
		
		// removendo promocao
		cardapioDiario.removerPromocoes(promoDoAlmoco1);
		
		// mostrando promocoes do cardapio
		for (Promocoes promocao : cardapioDiario.getPromocoes()) {
			System.out.println(promocao.getPromoName());
		}
		// removendo cardapio 2 da promocao
		promoDoAlmoco.removerCardapio(cardapioDiario2);

		// mostrando cardapios da promocao
		for (Cardapio cardapio : promoDoAlmoco.getCardapios()) {
			System.out.println(cardapio.getNome());
		}
	}
}
