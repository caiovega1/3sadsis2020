package unicesumar.segundoBimestre;

public class Acompanhamento {

	private String nomeAcompanhamento;
	private Prato prato;

// criar Acompanhamento
	public Acompanhamento(Prato prato, String Nome) {
		if (prato == null) {
			throw new RuntimeException("Acompanhamento não disponivel sem prato principal");
		}
		this.nomeAcompanhamento = Nome;
		this.prato = prato;
		this.prato.setAcompanhamento(this);
	}

	// informar prato principal
	public String getPratoPrincipal() {
		return prato.getNomePrato();
	}

	// informar nome do acompanhamento
	public String getNomeAcompanhamento() {
		return nomeAcompanhamento;
	}

	// alterar nome do acompanhamento
	public void setNomeAcompanhamento(String nomeAcompanhamento) {
		this.nomeAcompanhamento = nomeAcompanhamento;
	}


	}
