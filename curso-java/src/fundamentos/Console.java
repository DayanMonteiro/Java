package fundamentos;

import java.util.Scanner;

public class Console {
	
	public static void main(String[] args) {
		System.out.print("Bom");
		System.out.print(" dia"); // Bom dia retornou bom em uma unica linha pq o print esta sem o ln no final
		
		System.out.println(" Bom"); // Bom dia Bom
		System.out.println("dia!"); /* dia! - na linha de cima mesmo inserindo o println ele ainda retorna na mesma linha
		mas ao criar a segunda println ele ja começa a retornar em outra linha executando apenas o dia! que é o parametro q foi passado */
		
		System.out.printf("Megasena: %d %d %d %d %d %d %d %d \n", 1, 2, 3, 4, 5, 6, 7, 8); // Megasena: 1 2 3 4 5 6 7 8  - o printf são para números formatados
		System.out.printf("Salario: %.2f%n", 3500.9251478);// Salario: 3500,93 %.2f o .2f sçao pra duas casas decimais e perceba que alem de das casas ele arredonda o %n quebra linha assim como o \n
		
		System.out.printf("Nome: %s%n", "Dayan"); // Nome: Dayan   %s imprimi string
		
		// Scanner captura informações
		 
		Scanner entrada = new Scanner(System.in);  //System.in entrada no sistema System.out saída
		System.out.print("Digite o seu nome: ");
		String nome = entrada.nextLine();
		System.out.println("\n\nNome = " + nome); // o programa exibe a pergunta no console e após digitar ele imprime - Nome = Dayan Monteiro
		
		System.out.print("Digite o seu hobby: ");
		String hobby = entrada.nextLine();
		
		System.out.print("Desde quando: ");
		String desde = entrada.nextLine();

		System.out.println("\n\nO seu hobby e " + hobby + " desde " + desde + "."); 
		// O seu hobby e tocar guitarra desde 2002.
		
		System.out.print("Digite sua idade: ");
		int idade = entrada.nextInt();
		System.out.printf("Voce tem %d anos.", idade); // Voce tem 33 anos.
		
		entrada.close(); // fechando as entradas isso é importante para parar de usar recursos da máquina
	}

}
