package aula20200526;

import java.util.ArrayList;

public class Pais {
	private String nome;
	private int códigoDDI;
	private ArrayList<Estado> estados = new ArrayList<>();

	public Pais(String nome, int códigoDDI) {
		this.nome = nome;
		this.códigoDDI = códigoDDI;
	}
	public String getNome() {
		return nome;
	}
	public int getCódigoDDI() {
		return códigoDDI;
	}
	public void addEstado(Estado e) {
		for (Estado estadoExistente : estados) {
			if (estadoExistente.getSigla().equals(e.getSigla())) {
				return;
			}
		}
		this.estados.add(e);		
	}
	public ArrayList<Estado> getEstados() {
		return estados;
	}
	public int contaEstados() {
		return this.estados.size();
	}

}