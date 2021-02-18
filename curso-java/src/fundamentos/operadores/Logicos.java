package fundamentos.operadores;

public class Logicos {

	public static void main(String[] args) {
		
		boolean condicao1 = true;
		boolean condicao2 = 3 > 7;
		
		System.out.println(condicao1 && condicao2); // false 
		System.out.println(condicao1 || condicao2); // true
		System.out.println(condicao1 ^ condicao2); // true
		System.out.println(!condicao1); // false 
		System.out.println(!!condicao1); // true
		System.out.println(!condicao2); // true
		
		// tabela verdade
		System.out.println("Tabela verdade E (AND)"); // Tabela verdade E (AND)
		System.out.println(true && true); //true
		System.out.println(true && false); // false
		System.out.println(false && true); // false
		System.out.println(false && false); // false
		
		System.out.println("Tabela verdade OU (OR)"); // Tabela verdade OU (OR)
		System.out.println(true || true); //true
		System.out.println(true || false); //true
		System.out.println(false || true); //true
		System.out.println(false || false); // false
		
		System.out.println("Tabela verdade OU Exclusivo (XOR)"); // Tabela verdade OU Exclusivo (XOR)
		System.out.println(true ^ true); // false
		System.out.println(true ^ false); //true
		System.out.println(false ^ true); //true
		System.out.println(false ^ false); // false
		
		System.out.println("Tabela verdade NOT"); //Tabela verdade NOT
		System.out.println(!true); // false
		System.out.println(!false); //true
	}
}
