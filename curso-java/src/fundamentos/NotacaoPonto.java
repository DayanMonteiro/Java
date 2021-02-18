package fundamentos;


public class NotacaoPonto {

	public static void main(String[] args) {
		
		double a = 2.3;
		String s = "Bom dia X"; // String tem q ser escrito som S maiusculo
		
		System.out.println(s); // Bom dia X
		
		s = s.replace("X", "Senhor"); 
		s = s.toUpperCase();
		System.out.println(s); // BOM DIA SENHOR
		
		s = s.concat("!!!");
		System.out.println(s); // BOM DIA SENHOR!!!
		
		System.out.println("Dayan".toUpperCase()); // DAYAN
		
		String x = "Monteiro".toUpperCase();
		System.out.println(x); // MONTEIRO
		
		String y = "Bom dia X".replace("X", "Laryssa");
		System.out.println(y); // Bom dia Laryssa
		
		String z = "Bom dia X".replace("X", "Pietra").toUpperCase().concat("!!!");
		System.out.println(z); // BOM DIA PIETRA!!!
		
		// Tipos primitivos não tem o operador .(ponto)
		
		
	}
}
