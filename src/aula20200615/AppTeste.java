package aula20200615;


public class AppTeste {
	public static void main(String[] args) {
		Enderecos enderecosTeste = new Enderecos("rua", 150, "casa", "jardim america", "maringa", "parana");
		Pessoas pessoaTesteAluno = new Pessoas("Caio", "Vega", "03/01/2002", enderecosTeste);
		Pessoas pessoaTesteCordenador = new Pessoas("CORDENADOR", "TESTE", "01/01/2000", enderecosTeste);
		Pessoas pessoaTesteFiador = new Pessoas("FIADOR", "TESTE", "01/01/2000", enderecosTeste);
		Pessoas pessoaTesteAlunoLider = new Pessoas("Lider", "TESTE", "01/01/2000", enderecosTeste);
		Pessoas[] fiadores = { pessoaTesteFiador };
		
		Contratos contratoTeste1 = new Contratos("REGULAR", pessoaTesteAluno, fiadores);
		Contratos contratoTeste2 = new Contratos("NAO REGULAR", pessoaTesteAluno, fiadores);
		Contratos contratoTesteLider = new Contratos("REGULAR", pessoaTesteAlunoLider, fiadores);
	
		Turma turmaTeste = new Turma("Descriçao teste", 192451, contratoTesteLider);
		//teste regular sucesso
		turmaTeste.setAlunos(contratoTeste1);
		//teste regular negado
		turmaTeste.setAlunos(contratoTeste2);
		
		Curso cursoTeste =new Curso("Descriçao teste", 1564852, pessoaTesteCordenador, turmaTeste);
	    
		System.out.println(cursoTeste.getDescricao()); 
	}
}
