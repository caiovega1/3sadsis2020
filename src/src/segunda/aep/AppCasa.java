package segunda.aep;

public class AppCasa {
	
	public static void main(String[] endereco, int numero, double preco) {
		Casa Casa1 = new Casa("Rua itatiaia", 241, 1500);

		Casa1.verificarEstado();

		Casa Casa2 = new Casa("Rua Paulo Emanuel Ribas", 351, 1900);
		
		Casa2.alugarCasa();
		Casa2.verificarEstado();


	}
}
