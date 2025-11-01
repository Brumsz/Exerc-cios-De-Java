package aula06.validacaoSalarial;

public class App {

	public static void main(String[] args) {
		Funcionario validacaoSalarial1 = new Funcionario();
		
		validacaoSalarial1.exibirSalarioAtual();
		
		validacaoSalarial1.setSalario(8000);
		validacaoSalarial1.exibirSalarioAtual();
		
		validacaoSalarial1.setSalario(-100);
		validacaoSalarial1.exibirSalarioAtual();

	}

}
