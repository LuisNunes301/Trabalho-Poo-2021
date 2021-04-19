package br.com.poo.modelo;

import java.util.List;

public class VenderIngresso {
	private double valorIngresso;

	public VenderIngresso() {
		this.valorIngresso = 0.00;
	}
	public VenderIngresso(double valorIngresso) {
		this.valorIngresso = valorIngresso;
	}
	
	public double venderIngresso(List<Evento> lista,int quantidade) {
		double valorTotal=0;
		if(quantidade > lista.get(0).getLocalinfos().getCapacidade()) {
			System.out.println("Evento esta completamente cheio.");
		}
		else{
			valorTotal = quantidade * this.valorIngresso;
		}
		return valorTotal;
	}
	public double getValorIngresso() {
		return valorIngresso;
	}
	public void setValorIngresso(double valorIngresso) {
		this.valorIngresso = valorIngresso;
	}

}
