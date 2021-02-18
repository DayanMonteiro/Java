package ClassesModulo3;

public class DesafioLoja25DescontoTeste {
	
	public static void main(String[] args) {
		
		
		DesafioLoja25Desconto p1 = new DesafioLoja25Desconto("Notebook", 4356.89);

				
		var p2 = new DesafioLoja25Desconto();
		p2.nome = "Caneta Preta";
		p2.preco = 12.56;
		DesafioLoja25Desconto.desconto = 0.50;
		
		
		System.out.println(p1.nome + " " + p1.precoComDesconto()); // Notebook
		System.out.println(p2.nome + " " + p2.precoComDesconto()); // Caneta Preta
		
		double precoFinal1 = p1.precoComDesconto();
		double precoFinal2 = p2.precoComDesconto(0.1);
		double mediaCarrinho = (precoFinal1 + precoFinal2) / 2;
		System.out.printf("Média do carrinho = R$%.2f.", mediaCarrinho); 
			
		
	}
}
