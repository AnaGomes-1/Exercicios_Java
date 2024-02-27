// Imprima os números pares de 2 a 20 utilizando um dos laços de repetição.

package Lista5;

public class Num04 {

	public static void main(String[] args) {
		
		for(int i = 2; i <= 20; i++)
		{
			if(i % 2 == 0)
				System.out.printf("%s ", i);
		}

	}

}
