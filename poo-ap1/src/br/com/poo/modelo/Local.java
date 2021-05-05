package br.com.poo.modelo;

public class Local {
	private String enderešo;
	private int capacidade;

	public Local(String enderešo, int capacidade) {
		this.capacidade = capacidade;
		this.enderešo = enderešo;
	}

	/**
	 * getter/setters
	 */

	public String getEnderešo() {
		return enderešo;
	}

	public void setEnderešo(String enderešo) {
		this.enderešo = enderešo;
	}

	public double getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

}
