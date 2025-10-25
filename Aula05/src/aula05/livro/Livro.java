package aula05.livro;

public class Livro {
	private String nomeLivro;
	private String autor;
	
//gets e sets
	public void setNomeLivro(String nomeLivro) {
		this.nomeLivro = nomeLivro;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getNomeLivro() {
		return nomeLivro;
	}
	
//construtores	
	public Livro() {
	}
	public Livro(String nomeLivro, String nomeAutor) {
		this.autor = nomeAutor;
		this.nomeLivro = nomeLivro;
	}
	
//metodos	
	public String exibirDetalhes() {
		return "Nome do livro:" + this.nomeLivro + "\nNome do autor: " + this.autor;
	}







}
