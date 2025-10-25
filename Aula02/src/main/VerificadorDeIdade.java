package main;

import java.util.Scanner;


public class VerificadorDeIdade {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Primeira idade: ");
		int idade1 = scanner.nextInt();

		System.out.println("Segunda idade: ");
		int idade2 = scanner.nextInt();
		
		boolean maioresDeIdade = idade1 >= 18 && idade2>= 18;
		boolean peloMenosUmaMaisSecenta =  idade1 > 60 || idade2> 60;
		boolean primeiraPessoaNTemDezesseis = idade1 != 16;
		
		System.out.printf(" Ambas tem mais de 18 anos: %b\n "
				+ "Pelo menos uma tem mais de 60 anos: %b\n "
				+ "A primeira pessoa não tem 16: %b",maioresDeIdade,peloMenosUmaMaisSecenta,primeiraPessoaNTemDezesseis);

		
		scanner.close();
	}

}
