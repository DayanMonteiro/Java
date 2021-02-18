package fundamentos.operadores;

public class Atribuicao {
	
	public static void main(String[] args) {
		
		int a = 3;
		int b = a;
		int c = a + b;
		
		// formas reduzidas de fazer atribuição 
		c += b; // c = c + b;
		c -= a; // c = c - a;
		c *= b; // c = c * b;
		c /= a; // c = c / a;
		
		System.out.println(c); // 6
		
		c %= 2; // c = c %2; se restar 0 é par se restar 1 é impar
		System.out.println(c); // 0
 
	}
}
