package fundamentos.operadores;

public class DesafiosAritmeticos {

	public static void main(String[] args) {
		
		
		// Pré requisito
		int a = 2 + 3 * 4;
		int b = (int) Math.pow(a,  3); // Math.pow é elevado a potencia
		double c = Math.pow(a, 3); // 
		
		System.out.println(a); // 14
		System.out.println(b); // 2744
		System.out.println(c); //2744.0
		
		// Desafio
		
		double numA = Math.pow(6 * (3 + 2), 2);
		double denA = 3 * 2;
		
		double numB = (1 - 5) * (2 - 7);
		double denB = 2;
		
		double superiorA = numA / denA;
		double superiorB = Math.pow(numB / denB, 2);
		
		double superior = Math.pow(superiorA - superiorB, 3);
		double inferior = Math.pow(10, 3);
		
		double resultado = superior / inferior; 
		
		System.out.println("O resultado e " + resultado); // O resultado e 125.0
		
	}
}
