//Escrever um programa que receba dois números e ao final mostre a soma, subtração,
// multiplicação e divisão dos números lidos.

package Lista01;

import java.util.Scanner;

public class Num02 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int x, y;
		int soma, subt, div, mult;
		
		System.out.println("Digite o primeiro número: ");
		x = input.nextInt();
		System.out.println("Digite o segundo número: ");
		y = input.nextInt();
		
		soma = x + y;
		subt = x - y;
		div = x / y;
		mult = x * y;
		
		System.out.println("O resultado da soma é: " + soma);
		System.out.println("O resultado da subtração é: " + subt);
		System.out.println("O resultado da divisão é: " + div);
		System.out.println("O resultado da multiplicação é: " + mult);
		

	}

}
