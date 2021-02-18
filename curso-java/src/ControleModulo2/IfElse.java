package ControleModulo2;

import javax.swing.JOptionPane;

public class IfElse {

	public static void main(String[] args) {
		
		
		String valor = JOptionPane.showInputDialog(
				"Informe o número:");
		int numero = Integer.parseInt(valor);
		
		// verificando se o numero é par ou impar
		/*if(numero % 2 == 0) {
		System.out.println("Número par!");
		}
		
		if(numero % 2 == 1) {
			System.out.println("Número impar!");
			}*/
		
		// com menos código
		if(numero % 2 == 0) {
			System.out.println("Número par!");
			} else {
				System.out.println("Número impar!");
			}	
	}
}
