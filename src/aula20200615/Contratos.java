package aula20200615;

import java.util.HashSet;

public class Contratos {
	private String estado;
	private Pessoas aluno;
	private HashSet<Pessoas> fiadores = new HashSet<>();

	// construtor
	public Contratos(String estado, Pessoas alunos, Pessoas[] fiadores) {
		this.aluno = alunos;
		this.estado = estado;
		for (Pessoas fiador : fiadores) {
			this.fiadores.add(fiador);
		}
	}

	// set
	public void setEstado(String estado) {
		this.estado = estado;
	}

	public void setAluno(Pessoas aluno) {
		this.aluno = aluno;
	}

	public void setFiadores(HashSet<Pessoas> fiadores) {
		this.fiadores = fiadores;
	}

	// get
	public Pessoas getAluno() {
		return aluno;
	}

	public HashSet<Pessoas> getFiadores() {
		return fiadores;
	}

	public String getEstado() {
		return estado;
	}
}
