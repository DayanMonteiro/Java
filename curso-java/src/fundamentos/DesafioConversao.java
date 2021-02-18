package fundamentos;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o primeiro salario:");
		/* replace(",", ".") como em Java a separação dos 
		 * numeros deve ser feita com ponto e não com virgula, esse
		 * comando irá converter a virgula em ponto toda vez que o 
		 * usuário digitar a virgula ao inves do ponto*/
		 
		String valor1 = entrada.next().replace(",", ".");

		System.out.println("\nInforme o segundo salario:");
		String valor2 = entrada.next().replace(",", ".");
		
		System.out.println("\nInforme o terceiro salario:");
		String valor3 = entrada.next().replace(",", ".");
		
		// recebendo e convertendo a informação digitada pelo usuário
		
		double salario1 = Double.parseDouble(valor1);
		double salario2 = Double.parseDouble(valor2);
		double salario3 = Double.parseDouble(valor3);
		
		double media = (salario1 + salario2 + salario3) / 3;
		System.out.println("A media  dos salarios e " + media);
		
		/*
		 * Informe o primeiro salario: 8562,14
		   Informe o segundo salario: 7352,87
	       Informe o terceiro salario: 9852.53
		   
		   A media  dos salarios e 8589.18 */
		
		entrada.close();
		
	}
	
}
