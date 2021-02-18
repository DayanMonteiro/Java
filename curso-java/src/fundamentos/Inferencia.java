package fundamentos;

public class Inferencia {
	public static void main(String[] args) {
		
		double a = 4.5;
		System.out.println(a); // 4.5
		
		var b = 4.5; // o var já vai inferir o tipo de dado da variável
		System.out.println(b); // 4.5
		
		var c = "Dayan";
		System.out.println(c); // Dayan
		c = "Monteiro";
		System.out.println(c); // Monteiro
		
		double d; // variável doi declarada
		d = 123.65; // variável doi inicializada
		System.out.println(d); // 123.65
		
		var e = 123.65;
		System.out.println(e); // 123.65
		
		
	}
}
