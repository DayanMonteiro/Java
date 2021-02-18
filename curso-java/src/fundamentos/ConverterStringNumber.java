package fundamentos;

import javax.swing.JOptionPane;

public class ConverterStringNumber {

	public static void main(String[] args) {
		
	/* pensando com cabeça de front end esse comando JOpitionPane 
	* abre no sistema como se fosse aquelas janelinhas do alert do Browser */
		String valor1 = JOptionPane.showInputDialog(
				"Digite o primeiro numero:");
		String valor2 = JOptionPane.showInputDialog(
				"Digite o segundo numero:");
		
		System.out.println(valor1 + valor2); /* como se trata de string ele vai concatenar o resultado
		no caso no valor1 digitei 2.6 e no valor2 5.4, logo meu retorno foi 2.65.4 */
		
		double numero1 = Double.parseDouble(valor1);
		double numero2 = Double.parseDouble(valor2);
		
		// agora tenho outra realidade passeu double consigo realizar operações aritméticas
		double soma = numero1 + numero2;
		// numero1 digitei2.7 e numero2 8.9
		System.out.println("A soma é " + soma); // A soma é 11.600000000000001
		System.out.println("A média é " + soma / 2); // A média é 5.800000000000001
	}
}
