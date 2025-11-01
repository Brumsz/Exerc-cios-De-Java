package aula06.construtor;

public class App {

	public static void main(String[] args) {
		Notebook note1 = new Notebook("G15-5530",16,1024,"i7 13th gen","Dell",true);
//		
//		note1.modelo = "G15-5530";
//		note1.memoriaRam = 16;
//		note1.armazenamento = 1024;
//		note1.processador = "i7 13th gen";
//		note1.fabricante = "Dell";
//		note1.gpuDedicada = true;
		
		
		note1.imprimirEspecificações();

	}

}
