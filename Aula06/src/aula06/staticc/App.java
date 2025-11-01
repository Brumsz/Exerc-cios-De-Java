package aula06.staticc;

public class App {

	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa("João",20);
		Pessoa pessoa2 = new Pessoa("Fabiana",21);
		
		System.out.println("O total de pessoas é: " + Pessoa.contadorPessoas);
		

	}

}
