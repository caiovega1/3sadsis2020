package aula20200615;

import java.util.HashSet;

public class Turma {
	private String descricao;
	private int codigo;
	private Contratos lider;
	private HashSet<Contratos> alunos = new HashSet<>();
	
	//construtor
	public Turma(String descricao, int codigo, Contratos lider) {
		this.descricao = descricao;
		this.codigo = codigo;
		if (lider.getEstado() == "REGULAR") {
		this.lider = lider;
		}
	}

	// set
	public void setAlunos(Contratos alunos) {
		if (alunos.getEstado() == "REGULAR") {
			this.alunos.add(alunos);
		}
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public void setLider(Contratos lider) {
		this.lider = lider;
	}

	// get
	public HashSet<Contratos> getAlunos() {
		return alunos;
	}

	public int getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public Contratos getLider() {
		return lider;
	}

}
