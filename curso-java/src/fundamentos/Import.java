package fundamentos;

import java.util.Date; // 2 importação do Date 

import javax.swing.JButton;

// OBS: os imports ficam fora das classes
public class Import {

	public static void main(String[] args) {
		String s = "Bom dia!";
		System.out.println(s); // Bom dia!
		
		// 1 a opção Date precisar ser importada para o packege
		Date d = new Date();
		System.out.println(d); // Sat Jan 23 21:15:17 GMT-03:00 2021

		JButton botao = new JButton();
	
	}
}
