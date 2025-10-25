package aula05;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String resposta = "";
		
		while(!resposta.equalsIgnoreCase("sair")) {
			System.out.println("Escreva algo. Para sair digite 'sair'.");
			resposta = scanner.nextLine();
			System.out.println("Imprimindo novo texto:");
			System.out.println("Sua resposta foi : " + resposta);
		
			
			
		}
		System.out.println("FIM");
		scanner.close();
	}

}
