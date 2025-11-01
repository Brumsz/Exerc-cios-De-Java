package aula06.staticc;

public class Pessoa {
	String nome;
	int idade;
	static int contadorPessoas;
	
	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
		contadorPessoas ++;
	}
	
	
	
}
