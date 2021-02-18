package fundamentos;

public class TipoString {

	public static void main(String[] args) {
		
		System.out.println("Olá pessoal".charAt(0)); // O - vejamos retornou O primeira letra do Ola, é como se fosse o array do javascript buscando o primeiro caractere lembrando que o array começa a conagem do zero
		System.out.println("Olá pessoal".charAt(4));// p - retornou p porque? Vejamos: [0 = O, 1 = l, 2 = á, 3 = ao espaço vazio, 4 = p] 


		String s = "Boa tarde";
		
		System.out.println(s.concat("!!!")); // Boa tarde!!!
		System.out.println(s + "!!!"); // Boa tarde!!!
		s = s.toUpperCase();
		System.out.println(s); // BOA TARDE
		System.out.println(s.startsWith("Boa")); // false lembrando q eu converti para maíusiculo
		System.out.println(s.startsWith("BOA")); // true 
		System.out.println(s.toLowerCase().startsWith("boa"));// true  - porque eu pedi para converter tudo para minusculo
		System.out.println(s.length()); // 9 reorna 9 caracteres lembrando que o espaço vazio conta 1 caractere
		System.out.println(s.endsWith("dia!")); // false
		
		String x = "Boa noite";
		System.out.println(x.endsWith("noite")); // true
		System.out.println(x.equals("boa noite")); // false porque o equals verifica se esta igual
		System.out.println(x.equalsIgnoreCase("boa noite")); // true - dessa vez ele deu verdadeiro pq pedi para ignorar e ele ignorou as letras que eram maísculas
		
		
		var nome = "Dayan";
		var sobrenome = "Monteiro";
		var idade = 33;
		
		System.out.println("Nome: " + nome + "\nSobrenome: " + sobrenome); /* \n deu a quebra de linha 
		Nome: Dayan 
		Sobrenome: Monteiro
		*/
		// para escrever concatenações com menos código System.out.printf
		System.out.printf("Nome: %s %s tem %d anos.", nome, sobrenome, idade); // Nome: Dayan Monteiro tem 33 anos.
		
		// construindo a frase dentro de uma variável String
		String frase = String.format("\nO %s %s tem %d anos de idade.", nome, sobrenome, idade);
		System.out.println(frase); // O Dayan Monteiro tem 33 anos de idade.
		
		// também poderia ser
		String maisUmaFrase = "Nome: " + nome + "\nSobrenome: " + sobrenome + "\nIdade: " + idade;
		System.out.println(maisUmaFrase); /*
		Nome: Dayan
		Sobrenome: Monteiro
		Idade: 33
		 */
		// existem diversas outras opções para se trabalhar com strings
		System.out.println("Frase qualquer".contains("qual")); // true
		System.out.println("Frase qualquer".contains("bom")); // false
		System.out.println("Frase qualquer".indexOf("qual")); // 6 esta iniciando a partir da posição 6
		System.out.println("Frase qualquer".substring(6)); // qualquer - escreveu a partir do caractere 6
		System.out.println("Frase qualquer".substring(6, 8)); //qu - ele começou a escrever a partir do 6 e ele vai ate o 8 mas não o considera ou seja seria o ultimo menos 1, dessa forma ele retonar qu caracteres 6 e 7
		
		/* outros exemplos
		 * https://docs.oracle.com/javase/7/docs/api/java/lang/String.html
		 */
	}	
}
