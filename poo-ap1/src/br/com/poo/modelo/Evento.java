package br.com.poo.modelo;

/**
 * Classe que oferece a maioria dos atributos usado na Classe Shows.
 * 
 */
public class Evento {
	private String nome;
	private String artista;
	private Local localinfos;
	private Data data;
	private float hora;

	/**
	 * Construtor principal para Shows.
	 */
	public Evento(String nome, String artista, Local localinfos, Data data, float hora) {
		this.nome = nome;
		this.artista = artista;
		this.hora = hora;
		this.localinfos = localinfos;
		this.data = data;

	}

	/**
	 * Tostring para exibir o evento.
	 */

	@Override
	public String toString() {
		StringBuilder dados = new StringBuilder();
		dados.append("Evento: ");
		dados.append(nome);
		dados.append(" ");
		dados.append("\nArtista: ");
		dados.append(artista);
		dados.append(" ");
		dados.append("\nLocal: ");
		dados.append(localinfos.getEndereço());
		dados.append("\nCapacidade: ");
		dados.append(localinfos.getCapacidade());
		dados.append("\nData: ");
		dados.append(data);
		dados.append(" ");
		dados.append("\nHorario: ");
		dados.append(hora + "h");
		dados.append("\n-------------------------------------");
		return dados.toString();
	}

	/**
	 * getter/setters

	 */

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public Local getLocalinfos() {
		return localinfos;
	}

	public void setLocalinfos(Local localinfos) {
		this.localinfos = localinfos;
	}

	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public float getHora() {
		return hora;
	}

	public void setHora(float hora) {
		this.hora = hora;
	}

}
