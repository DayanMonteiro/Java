package Arrays;

import java.util.Scanner;

public class Matriz {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Quantos alunos? ");
		int qtdAlunos = entrada.nextInt();
		
		System.out.println("Quantas notas por aluno? ");
		int qtdNotas = entrada.nextInt();
		
		double [] [] notasDaTurma = new double[qtdAlunos][qtdNotas];
 		
		double total = 0;
		for(int alunos = 0; alunos < notasDaTurma.length; alunos++) {
			for(int notas = 0; notas < notasDaTurma[alunos].length; notas++) {
				
				System.out.printf("Informe a nota %d do aluno %d: ", notas, alunos);
				notasDaTurma[alunos][notas] = entrada.nextDouble();
				total += notasDaTurma [alunos][notas];
			}
		}
		double media = total / (qtdAlunos * qtdNotas);
		System.out.println("Média da turma é " + media);
		entrada.close();
	}

}
