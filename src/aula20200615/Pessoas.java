package aula20200615;

import java.util.HashSet;

public class Pessoas {
	private String nome;
	private String sobrenome;
	private String dataDeNacismento;
	private Enderecos endPrincipal;
	private HashSet<Enderecos> endereco = new HashSet<>();

	public Pessoas(String nome, String sobrenome, String dataDeNacismento, Enderecos endPrincipal) {
		this.dataDeNacismento = dataDeNacismento;
		this.endPrincipal = endPrincipal;
		this.nome = nome;
		this.sobrenome = sobrenome;
	}

	public void adicionarEnderecos(Enderecos[] enderecos) {
		for (Enderecos endereco : enderecos) {
			this.endereco.add(endereco);
		}
	}

	public String getDataDeNacismento() {
		return dataDeNacismento;
	}

	public HashSet<Enderecos> getEndereco() {
		return endereco;
	}

	public Enderecos getEndPrincipal() {
		return endPrincipal;
	}

	public String getNome() {
		return nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

}
