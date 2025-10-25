package aula05.projetoCarro;

public class App {

	public static void main(String[] args) {
		Carro car1 = new Carro();
		
		car1.marca = "Mercedez";
		car1.ano = 2019;
		car1.motor = "1.8";
		car1.arCondicionado = true;
			
		car1.acelerar();
		car1.freiar();

	}

}
