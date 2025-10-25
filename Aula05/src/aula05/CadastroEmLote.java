package aula05;

import java.util.Scanner;

public class CadastroEmLote {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String[] nomes = new String[5];
		int cadastroAtuais = 0;
		
		while(cadastroAtuais < nomes.length) {
			System.out.print("Digite o nome a ser cadastrado: ");
			String user = scanner.nextLine();
			nomes[cadastroAtuais] = user;
			
			System.out.println("Deseja Continuar?(S/N)");
			String resposta = scanner.nextLine();
			
			while(!resposta.equalsIgnoreCase("S") && !resposta.equalsIgnoreCase("N") ) {
				System.out.println("Você digitou uma resposta invalida!Digite uma resposta valida!(S/N)");
				resposta = scanner.nextLine();
			}
			
			if(resposta.equalsIgnoreCase("n")){
				break;
			}
			cadastroAtuais ++;
			System.out.println("-----------------------------");
			
		}
		System.out.print("Nomes cadastrados: ");
		for(String nome : nomes) {
			if(nome != null) {
				System.out.printf("%s ",nome);
				
			}
		}

	}

}
