package fundamentos;

public class ConversaoNumeroString {

	public static void main(String[] args) {
		
		// to convert number for string
		Integer num1 = 10000;
		System.out.println(num1.toString().length()); // 5
		
		int num2 = 100000;
		System.out.println(Integer.toString(num2).length()); // 6 converti para string porque antes ja informei que era Integer
		
		
	/*consigo converter um numero para string tanto usando a .toString quanto
	 * concatenando com uma string vazia ex:*/
		System.out.println(("" + num1).length()); // 5
		// essa forma deve ser evitada 
	}
}
