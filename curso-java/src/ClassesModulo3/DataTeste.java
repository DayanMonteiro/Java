package ClassesModulo3;

public class DataTeste {
	
	public static void main(String[] args) {
		
	Data d1 = new Data();
	//d1.dia = 4;
	//d1.mes = 02;
	//d1.ano = 2021;
	
	
	
	var d2 = new Data(04, 02, 2021);
	//d2.dia = 04;
	//d2.mes = 02;
	//d2.ano = 2021;
	
	String dataFormatada1 = d1.obterDataFormtada();
	
	System.out.println(dataFormatada1);
	System.out.println(d2.obterDataFormtada());
	
	d1.imprimirDataFormatada();
	d2.imprimirDataFormatada();
	}
}
