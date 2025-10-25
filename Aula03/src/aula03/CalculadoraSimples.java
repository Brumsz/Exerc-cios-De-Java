package aula03;

import java.util.Locale;
import java.util.Scanner;

public class CalculadoraSimples {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("---Calculadora Simples---");
		
		System.out.print("Digite o primeiro numero: ");
		double num1 = scanner.nextDouble();
		
		System.out.print("Digite o segundo numero: ");
		double num2 = scanner.nextDouble();
		
		System.out.println("Escolha uma das operações:\n"
				+ "(1)Soma\n"
				+ "(2)Subtração\n"
				+ "(3)Multiplicação\n"
				+ "(4)Divisão\n"
				+ "(999)Encerrar: ");
		
		int operacao  = scanner.nextInt();
		double resultado;
		
		while(operacao != 999) {
			switch (operacao) {
			case 1: {
				resultado = num1 + num2;
				System.out.printf("Soma: %.1f + %.1f = %.1f\n",num1,num2,resultado);
				break;
			}
			case 2: {
				resultado = num1 - num2;
				System.out.printf("Subtração: %.1f - %.1f = %.1f\n",num1,num2,resultado);
				break;
			}
			case 3: {
				resultado = num1 * num2;
				System.out.printf("Multiplicação: %.1f x %.1f = %.1f\n",num1,num2,resultado);
				break;
			}
			case 4: {
				if(num1==0 || num2 == 0) {
					System.out.println("Erro: Divisão por zero não é permitida!");
				}else {
					resultado = num1 / num2;
					System.out.printf("Divisão: %.1f / %.1f = %.1f\n",num1,num2,resultado);
				}
				break;
			}
			default:
				System.out.print("Operação invalida!\n");
				break;
			}
			System.out.println("-".repeat(30));
			System.out.print("Digite outra operação ou 999 para encerrar: ");
			operacao = scanner.nextInt();
			System.out.println("-".repeat(30));
		}
		System.out.println("---PROGAMA ENCERRADO---");
		
		scanner.close();
	}

}
