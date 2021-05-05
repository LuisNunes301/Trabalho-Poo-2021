package br.com.poo.modelo;

import java.util.ArrayList;

public class Shows {
	private ArrayList<Evento> evento;
	private VenderIngresso valorIngresso;

	public Shows() {
		this.evento = new ArrayList<Evento>();
		this.valorIngresso = new VenderIngresso();
	}

	/*
	 * Metodo para adicionar os eventos.
	 */
	public void adicionarEvento(Evento evento) {
		this.evento.add(evento);
	}

	/*
	 * Metodo para listar todos os eventos sem condições, apenas para vê se não há
	 * erro na impressão.
	 */
	public void listarEventostotais() {
		System.out.println("   ********* TODOS OS EVENTOS ******** \n\n");
		for (Evento evento2 : evento) {
			System.out.println(evento2);
		}
	}

	/*
	 * Consultar os eventos, apenas aqueles que tem capacidade=ingresso, > 0, caso
	 * == 0 print que não há.
	 */
	public void listarEventosdisponiveis() {
		System.out.println("******   Eventos disponiveis: ****** \n\n");
		for (Evento evento2 : evento) {
			if (evento2.getLocalinfos().getCapacidade() == 0) {
				System.out.println("\nEvento esgotado:" + evento2.getNome() + "\n");
			} else if (evento2.getLocalinfos().getCapacidade() > 0) {
				System.out.println(evento2.getNome() + "\nCapacidade: " + evento2.getLocalinfos().getCapacidade()
						+ "\nLocal: " + evento2.getLocalinfos().getEndereço() + "\n--------------------------");
			}
		}
	}

	/*
	 * Capacidade = ingressos disponiveis, se > 0. Execute o metodo.
	 */
	public void compraIngresso(Evento evento, int quantidade) {
		if (evento.getLocalinfos().getCapacidade() > 0) {
			double valorTotal = this.valorIngresso.venderIngresso(evento, quantidade);
			System.out.println("Evento: " + evento.getNome() + "\nValor total da ingresso(s): " + valorTotal);
		} else if (evento.getLocalinfos().getCapacidade() == 0) {
			System.out.println("Evento Esgotado !! Volte quando tiver mais ingressos desse evento!");
		}

	}

	/*
	 * Metodo que define o valor do ingresso no Main, pode setar para cada evento.
	 */
	public void definirValorIngresso(double valorIngresso) {
		this.valorIngresso.setValorIngresso(valorIngresso);
	}

}
