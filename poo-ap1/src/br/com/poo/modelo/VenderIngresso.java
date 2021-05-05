package br.com.poo.modelo;

public class VenderIngresso {
	/*
	 * Classe primordial para a execução da venda de ingresso.
	 */
	private double valorIngresso;

	public VenderIngresso() {
		this.valorIngresso = 0.00;
	}

	public VenderIngresso(double valorIngresso) {
		this.valorIngresso = valorIngresso;
	}

	/*
	 * Metodo que seta a venda de Ingresso na Classe Shows.
	 */
	public double venderIngresso(Evento evento, int quantidade) {
		double valorTotal = 0;
		if (quantidade > evento.getLocalinfos().getCapacidade()) {
		} else {
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
