package aula05;

import java.util.Random;
import java.util.Scanner;

public class JogoDaAdvinhacao {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		
		
		int numeroSecreto = random.nextInt(1001);
		System.out.println("🎮 Jogo de Adivinhação 🎮\nTente adivinhar o número entre 0 e 1000!");
		
		System.out.print("\nDigite um numero:");
		int numeroEscolhido = scanner.nextInt();
		
		int tentativas = 1;
		
		while(numeroEscolhido != numeroSecreto) {
			if(numeroEscolhido < numeroSecreto) {
				System.out.println("Tente um numero maior!");
			}else {
				System.out.println("Tente um numero menor!");
			}
			tentativas ++;
			
			System.out.print("\nDigite um numero:");
			numeroEscolhido = scanner.nextInt();
		}
		
		System.out.println("\n🎉 Parabéns! Você acertou o número!");
		System.out.printf("Tentativas: %d \n",tentativas);
		
		int pontuacao = 1000 - (tentativas * 10);
		System.out.printf("Pontuação final: %d pontos",pontuacao);
		scanner.close();
	}

}
