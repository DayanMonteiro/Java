package ControleModulo2;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		
		
		//REVISÃO
		//if(...) sentença; ou {}
		//while(...) sentença; ou {}
		//for(...;...;...) sentença; ou {}
		
		//já o do while ficaria
		// do sentença ou {} while(...);
		
		Scanner entrada = new Scanner(System.in);
		
		String texto = "";
		do {
			System.out.println("Você precisa falar " + 
					"\n as palavras mágicas...");
			System.out.print("Quer sair? ");
			texto =  entrada.nextLine();
		} while(!texto.equalsIgnoreCase("por favor"));
		System.out.println("Obrigado!");
		entrada.close();
	}
}
