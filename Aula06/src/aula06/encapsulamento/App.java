package aula06.encapsulamento;

public class App {

	public static void main(String[] args) {
		Usuario usuario1 = new Usuario("João Victor","joaovictorbrumcosta@gmail.com","12345",true);
		
		usuario1.exibirDados();
		
		usuario1.depositar(40000);
		usuario1.exibirDados();
		
		usuario1.sacar(100000);
		
		System.out.printf("Saldo na conta: %.2fR$",usuario1.getSaldo());
	}

}
