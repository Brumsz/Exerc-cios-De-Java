package aula05;

import java.util.Scanner;

public class ControledeEstoqueBasico {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int estoqueAtual = 50;
		int estoqueMinimo = 15;
		
		System.out.print("Quantas vendas foram feitas: ");
		int vendas =scanner.nextInt();
		
		System.out.println("--- Início do Controle de Estoque ---");
		for(int i =0; i < vendas;i++) {
			System.out.printf("Venda %d. ",i+1);
			estoqueAtual -= 3;
			
			if(estoqueAtual <= estoqueMinimo && estoqueAtual > 0) System.out.println("🚨 ALERTA! Estoque baixo: " + estoqueAtual);
			
			else if(estoqueAtual <= 0) {
				System.out.println("Ultima venda Feita! \nEstoque esgotado!");
				break;
			}
		
			else System.out.println("Novo estoque: " + estoqueAtual);	
		}
		
		System.out.println("--- Fim do Controle de Estoque ---");
		
		
		scanner.close();
	}

}
