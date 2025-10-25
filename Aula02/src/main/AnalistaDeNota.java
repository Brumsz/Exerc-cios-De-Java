package main;

import java.util.Scanner;

public class AnalistaDeNota {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("----Classificador de notas----");
		
		System.out.print("Digite sua nota: ");
		double nota = scanner.nextDouble();
		
		if(nota < 0 || nota > 100) {
			System.out.println("Nota invalida!");
		}
		else if(nota >= 90) {
			System.out.println("Exelente!Aprovado com louvor");
		}
		else if(nota >= 70) {
			System.out.println("Aprovado!");
		}
		else if(nota >= 50) {
			System.out.println("Recuperação!");
		}
		else{
			System.out.println("Reprovado!");
		}
		
		scanner.close();
	}

}
