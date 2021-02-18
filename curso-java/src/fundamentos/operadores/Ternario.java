package fundamentos.operadores;

public class Ternario {

		public static void main(String[] args) {
			
			// aqui eu altero a media pra gerar aprovado e reprovado
			double media = 7.6;
			
		//	String resultadoParcial = media >= 5.0 ? "em recupera��o" : "resultadoParcial";
			/* atribui��o condicional com se a express�o 
			 * � verdadeira ou falsa no caso (media >=7.0)
			 * depois passa para o operador ternario que tem 2 simbolos 
			 * a (?) que separa a express�o dos valores que ser�o atribuidos
			 * e o (:) que separa se a op��o � verdadeira ou falsa
			 * String resultadoFinal = media >= 7.0 ? "aprovado" : "em recupera��o";
			 */
			String resultadoFinal = media >= 7.0 ? 
					"aprovado." : 
					"em recupera��o.";
			System.out.println("O aluno est� " + resultadoFinal);
			
			double nota = 9.9;
			boolean bomComportamento = false;
			boolean passouPorMedia = nota >= 7;
			boolean temDesconto = bomComportamento && passouPorMedia;
			String resultado = temDesconto ? "Sim." : "N�o.";
			System.out.printf("Tem desconto? %s", resultado); // Tem desconto? true
		
			
		}
}
