package br.com.poo.modelo;

public class Local {
	private String endere�o;
	private int capacidade;

	public Local(String endere�o, int capacidade) {
		this.capacidade = capacidade;
		this.endere�o = endere�o;
	}

	/**
	 * getter/setters
	 * 
	 * @return
	 */

	public String getEndere�o() {
		return endere�o;
	}

	public void setEndere�o(String endere�o) {
		this.endere�o = endere�o;
	}

	public double getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

}
