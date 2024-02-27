// Imprima os números ímpares de 1 a 30 utilizando um dos laços de
// Repetição.

package Lista5;

public class Num05 {

	public static void main(String[] args) {
		
		for(int i = 1;i <= 30; i++ )
		{
			if(i % 2 != 0)
				System.out.printf("%s ", i);
		}

	}

}
