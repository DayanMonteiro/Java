package ControleModulo2;

public class For01 {

	public static void main(String[] args) {
		/*
		int contador = 0;
		
		while(contador <= 20) {
		System.out.printf("i = %d\n", contador);
		contador++;
		}
		*/
		
		for(int contador = 0; contador <= 10; contador++) {
			System.out.printf("i = %d\n", contador);
		}
		
		// n�o � a melhor op��o
		int x = 1;
		for(; x < 10;) {
			System.out.println("x= " +x);
			x++;
		}
		
		/* la�o infinito
		 * for(;;) {
		 * System.out.println("Infinito!!!");
		 * }
		 */
	}
}

