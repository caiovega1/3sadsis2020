package aula20200615;



public class Curso {
	private String descricao;
	private int codigo;
	private Pessoas Cordenador;
	private Turma turma;

	// construtor
	public Curso(String descricao, int codigo, Pessoas Cordenador,Turma turma) {
		this.codigo = codigo;
		this.Cordenador = Cordenador;
		this.descricao = descricao;
		this.turma= turma;
	}

	// set
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public void setCordenador(Pessoas cordenador) {
		Cordenador = cordenador;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public void setTurma(Turma turma) {
		this.turma = turma;
	}
	

	// get
	public int getCodigo() {
		return codigo;
	}

	public Pessoas getCordenador() {
		return Cordenador;
	}

	public String getDescricao() {
		return descricao;
	}
	public Turma getTurma() {
		return turma;
	}
}
