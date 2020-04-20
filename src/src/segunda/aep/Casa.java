package segunda.aep;

public class Casa {
	private String endereco;
	private boolean alugada;
	private int numero;
	private double preco;

	public Casa(String endereco, int numero, double preco) {
		this.endereco = endereco;
		this.numero = numero;
		this.alugada = false;
		this.preco = preco;
	}

	public boolean getAlugada() {
		return this.alugada;
	}	
    private void informar(){
    	System.out.println("Endereco:"+this.endereco);
    	System.out.println("Numero:"+ this.numero);
    	System.out.println("Aluguel de "+ this.preco);
    }
    
	public void verificarEstado() {
		if (!this.getAlugada()) {
			throw new RuntimeException("Essa casa não esta sendo alugada.");
		}
	}
 
	public boolean pesquisaEstadoCasa() {
		try {
			this.verificarEstado();
			this.informar();
			System.out.println("Essa casa já esta alugada");
		
			return true;
		} catch (Exception erro) {
			this.informar();
			System.out.println(erro.getMessage());
			return false;
		}
	}

	public void alugarCasa() {
		this.alugada = true;
	}

}
