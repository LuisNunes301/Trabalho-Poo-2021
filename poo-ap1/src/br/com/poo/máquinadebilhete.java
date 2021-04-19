package br.com.poo;

import br.com.poo.modelo.Shows;
import br.com.poo.modelo.Local;

import java.util.ArrayList;
import java.util.List;

import br.com.poo.modelo.Data;
import br.com.poo.modelo.Evento;

public class máquinadebilhete {

	public static void main(String[] args) {
		List <Evento> lista = new ArrayList<Evento>();
		Shows show = new Shows();

		show.definirValorIngresso(150.00);
		lista.add(new Evento("Os Barões da Pisadinha", "Vocalista Rodrigo e o tecladista Felipe",
				new Local("Av. Emb. Abelardo Bueno, 3.401 - Barra da Tijuca - Rio de Janeiro - RJ\r" ,
						60),
				new Data(12, 04, 2021), 22)); 
		lista.add(new Evento("Ferrugem", "Ferrugem",
				new Local("Av. Olavo Fontoura, 1.209 - Santana - São Paulo - SP" ,
						1),
				new Data(22,9,2021), 00)); 
	
		show.listarEventos(lista);

		show.vendaIngresso(lista, 12);
		// construir um codigo que visse vender o ingresso por vetor, um por um usando a lista, por enquanto ainda não sei.

	}

}
