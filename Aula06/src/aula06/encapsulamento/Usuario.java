package aula06.encapsulamento;

public class Usuario {
	
	private String nome,email,senha;
	private boolean permissaoAcesso;
	private double saldo;
	
	public Usuario(String nome, String email, String senha, boolean permissaoAcesso) {
		this.setNome(nome);
		this.email = email;
		this.senha = senha;
		this.permissaoAcesso = permissaoAcesso;
		this.saldo =0;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome.toLowerCase();
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public boolean isPermissaoAcesso() {
		return permissaoAcesso;
	}

	public void setPermissaoAcesso(boolean permissaoAcesso) {
		this.permissaoAcesso = permissaoAcesso;
	}
	
	public double getSaldo() {
		return saldo;
	}

	public void exibirDados() {
		System.out.println("Nome: " + nome);
		System.out.println("Email: " + email);
		System.out.println("Senha: " + senha);
		System.out.println("Permisão de acesso: " + permissaoAcesso);
		System.out.println("Saldo: " + saldo);
		
	}
	
	public void depositar(double deposito) {
		this.saldo += deposito;
		System.out.println("Valor depositado com sucesso!");
	}
	public void sacar(double saque) {
		if(this.saldo < saque)System.out.println("Saldo indisponivel para saque!");
		else {
			System.out.println("Saque feito com sucesso!");
			this.saldo -= saque;
		}
	}
	
	

	
	
}
