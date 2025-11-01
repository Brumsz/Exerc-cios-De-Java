package aula06.calculadora;

public class App {

	public static void main(String[] args) {
		Calculadora calculadora1 = new Calculadora();
		
		double totalSomar = calculadora1.somar(4, 120);
		double totalSubtrair = calculadora1.subtrair(4, totalSomar);
		double totalDividir = calculadora1.dividir(totalSubtrair, 120);
		double totalMultiplicar = calculadora1.multiplicar(4, totalDividir);
		double total = calculadora1.somar(totalDividir, totalSomar);
		
		System.out.println("Total = " + total);
	
	}

}
