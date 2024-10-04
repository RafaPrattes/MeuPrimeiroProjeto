package br.com.rafaela.livroFilme;

public class LivroFilme {
//Atributos da classe
	private String titulo;
	private String genero;
	private String tipo; //livro ou filme
//Constructor
	public LivroFilme(String titulo, String genero, String tipo) {
		super();
		this.titulo = titulo;
		this.genero = genero;
		this.tipo = tipo;
	}
//Getters methods
	public String getTitulo() {
		return titulo;
	}
	public String getGenero() {
		return genero;
	}
	public String getTipo() {
		return tipo;
	}
}
