package aula06.validacaoSalarial;

public class Funcionario {
	private double salario;
	
	public Funcionario() {
		this.salario = 0;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		System.out.printf("Tentativa de trocar salario para %.2f .Salario ",salario);
		if(salario > 0) {
			this.salario = salario;
			System.out.println("alterado!");
		}else {
			System.out.println("invalido!");
		}	
	}
	
	public void exibirSalarioAtual() {
		System.out.printf("Salario atual: %.2fR$\n",this.salario);
	}	
	
	
}
