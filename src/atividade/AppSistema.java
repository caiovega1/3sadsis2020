package atividade;

public class AppSistema {
	public static void main(String[] args) {
		Produto sucoLaranja = new Produto("Suco Laranja");
		ItemPedido ItemPedido1 = new ItemPedido(sucoLaranja, 2.0, 10.0);

		Produto paoDeQueijo = new Produto("Pao de Queijo");
		ItemPedido ItemPedido2 = new ItemPedido(paoDeQueijo, 6.0, 5.0);

		Pedido pedido1 = new Pedido(1);

		pedido1.adicionarItem(ItemPedido1);
		pedido1.adicionarItem(ItemPedido2);

		for (int i = 0; i < pedido1.getItensPedido().size(); i++) {
			System.out.println("Produto: "
		            + pedido1.getItensPedido().get(i).getProduto() + "\nQuantidade: "
					+ pedido1.getItensPedido().get(i).getQuantidade() + "\nPreço: "
					+ pedido1.getItensPedido().get(i).getPreco());
		}
	}
}
