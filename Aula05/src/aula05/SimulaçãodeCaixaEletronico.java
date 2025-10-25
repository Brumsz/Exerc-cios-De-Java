package aula05;

import java.util.Locale;
import java.util.Scanner;

public class SimulaçãodeCaixaEletronico {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		double saldoNaConta = 1000.00;
		
		System.out.println("------Menu do caixa------"
				+ "\n- 1 ➡️ Sacar dinheiro\r\n"
				+ "- 2 ➡️ Depositar dinheiro\r\n"
				+ "- 3 ➡️ Consultar saldo\r\n"
				+ "- 4 ➡️ Sair");
		int escolha = scanner.nextInt();
		System.out.println("--------------------");
		while(escolha != 4) {
			if(escolha == 1) {
				System.out.println("Qual valor deseja sacar: ");
				double sacar = scanner.nextDouble();
				if(sacar > saldoNaConta) {
					System.out.println("Saldo insulficiente para saque!");
				}else {
					saldoNaConta -= sacar;
				}
				
			}
			else if(escolha == 2) {
				System.out.println("Qual valor deseja depositar: ");
				double depositar = scanner.nextDouble();
				saldoNaConta += depositar;
			}
			else if(escolha == 3) {
				System.out.printf("Seu saldo é de %.2fR$ \n",saldoNaConta);
			}
			else{
				System.out.println("Opção invalida!Digite uma opção valida!");
			}
			System.out.println("--------------------");
			System.out.println("------Menu do caixa------"
				+ "\n- 1 ➡️ Sacar dinheiro\r\n"
				+ "- 2 ➡️ Depositar dinheiro\r\n"
				+ "- 3 ➡️ Consultar saldo\r\n"
				+ "- 4 ➡️ Sair");
			escolha = scanner.nextInt();
			System.out.println("--------------------");
		}
		System.out.println("FIm da operação");
		
		scanner.close();
	}

}
