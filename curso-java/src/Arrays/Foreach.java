package Arrays;

public class Foreach {

	public static void main(String[] args) {
		
		double[] notas = {9.7, 7.3, 9.5, 8.3};
		
		for(int i =0; i < notas.length; i++) {
			System.out.print(notas[i] + " ");
		}
		
		System.out.println();
		
		for(double nota: notas) {
			System.out.print(nota + " ");			
		}
	}
}
