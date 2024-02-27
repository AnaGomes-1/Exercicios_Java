// Entrar com dois números e imprimir o menor número(suponha números
// diferentes).

package Lista01;

import java.util.Scanner;

public class Num14 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int x, y;
		
		System.out.print("Digite um número: ");
		x = input.nextInt();
		
		System.out.print("Digite um número diferente do primeiro: ");
		y = input.nextInt();
		
		System.out.println("");
		
		if(x < y) {
			System.out.println("O número " + x + " é o menor.");
			
		}else{
			if(x > y) {
				System.out.println("O número " + y + " é o menor.");
				
			}else {
				System.out.println("Erro!! O segundo número não pode ser igual ao primeiro.");
			}
		}
				
	}

}
