package aula05;

import java.util.Scanner;

public class ValidacaoDeIdade {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int idade;
		boolean validacao = false;
		
		
		do {
			System.out.print("Digite idade: ");
			idade = scanner.nextInt();
			validacao = idade >= 18 && idade <= 65;
			
			if(!validacao)System.out.println("Idade inválida. A idade deve estar entre 18 e 65 anos.");
		} while (!validacao);
		System.out.println("Idade registrada com sucesso!");
		
		
		scanner.close();
	}

}
