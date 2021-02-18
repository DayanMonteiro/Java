package fundamentos.operadores;

public class DesafiosLogicos {

	public static void main(String[] args) {
		
		// trabalho na terça (V ou F)
		
		// trabalho na quinta (V ou F)
		
		boolean trabalho1 = false;
		boolean trabalho2 = false;
		
		boolean comprouTV50 = trabalho1 && trabalho2;
		boolean comprouTV32 = trabalho1 ^ trabalho2;
		boolean comprouSorvete = trabalho1 || trabalho2;
		
		// operador unario
		boolean maisSaudavel = !comprouSorvete;
		
		System.out.println("Comprou TV 50\"? " + comprouTV50); // Comprou TV 50"? false
		System.out.println("Comprou TV 32\"? " + comprouTV32); // Comprou TV 32"? false
		System.out.println("Comprou TV 32\"? " + comprouSorvete); // Comprou TV 32"? false
		System.out.println("Mais saudável? " + maisSaudavel); // Mais saudável? true
		
	}
}
