package aula03;

import java.util.Locale;
import java.util.Scanner;

public class CalculadoraDeImc {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("Digite sua altura(m): ");
		double altura = scanner.nextDouble();
		
		System.out.printf("Digite sua altura(kg): ");
		double peso = scanner.nextDouble();
		
		double imc = peso/(Math.pow(altura,2));
		String statusImc;
		
		if(imc < 18.5)statusImc = "Abaixo do peso"; 
		
		else if(imc >= 18.5 && imc <= 24.9) statusImc = "Peso normal";
		
		else if(imc >= 25.0 && imc <= 29.9 )statusImc = "Sobrepeso";
		
		else if(imc >= 30.0 && imc <= 34.9 )statusImc = "Obesidade grau 1";
		
		else if(imc >= 35.0 && imc <= 39.9 )statusImc = "Obesidade grau 2";
		
		else statusImc = "Obesidade grau 3";
		
		
		System.out.println("---RESULTADO---");
		
		System.out.printf("Peso: %.1f\n"
				+ "Altura: %.1f\n"
				+ "IMC: %.1f\n"
				+ "%s",peso,altura,imc,statusImc);
		
		
		scanner.close();

	}

}
