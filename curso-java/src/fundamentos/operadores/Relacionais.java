package fundamentos.operadores;

public class Relacionais {

	public static void main(String[] args) {
		
		int a = 97;
		int b = 'a';
		
		System.out.println(a == b); // true
		
		// a em hexadecimal 
		System.out.println('\u0061'); // a
		
		System.out.println(3 > 4); // false
		System.out.println(3 >= 3); // true
		System.out.println(3 < 7); // true
		System.out.println(30 <= 7); // false
		System.out.println(30 != 7); // true
		
		
		// operadores relacionais e operadores logicos para tomada de decisão
		double nota = 7.3;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 7;
		
		boolean temDesconto = bomComportamento && passouPorMedia;
		
		System.out.println("Tem desconto? " + temDesconto); // Tem desconto? true
	}
}
