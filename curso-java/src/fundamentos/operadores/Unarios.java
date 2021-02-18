package fundamentos.operadores;

public class Unarios {

	public static void main(String[] args) {
		
		int a = 1;
		int b = 2;
		
		// pos fixado
		a++; // a = a + 1;
		a--; // a = a - 1;
		
		// pre fixado
		++b;
		--b;
		
		System.out.println(a);// 1
		System.out.println(b); // 2
		
		System.out.println("mini desafio..."); // mini desafio...
		System.out.println(++a == b--); /* true -  ele vai incrementar o A que vale 1 agora vira 2, 
		da� ele vai comparar se A � igual a B de comparar que no caso B � 2 da� ele vai retornar true, mas 
		ap�s comparar ele vai decrementar o B o transformando em 1
		*/
		System.out.println(a == b); /* false - veja agora o j� fez as altera��es nos valores 
		o A esta valendo 2 e o B valendo 1 por essa raz�o ele retorna false
		*/ 
		System.out.println(a); // 2
		System.out.println(b); // 1
	}
}
