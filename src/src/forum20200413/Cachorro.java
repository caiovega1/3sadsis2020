package forum20200413;

public class Cachorro {
	private final static int GRANDE = 8;
	private final static int MEDIO = 7;
	private String nome;
	private String raca;
	private int idade;
	private String pedigre;
	private double peso;
    

	
	public Cachorro(String nome, String raca, int idade,double peso) {
		this.nome = nome;
		this.raca = raca;
		this.idade = idade;
		this.peso = peso;
	}

	public Cachorro(String nome, String raca, int idade, String pedigre,double peso) {
		this.nome = nome;
		this.raca = raca;
		this.idade = idade;
		this.pedigre = pedigre;
		this.peso = peso;
	}

	public void mudarNome(String nome) {
		this.nome = nome;
	}
	public void mudarRaca(String raca) {
		this.raca = raca;
	}
	public double getPeso() {
		return this.peso;
	}
	public String getNome() {
		return this.nome;
	}
	public String getRaca() {
		return this.raca;
	}
	public String getPedigre() {
		return this.pedigre;
	}
	
	private int calcularIdadeCachorro() {
		if (this.idade <= 0) {
			throw new RuntimeException("Idade deve ser informada");
		}
		return this.idade*pegarPesoCachorro();
	}
	private int pegarPesoCachorro() {
		if(peso>22) {
			return GRANDE;
		}
		return MEDIO;
	}

}
