package fundamentos;

public class ConversaoTipoPrimitivoNumerico {

	public static void main(String[] args) {
		
		
		// convers�o impl�cita
		double a = 1;
		System.out.println(a); // 1.0 perceba ao associar 1 ao double ele ja converte para 1.0
		
		// convers�o expl�cita (CAST)
		float b = (float) 1.123456789101112; // eu especifiquei que quero converter ele para float dentro da variavel float
		System.out.println(b); // 1.1234568 perceba que ele perdeu um pouco de informa��o visto que � um float e tem um limite de espa�o
		
		int c = 4;
		byte d = (byte) c; // ele vai verificar se o valor cabe, e converter caso n caiba ir� perder informa��o
		System.out.println(d); // 4 - como o vlaor cabia ele n perdeu nenhuma informa��o
		
		double e = 1.99999;
		int f = (int) e;
		System.out.println(f); // 1 ele trunca os numeros ap�s o ponto
			
	}
}
