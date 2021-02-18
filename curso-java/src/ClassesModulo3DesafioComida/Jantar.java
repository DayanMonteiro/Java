package ClassesModulo3DesafioComida;

public class Jantar {
	
	public static void main(String[] args) {
		
		Comida c1 = new Comida("Arroz", 0.180);
		Comida c2 = new Comida("Feijão", 0.300);
		Comida c3 = new Comida("Batata frita", 0.500);
		Comida c4 = new Comida("Bife acebolado", 0.300);
		
		Pessoa p = new Pessoa("Fulaninho", 99.8);
		
		System.out.println(p.apresentar());
		p.comer(c1);
		
		System.out.println(p.apresentar());
		p.comer(c2);
		
		System.out.println(p.apresentar());
		p.comer(c3);
		
		System.out.println(p.apresentar());
		p.comer(c4);
		
		System.out.println(p.apresentar());
	}

}
