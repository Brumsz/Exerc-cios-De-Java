package aula06.construtor;

public class Notebook {
	String modelo;
	int memoriaRam;
	int armazenamento;
	String processador;
	String fabricante;
	boolean gpuDedicada;
	
	
	
	
	public Notebook() {
		
	}
	
	public Notebook(String modelo,int memoriaRam,int armazenamento,String processador,String fabricante,boolean gpuDedicada) {
		this.modelo = modelo;
		this.memoriaRam = memoriaRam;
		this.armazenamento = armazenamento;
		this.processador = processador;
		this.fabricante = fabricante;
		this.gpuDedicada = gpuDedicada;
	}




	public void imprimirEspecificações() {
		System.out.println("-----Especificações do Notebook-----");
		System.out.println("Modelo: " + modelo);
		System.out.println("Memoria Ram: " + memoriaRam);
		System.out.println("Armazenamento: " + armazenamento);
		System.out.println("Processador: " + processador);
		System.out.println("Fabricante: " + fabricante);
		System.out.println("Possui Gpu Dedicada: " + gpuDedicada);
	}
}
