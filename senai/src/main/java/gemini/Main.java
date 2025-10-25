package gemini;

import java.util.Scanner;

import com.google.genai.Client;
import com.google.genai.types.GenerateContentResponse;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("Digite sua altura(m): ");
		double altura = scanner.nextDouble();
		
		System.out.printf("Digite sua peso(kg): ");
		double peso = scanner.nextDouble();
	
		String prompt = String.format("Quero que calcule o meu imc com base na minha altura %.2f e peso %.2f e depois me fale qual é estado que estou, se estou no peso ideal,abaixo ou etc",altura,peso) ;
		
	    Client client = Client
	    		.builder()
	    		.apiKey("")
	    		.build();

	    GenerateContentResponse response =
	        client.models.generateContent(
	            "gemini-2.5-flash",
	            prompt,
	            null);

	    System.out.println(response.text());
	    client.close();
	    scanner.close();
	}

}
