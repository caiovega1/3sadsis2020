package unicesumar.segundoBimestre;

import java.util.HashSet;

public class Promocoes {
    private String promo;
    private HashSet<Cardapio> cardapios = new HashSet<>();
    
   //criar promocao 
    public Promocoes(String nomePromo ) {
    	this.promo = nomePromo;
    }
    //retornar promocao
    public String getPromoName() {
    	return this.promo;
    }
    //alterar promocao
    public void setPromoName(String nomePromo) {
    	this.promo = nomePromo;
    }
    
    //adicionar cardapio
    public void adicionarCardapio(Cardapio cardapio) {
		this.cardapios.add(cardapio);
	}
    //remover cardapio
    public void removerCardapio(Cardapio cardapio) {
		this.cardapios.remove(cardapio);
}
    public HashSet<Cardapio> getCardapios() {

		return cardapios;
}
}