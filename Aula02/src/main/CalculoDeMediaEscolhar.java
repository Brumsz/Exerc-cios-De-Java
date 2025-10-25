package main;

import java.util.Locale;
import java.util.Scanner;

public class CalculoDeMediaEscolhar {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("----Calculo de Média escolar----");

		System.out.print("Digite primeira nota: ");
		double n1 = scanner.nextDouble();

		System.out.print("Digite segunda nota: ");
		double n2 = scanner.nextDouble();
		
		System.out.print("Digite terceira nota: ");
		double n3 = scanner.nextDouble();
		
		double media = (n1+n2+n3)/3;
		
		System.out.println("----Resultado----");
		System.out.printf("A média do aluno é: %.2f",media);
		
		scanner.close();
	}

}
