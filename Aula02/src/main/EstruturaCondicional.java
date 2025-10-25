package main;

import java.util.Scanner;

public class EstruturaCondicional {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		//menos que 20 é frio
		//entre 20 e 24 é ambiente
		//maior que 24 e menor que 30
		//maior que 30 é muito quente
	
		
		System.out.print("Digite a temperatura: ");
		double temperatura = scanner.nextDouble();
		
		if(temperatura < 20) {
			System.out.printf("A temperatura é %.2f. Esta frio!",temperatura);
			
		}
		else if(temperatura >= 20 && temperatura < 24) {
			System.out.printf("A temperatura é %.2f. Esta temperatura ambiente!",temperatura);
			
		}
		else if(temperatura >= 24 && temperatura < 30) {
			System.out.printf("A temperatura é %.2f. Esta quente!",temperatura);
			
		}
		else{
			System.out.printf("A temperatura é %.2f. Esta MUITOO quente!",temperatura);
			
		}
		
		
		scanner.close();
	}

}
