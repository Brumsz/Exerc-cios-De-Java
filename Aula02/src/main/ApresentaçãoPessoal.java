package main;



import java.util.Scanner;

public class ApresentaçãoPessoal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
			
		System.out.print("Nome: ");
		String nome = scanner.nextLine();
		
		System.out.print("Idade: ");
		int idade = scanner.nextInt();
		
		scanner.nextLine();
		
		System.out.print("Cidade: ");
		String cidade = scanner.nextLine();
		
		System.out.print("Area de interesse: ");
		String areaDeInteresse = scanner.nextLine();
		
		
		System.out.printf("Meu nome é %s, tenho %d anos moro na cidade de %s, e tenho interesse de ingressar na área de %s . ",nome,idade,cidade,areaDeInteresse);
		
		
		
		scanner.close();
		
	}

}
 