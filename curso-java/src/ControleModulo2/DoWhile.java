package ControleModulo2;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		
		
		//REVIS�O
		//if(...) senten�a; ou {}
		//while(...) senten�a; ou {}
		//for(...;...;...) senten�a; ou {}
		
		//j� o do while ficaria
		// do senten�a ou {} while(...);
		
		Scanner entrada = new Scanner(System.in);
		
		String texto = "";
		do {
			System.out.println("Voc� precisa falar " + 
					"\n as palavras m�gicas...");
			System.out.print("Quer sair? ");
			texto =  entrada.nextLine();
		} while(!texto.equalsIgnoreCase("por favor"));
		System.out.println("Obrigado!");
		entrada.close();
	}
}
