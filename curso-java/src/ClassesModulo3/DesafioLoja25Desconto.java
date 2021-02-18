package ClassesModulo3;

public class DesafioLoja25Desconto {


	String nome;
	double preco;
	static double desconto = 0.25;
	
	DesafioLoja25Desconto() {
		
	}
	
	DesafioLoja25Desconto(String nomeInicial) {
		nome = nomeInicial;
	}
	
	DesafioLoja25Desconto(String nomeInicial, double precoInicial) {
		nome = nomeInicial;
		preco = precoInicial;
	}
		
	double precoComDesconto() {	
		return preco * (1 - desconto);
	}
	
	double precoComDesconto(double descontoDoGerente) {
		return preco * (1 - desconto + descontoDoGerente);
	}
}
