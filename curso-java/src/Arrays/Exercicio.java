package Arrays;

import java.util.Arrays;

public class Exercicio {

	public static void main(String[] args) {
		
		//ex 01
		double[] notasAlunoA = new double[4];
		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8;
		notasAlunoA[2] = 6.7;
		notasAlunoA[3] = 9.7;
		
		System.out.println(Arrays.toString(notasAlunoA));
		//[7.9, 8.0, 6.7]
		// para percorrer o array
		double totalAlunoA = 0;
		for(int i = 0; i < notasAlunoA.length; i++) {
			totalAlunoA += notasAlunoA[i];
		}
		System.out.println(totalAlunoA / notasAlunoA.length); //7.533333333333334  média do aluno
	
		//ex 02
		double[] notasAlunoB = {6.9, 8.9, 5.5, 10};
		
		double totalAlunoB = 0;
		for(int i = 0; i < notasAlunoB.length; i++) {
			totalAlunoB += notasAlunoB[i];
		}
		
		System.out.println(totalAlunoB / notasAlunoB.length);
	}
}
