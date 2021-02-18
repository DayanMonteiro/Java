package fundamentos.operadores;

public class Aritmeticos {
	
	public static void main(String[] args) {
		
		System.out.println(2 + 3); // 5
		
		var x = 34.56;
		double y = 2.2; 
		
		System.out.println(x + y); // 36.760000000000005
		System.out.println(x - y); // 32.36
		System.out.println(x * y); // 76.03200000000001
		System.out.println(x / y); // 15.709090909090909
		
		int a = 8;
		int b = 3;
		
		System.out.println(a + b); // 11
		System.out.println(a - b); // 5
		System.out.println(a * b); // 24
		System.out.println(a / (double) b); // 2
		System.out.println(a / (double) b); // 2.6666666666666665 como converti o b em um double ele gerou numero com casa decimal
		
		System.out.println(a % b); // 2
		System.out.println(8 % 3); // 2
		
		System.out.println(x + y - a * b); // 12.760000000000005
	}

}
