package main;

import java.util.Locale;
import java.util.Scanner;

public class CaixaRegistradora {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("----CAIXA REGISTRADORA----");
		System.out.print("Digite o preço do primerio produto: ");
		double produto1 = scanner.nextDouble();

		System.out.print("Digite o preço do segundo produto: ");
		double produto2 = scanner.nextDouble();
		
		
		System.out.println("----RESULTADOS---");
		System.out.printf(" Soma: %.2f\n Subtração: %.2f\n "
				+ "Multiplicação: %.2f\n "
				+ "Divisão: %.2f\n "
				+ "Resto da divisão: %.2f", 
				produto1 + produto2, produto1-produto2, produto1*produto2, produto1 / produto2, produto1 % produto2);
		
		
		scanner.close();
	}

}
