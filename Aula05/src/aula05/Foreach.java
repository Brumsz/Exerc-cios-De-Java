package aula05;

public class Foreach {

	public static void main(String[] args) {
		float[] temperaturas = {20f,18.7f,21f,25f,17.8f,15.5f,22f};
		
		for(int i =0; i < temperaturas.length; i++) {
			System.out.println(temperaturas[i]);
		}
		
		System.out.println("-----------------------------------");
		
		//forEach
		for(float temperatura : temperaturas) {
			System.out.println(temperatura);
			
		}
		

	}

}
