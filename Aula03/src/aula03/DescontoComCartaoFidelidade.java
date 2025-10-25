//Progama para ver desconto e se tem cartão fidelidade para aplicar desconto
package aula03;

import java.util.Locale;
import java.util.Scanner;

public class DescontoComCartaoFidelidade {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		System.out.println("----DESCONTO DE COMPRAS----");
		
		System.out.print("Digite o valor total da compra: ");
		double valorDaCompra = scanner.nextDouble();
		
		//verificação de cartão
		System.out.print("Possui cartão fidelidade(Sim/Não): ");
		String cartaoFidelidade = scanner.next();
		String cartaoFidelidadeModificado = cartaoFidelidade.toLowerCase().strip().substring(0,1);
		boolean fazParteDoCartao;
		
		while(!cartaoFidelidadeModificado.equals("n") && !cartaoFidelidadeModificado.equals("s")) {
			System.out.print("Resposta invalida!Digite Sim ou Não!: ");
			cartaoFidelidade = scanner.next();
			cartaoFidelidadeModificado = cartaoFidelidade.toLowerCase().strip().substring(0,1);
		}
		if(cartaoFidelidadeModificado.equals("s")) {
			fazParteDoCartao = true;
		}
		else{
			fazParteDoCartao = false;
		}
		
		double valorDoDesconto;
		double valorFinal;
		int porcentagem;
		
		
		if(valorDaCompra > 100 && fazParteDoCartao == false) {
			valorDoDesconto =(valorDaCompra * 0.10);
			porcentagem = 10;
			valorFinal = valorDaCompra - valorDoDesconto;
		}else if((valorDaCompra <= 100 && fazParteDoCartao == false) ) {
			valorDoDesconto = (valorDaCompra * 0.05);
			porcentagem = 5;
			valorFinal = valorDaCompra - valorDoDesconto;
		}
		else if(valorDaCompra > 100 && fazParteDoCartao == true) {
			valorDoDesconto =(valorDaCompra * 0.15);
			porcentagem = 15;
			valorFinal = valorDaCompra - valorDoDesconto;
		}else{
			valorDoDesconto = (valorDaCompra * 0.10);
			porcentagem = 10;
			valorFinal = valorDaCompra - valorDoDesconto;
		}
		
		System.out.println("----STATUS DA COMPRA----");
		System.out.printf("Valor da compra: %.2fR$ \n"
				+ "Possui cartão fidelidade: %s\n"
				+ "Porcentagem do desconto: %d%% \n" 
				+ "Valor do desconto: %.2fR$ \n"
				+ "Valor final: %.2fR$ ",valorDaCompra,cartaoFidelidade,porcentagem,valorDoDesconto,valorFinal);
		
		
		scanner.close();

	}

}
