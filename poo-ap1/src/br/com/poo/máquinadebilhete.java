package br.com.poo;

import br.com.poo.modelo.Shows;
import br.com.poo.modelo.Local;
import br.com.poo.modelo.Data;
import br.com.poo.modelo.Evento;

public class máquinadebilhete {

	public static void main(String[] args) {
		Shows show = new Shows();
		
		Evento evento1 = new Evento("Os Barões da Pisadinha", "Vocalista Rodrigo e o tecladista Felipe",
				new Local("Av. Emb. Abelardo Bueno, 3.401 - Barra da Tijuca - Rio de Janeiro - RJ\r", 10),
				new Data(12, 04, 2021), 00);
		
		Evento evento2 = new Evento("Menos é Mais, Ferrugem, Tiee", "Ferrugem,Duzao,Tiee",
				new Local("Evento online com pagantes", 10), new Data(30, 06, 2021), 00);
		
		Evento evento3 = new Evento("Live Ferrugem Em Casa", "Ferrugem", new Local("Evento online com pagantes", 1000),
				new Data(15, 07, 2021), 00);
		
		Evento evento4 = new Evento("FERRUGEM e SUEL - Medley Pagode Anos 90 (2020)", "Ferrugem e Suel",
				new Local("Evento online com pagantes", 0), new Data(17, 05, 2021), 00);
		
		Evento evento5 = new Evento("RDN & Amigos - COMPLETO", "RDN e amigos:Ferrugem,Suel,Vou pro sereno",
				new Local("Evento online com pagantes", 700), new Data(12, 8, 2021), 00);

		show.adicionarEvento(evento1);

		show.adicionarEvento(evento2);

		show.adicionarEvento(evento3);

		show.adicionarEvento(evento4);

		show.adicionarEvento(evento5);

		//show.listarEventostotais();

		show.listarEventosdisponiveis();

		show.definirValorIngresso(50.00);

		show.compraIngresso(evento1, 2);

		show.definirValorIngresso(100.99);

		show.compraIngresso(evento2, 5);

		show.definirValorIngresso(55);

		show.compraIngresso(evento3, 3);

		show.definirValorIngresso(70);

		show.compraIngresso(evento4, 1);

		show.definirValorIngresso(75.99);

		show.compraIngresso(evento5, 2);


	}

}
