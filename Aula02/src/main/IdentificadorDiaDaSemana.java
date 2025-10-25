package main;

import java.util.Scanner;

public class IdentificadorDiaDaSemana {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o numero do dia da semana: ");
		int dia = scanner.nextInt();
		
		switch (dia) {
		case 1: {
			System.out.println("Segunda-Feira");
			break;
		}
		case 2: {
			System.out.println("Terça-Feira");
			break;
		}
		case 3: {
			System.out.println("Quarta-Feira");
			break;
		}
		case 4: {
			System.out.println("Quinta-Feira");
			break;
		}
		case 5: {
			System.out.println("Sexta-Feira");
			break;
		}
		case 6: {
			System.out.println("Sabado-Feira");
			break;
		}
		case 7: {
			System.out.println("Domingo-Feira");
			break;
		}
		default:
			System.out.println("Dia invalido!");
		}

		
		scanner.close();
	}

}
