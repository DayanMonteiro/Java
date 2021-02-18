package fundamentos.operadores;

public class Ternario {

		public static void main(String[] args) {
			
			// aqui eu altero a media pra gerar aprovado e reprovado
			double media = 7.6;
			
		//	String resultadoParcial = media >= 5.0 ? "em recuperação" : "resultadoParcial";
			/* atribuição condicional com se a expressão 
			 * é verdadeira ou falsa no caso (media >=7.0)
			 * depois passa para o operador ternario que tem 2 simbolos 
			 * a (?) que separa a expressão dos valores que serão atribuidos
			 * e o (:) que separa se a opção é verdadeira ou falsa
			 * String resultadoFinal = media >= 7.0 ? "aprovado" : "em recuperação";
			 */
			String resultadoFinal = media >= 7.0 ? 
					"aprovado." : 
					"em recuperação.";
			System.out.println("O aluno está " + resultadoFinal);
			
			double nota = 9.9;
			boolean bomComportamento = false;
			boolean passouPorMedia = nota >= 7;
			boolean temDesconto = bomComportamento && passouPorMedia;
			String resultado = temDesconto ? "Sim." : "Não.";
			System.out.printf("Tem desconto? %s", resultado); // Tem desconto? true
		
			
		}
}
