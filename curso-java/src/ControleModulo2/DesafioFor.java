package ControleModulo2;

public class DesafioFor {

	 public static void main(String[] args) {
		
		 String valor = "#";
		 for(int i = 1; i <=5; i++) {
			 System.out.println(valor);
			 valor += "#";
			 /* esse c�digo retorna 
			  * #
				##
				###
				####
				#####

			  */
		 }
		 
		 // Desafio: criar esse mesmo resultado 
		 //sem usar valor n�merico para controlar o la�o
		 
		 for(String x = "#"; !x.equals("######"); x += "#") {
			 System.out.println(x);;
			 
			 /* esse c�digo retorna 
			  * #
				##
				###
				####
				#####
			  */	 
		 }	 	 
	}
}
