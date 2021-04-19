package br.com.poo.modelo;

import java.util.ArrayList;
import java.util.List;

public class Shows {
	private List<Evento> lista = new ArrayList<Evento>();
	private VenderIngresso valorIngresso;
	
	public Shows() {
		this.lista = new ArrayList<Evento>();
		this.valorIngresso = new VenderIngresso();
	}


	public void listarEventos(List<Evento> lista) {
		for (Evento evento : lista) {
			System.out.println(evento);
		}
	}

	public void vendaIngresso(List<Evento> lista,int quantidade) {
		for (Evento evento : lista) {
			double valorTotal = this.valorIngresso.venderIngresso(lista, quantidade);
			System.out.println("Valor Total do ingresso: " + valorTotal);
		}
	}
	public void definirValorIngresso(double valorIngresso) {
		this.valorIngresso.setValorIngresso(valorIngresso);
	}
	
	
		
}
