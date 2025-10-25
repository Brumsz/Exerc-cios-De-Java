package main;

import java.util.Locale;
import java.util.Scanner;

public class MinhaPrimeiraClasse {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Escreva seu nome: ");
		String nome = sc.nextLine();
		
		System.out.print("Colque idade: ");
		int idade = sc.nextInt();
		
		System.out.print("Digite Altura: ");
		double altura = sc.nextFloat();
		
		System.out.print("Esta matriculado: ");
		boolean matricula = sc.nextBoolean();
		
		sc.nextLine();
		
		System.out.print("Serie: ");
		String serie = sc.nextLine();
		
		
		System.out.println("-------DADOS-------");
		System.out.println("Nome: "+ nome);
		System.out.println("Idade: "+ idade);
		System.out.printf("Altura: %.2f\n",altura);
		System.out.println("Matriculado: "+ matricula);
		System.out.println("Serie: "+ serie);
		
		
		sc.close();
	}

}
