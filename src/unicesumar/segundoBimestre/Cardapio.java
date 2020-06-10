package unicesumar.segundoBimestre;

import java.util.HashSet;

public class Cardapio {
	private String tipoDoCardapio;
	private HashSet<Promocoes> promocao = new HashSet<>();
	private HashSet<Prato> pratos = new HashSet<>();

	// criar cardapio minimo um prato por cardapio
	public Cardapio(String nome, Prato nomeDoPrato) {
		this.tipoDoCardapio = nome;
		this.pratos.add(nomeDoPrato);
	}

	// adicionar prato
	public void adicionarPratos(Prato nomeDoPrato) {
		this.pratos.add(nomeDoPrato);
	}

	// mostrar pratos
	public HashSet<Prato> getPratos() {

		return pratos;
	}
	public HashSet<Promocoes> getPromocoes() {

		return promocao;
	}

//retornar nome do cardapio
	public String getNome() {
		return tipoDoCardapio;
	}

	// adiciona promocoes
	public void adicionarPromocoes(Promocoes promocao) {
		this.promocao.add(promocao);
	}

	// remove promocoe
	public void removerPromocoes(Promocoes promocao) {

		this.promocao.remove(promocao);

	}

}
