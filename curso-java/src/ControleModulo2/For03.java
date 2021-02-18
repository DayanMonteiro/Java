package ControleModulo2;

public class For03 {

	public static void main(String[] args) {
		
		
		for(int i = 0; i < 10; i++) {
			System.out.println(i);
		}	
		int i = 0;
		System.out.println("Saiu do for...");
		System.out.println(i);
	
	// ex: com um for dentro de outro
	for(int x = 0; x <10; x++) {
		for(int y = 0; y < 10; y++) {
			System.out.printf("[%d %d]", x, y);
			}
		}
	}
}
