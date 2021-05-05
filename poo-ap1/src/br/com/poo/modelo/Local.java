package br.com.poo.modelo;

public class Local {
	private String endereço;
	private int capacidade;

	public Local(String endereço, int capacidade) {
		this.capacidade = capacidade;
		this.endereço = endereço;
	}

	/**
	 * getter/setters
	 * 
	 * @return
	 */

	public String getEndereço() {
		return endereço;
	}

	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}

	public double getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

}
