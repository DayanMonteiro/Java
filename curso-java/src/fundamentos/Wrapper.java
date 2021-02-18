package fundamentos;

import java.util.Scanner;

public class Wrapper {

		public static void main(String[] args) {
			
			Scanner entrada = new Scanner(System.in);
			//byte
			Byte b = 100;
			Short s = 1000;
			// int
			//Integer i = Integer.parseInt(entrada.next());
			Integer i = 1000;
			Long l = 100000L;
			
			System.out.println(b.byteValue()); // 100
			System.out.println(s.toString()); // 1000 exibiu 1000 porém convertei de number para string
			System.out.println(i * 3); // 3000
			System.out.println(l / 3 ); // 33333
			
			Float f = 123.10F;
			System.out.println(f); // 123.1
			
			Double d = 1234.5678;
			System.out.println(d);// 1234.5678
			
			
			Boolean bo = Boolean.parseBoolean("true");
			System.out.println(bo); // true
					
			Character c = '#';
			System.out.println(c + "..."); // #...
			
		}
}
