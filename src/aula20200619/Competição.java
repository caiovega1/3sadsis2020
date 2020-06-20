package aula20200619;

import java.util.Date;

public abstract class Competição {
	private String nome;
	private Date dataQueOcorrera;
	private String descricao;

	public Competição(String nome, Date data, String descricao) {
		this.dataQueOcorrera = data;
		this.descricao = descricao;
		this.nome = nome;
	}

	public Date getDataQueOcorrera() {
		return dataQueOcorrera;
	}

	public String getDescricao() {
		return descricao;
	}

	public String getNome() {
		return nome;
	}

}
