package ClassesModulo3;


public class ProdutoTeste {

	
	public static void main(String[] args) {
		
		
		Produto p1 = new Produto("Notebook", 4356.89, 0.25);
		// p1.nome = "Notebook";
		// p1.preco = 4356.89 ;
		// p1.desconto = 0.25; // signigica que ter� 25% de desconto
				
		var p2 = new Produto();
		p2.nome = "Caneta Preta";
		p2.preco = 12.56;
		p2.desconto = 0.29;
		
		
		System.out.println(p1.nome); // Notebook
		System.out.println(p2.nome); // Caneta Preta
		
		
		double precoFinal1 = p1.precoComDesconto();
		double precoFinal2 = p2.precoComDesconto(0.1);
		double mediaCarrinho = (precoFinal1 + precoFinal2) / 2;
		System.out.printf("M�dia do carrinho = R$%.2f.", mediaCarrinho); // M�dia do carrinho = R$1638,29.
			
		
	}
}
