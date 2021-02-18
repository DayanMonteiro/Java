package fundamentos.operadores;

import java.util.Scanner;

public class TipoStringEquals {
	
	public static void main(String[] args) {
		
		System.out.println("2" == "2");
		
		String s = new String("2"); // true
		System.out.println("2" == s); // false da falso pq a forma de comparar strings é usal o equals
		System.out.println("2".equals(s)); // true aqui aplicandoo o equals ele ja retorna verdadeiro
		
		
		Scanner entrada = new Scanner(System.in);
		String s2 = entrada.next();
		System.out.println("2" == s2.trim());
		System.out.println("2".equals(s2.trim()));
		
		entrada.close();
		
		
	}
}
