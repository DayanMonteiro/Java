package fundamentos;

public class VariaveisConstates {
	public static void main(String[] args) {
		
		double raio = 3.4;
		final double PI = 3.14159; // o final transformou a variavel em uma constante
		
		double area = PI  * raio * raio;
		System.out.println(area); // 36.3167804
		
		raio = 10;
		area = PI * raio * raio;
		System.out.println("Área = " + area + "m2."); // Área = 314.159m2.
	}
}
