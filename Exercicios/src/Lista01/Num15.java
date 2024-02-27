// Entrar com dois números e imprimi-los em ordem decrescente (suponha
// números diferentes).

package Lista01;

import java.util.Scanner;

public class Num15 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int x, y;
		
		System.out.print("Digite um número: ");
		x = input.nextInt();
		
		System.out.print("Digite um número diferente do primeiro: ");
		y = input.nextInt();
		
		System.out.println("");
		
		if(x > y) {
			System.out.println(+ x + "..." + y);
		}else {
			if(x < y) {
				System.out.println(+ y + "..." + x);
			}else {
				System.out.println("Erro!! O segundo número não pode ser igual ao primeiro.");
			}
		}

	}

}
