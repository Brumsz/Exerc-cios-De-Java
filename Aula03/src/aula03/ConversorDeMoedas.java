package aula03;

import java.util.Locale;
import java.util.Scanner;

public class ConversorDeMoedas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		double usd = 5.20;
		double eur = 6.0;
		double eurToUsd = 1.16;
		double usdToEur = 0.86;
		
		System.out.println("---Conversor de Moedas---");
		System.out.print("Digite o valor: ");
		double valor = scanner.nextDouble();
		
		
		System.out.println("---MENU DE CONVERSÕES---");
		System.out.println("ESCOLHA ENTRE AS CONVERSÕES:\n"
				+ "-(1)Real para Dolar\n"
				+ "-(2)Real para Euro\n"
				+ "-(3)Dolar para Real\n"
				+ "-(4)Dolar para Euro\n"
				+ "-(5)Euro para real\n"
				+ "-(6)Euro para dolar\n"
				+ "Escolha: ");
		int escolhaDeCambio = scanner.nextInt();
		
		double valorConvertido;
		
		System.out.print("Valor convertido de ");
		switch (escolhaDeCambio) {
		case 1: {
			valorConvertido = valor/usd;
			System.out.printf("Real para Dolar:\n"
					+ "%.2f Dolares",valorConvertido);
			break;
		}
		case 2: {
			valorConvertido = valor/eur;
			System.out.printf("Real para Euro:\n"
					+ "%.2f Euros",valorConvertido);
			break;
		}
		case 3: {
			valorConvertido = valor * usd;
			System.out.printf("Dolar para Real:\n"
					+ "%.2f Reais",valorConvertido);
			break;
		}
		case 4: {
			valorConvertido = valor * usdToEur;
			System.out.printf("Dolar para Euro:\n"
					+ "%.2f Euros",valorConvertido);
			break;
		}
		case 5: {
			valorConvertido = valor* eur;
			System.out.printf("Euro para Real:\n"
					+ "%.2f Reais",valorConvertido);
			break;
		}
		case 6: {
			valorConvertido = valor * eurToUsd;
			System.out.printf("Euro para Dolar:\n"
					+ "%.2f Dolares",valorConvertido);
			break;
		}
		default:
			System.out.println("Opção invalida!");
			break;
		}
		
		
		
		
		
		scanner.close();
	}

}
