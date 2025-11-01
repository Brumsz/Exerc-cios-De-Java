package aula06.aluno;

public class Aluno {
	String nome,matricula,classe,email,cpf,estado,cidade;
	long id;
	int idade;
	
	
	public Aluno(long id,String nome, String matricula, String classe, String email, String cpf, String estado, String cidade,
			int idade) {
		this.id = id;
		this.nome = nome;
		this.matricula = matricula;
		this.classe = classe;
		this.email = email;
		this.cpf = cpf;
		this.estado = estado;
		this.cidade = cidade;
		this.idade = idade;
	}
	public Aluno(String nome, String matricula, String classe, String email, String cpf, String estado, String cidade,
			int idade) {
		this.nome = nome;
		this.matricula = matricula;
		this.classe = classe;
		this.email = email;
		this.cpf = cpf;
		this.estado = estado;
		this.cidade = cidade;
		this.idade = idade;
	}
	
	public void exibirDados() {
		System.out.println("----Dados do Aluno----");
		System.out.println("Nome: " + nome);
		System.out.println("Matricula: " + matricula);
		System.out.println("Classe: " + classe);
		System.out.println("Email: " + email);
		System.out.println("CPF: " + cpf);
		System.out.println("Idade: " + idade);
		System.out.println("Cidade: " + cidade);
		System.out.println("Estado: " + estado);
	}
	
	
}
