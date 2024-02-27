// Escreva um programa que entre com um número e o imprime caso seja maior
// do que 20.

package Lista01;

import java.util.Scanner;

public class Num13 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int num;
		
		System.out.print("Digite um número: ");
		num = input.nextInt();
		
		if (num > 20) {
			
			System.out.println("O número " + num + " é maior que 20");
			
		}else {
			if(num < 20) {
				System.out.println("O número " + num + " é menor que 20");
				
			} else {
				
				System.out.println("O número informado é 20");
			}
		}

	}

}
