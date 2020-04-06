package aula20200406.tiposDeMetodos;

public class AppTiposDeMetodos {
	
	public static void main(String[] args) {
		//DIA
		//Declaração, Instanciação, Atribuição
		Pessoa maria = new Pessoa();
		//maria.nome = "Maria das Graças";
		maria.setNome("Maria das Gracas");
		maria.setAltura(1.62);
		maria.setIdade(22);
		maria.setPeso(54);
		
		//DIA
		//Declaração, Instanciação, Atribuição
		Pessoa jose = new Pessoa();
		//jose.nome = "José de Alencar";
		jose.setNome("Jose de Alencar");
		jose.setAltura(1.75);
		jose.setPeso(-92);
		jose.setIdade(32);
		
		
		//DIA
		//Declaração, Instanciação, Atribuição
		Pessoa teste = new Pessoa();
		//jose.nome = "teste";
		teste.setNome(" ");
		teste.setAltura(1.60);
		teste.setPeso(80);
		teste.setIdade(30);
		
		//DIA
		//Declaração, Instanciação, Atribuição
		Pessoa teste1 = new Pessoa();
		//jose.nome = "teste1";
		teste1.setNome("a ");
		teste1.setAltura(1.60);
		teste1.setPeso(80);
		teste1.setIdade(30);
		
		//DIA
		//Declaração, Instanciação, Atribuição
		Pessoa teste2 = new Pessoa();
		//jose.nome = "teste2";
		teste2.setNome("Teste2");
		teste2.setAltura(0.24);
		teste2.setPeso(80);
		teste2.setIdade(30);
		
		System.out.println(teste.getNome() + ", IMC=" + teste.getIMC());
		System.out.println(jose.getNome() + ", IMC=" + jose.getIMC());
		System.out.println(maria.getNome() + ", IMC=" + maria.getIMC());
		System.out.println(teste1.getNome() + ", IMC=" + teste1.getIMC());
		System.out.println(teste2.getNome() + ", IMC=" + teste2.getIMC());
	}
	

}
