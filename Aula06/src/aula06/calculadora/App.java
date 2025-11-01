package aula06.calculadora;

public class App {

	public static void main(String[] args) {
		
		double totalSomar = Calculadora.somar(4, 120);
		double totalSubtrair = Calculadora.subtrair(4, totalSomar);
		double totalDividir = Calculadora.dividir(totalSubtrair, 120);
		double totalMultiplicar = Calculadora.multiplicar(4, totalDividir);
		double total = Calculadora.somar(totalDividir, totalSomar);
		total = Math.pow(total, 4);
		
		System.out.println("Total = " + total);
	
	}

}
