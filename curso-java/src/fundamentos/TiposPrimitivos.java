package fundamentos;

public class TiposPrimitivos {
	
	public static void main(String[] args) {
		
		// Informações do funcionário
		
		
		// Tipos numéricos
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 526;
		int id = 56978;
		long pontosAcumulados = 3_134_856_2223L; // o L no final é enfatizar que ele é um literal longo
		
		// Tipos numéricos reais
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_103.01;
		
		// Tipos booleanos
		boolean estaDeFerias = false; // ou false
		
		// Tipo de caractere
		char status = 'A'; // o char necessariamente precisa que as informações esyejan inseridas em aspas simples ''
		
		// Dias de empresa	
		System.out.println(" O funcionario tem " + anosDeEmpresa * 365 + " dias trabalhados na empresa."); //  O funcionario tem 8395 dias trabalhados na empresa
		
		// Número de viagens
		System.out.println(numeroDeVoos / 2); // 263
		
		// Pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas); // 10480.602680079548
		
		System.out.println(id + ": ganha -> " + salario); // 56978: ganha -> 11445.44
		
		System.out.println("Ferias? " + estaDeFerias); // Ferias? false
		
		System.out.println("Status: " + status); // Status: A
	}

}
