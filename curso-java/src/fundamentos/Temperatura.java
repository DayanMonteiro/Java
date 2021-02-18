package fundamentos;

public class Temperatura {
	public static void main(String[] args) {
		// (°F - 32) * 5.0/9.0 = °C
		final double FATOR = 5.0/9.0;
		final double AJUSTE = 32;
		
		double fahrenheit = 86;
		double celsius = (fahrenheit - AJUSTE) * FATOR;
			
		System.out.println("O resultado é " +  celsius + "°"); // O resultado é 30.0°
		
		fahrenheit = 150;
		celsius = (fahrenheit - AJUSTE) * FATOR;
		System.out.println("O resultado é " +  celsius + "°"); // O resultado é 65.55555555555556°
		
		fahrenheit = 30;
		celsius = (fahrenheit - AJUSTE) * FATOR;
		System.out.println("O resultado é " +  celsius + "°"); // O resultado é -1.1111111111111112°
	}
}
