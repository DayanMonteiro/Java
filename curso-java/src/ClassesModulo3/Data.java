package ClassesModulo3;



public class Data {
	
	int dia;
	int mes;
	int ano;
	 
	Data() {
		//dia = 1;
		//mes = 1;
		//ano = 1970;
		this(1, 1, 1970);
	}
	
	Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	String obterDataFormtada() {
		final String formato = "%d/%d/%d/\n";
		return String.format(formato, this.dia, mes, ano);
	}
	
	void imprimirDataFormatada() {
		System.out.println(obterDataFormtada());
	}
}