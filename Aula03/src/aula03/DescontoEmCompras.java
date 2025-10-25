//Programa para ler o valor de uma compra e aplicar um desconto 
package aula03;

import java.util.Locale;
import java.util.Scanner;

public class DescontoEmCompras {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		System.out.println("----DESCONTO DE COMPRAS----");
		System.out.print("Digite o valor total da compra: ");
		
		double valorDaCompra = scanner.nextDouble();
		double valorComDesconto;
		
		if(valorDaCompra > 100) {
			valorComDesconto = valorDaCompra - (valorDaCompra * 0.10);
		}else {
			valorComDesconto = valorDaCompra - (valorDaCompra * 0.05);
			
		}
		
		System.out.printf("O valor final com desconto é de %.2f",valorComDesconto);
		scanner.close();
	}

}
