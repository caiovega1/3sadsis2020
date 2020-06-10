package unicesumar.segundoBimestre;

public class Prato {
	private String prato;

	private Acompanhamento acompanhamento;

//criar prato principal 
	public Prato(String nomePrato) {
		this.prato = nomePrato;
	}

// informar acompanhamento
	public String getAcompanhamento() {
		return acompanhamento.getNomeAcompanhamento();
	}

	// preencher acompanhamento
	public void setAcompanhamento(Acompanhamento acompanhamento) {
		this.acompanhamento = acompanhamento;
	}

	// informar nome do prato
	public String getNomePrato() {
		return this.prato;
	}

	// alterar nome do prato
	public void setNomePrato(String prato) {
		this.prato = prato;
	}

}
