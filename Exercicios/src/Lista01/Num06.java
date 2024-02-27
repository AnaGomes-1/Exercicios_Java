//Escrever um programa em que leia dois valores para as variáveis A e B, e
// efetuar as trocas dos valores de forma que a variável A passe a possuir o valor
// da variável B e a variável B passe a possuir o valor da variável A. Apreentar
// os valores trocados.

//Lembrando que temos que ter 3 variáveis para que uma haja como variável
// de armaenamento, ou seja, para evitar que o valor original de A se perca é
// necessário associar a uma outra variável(denominada usualmente de
// variável auxiliar) tal valor, estabelecer uma associação de A com o valor de B
// e, por último, associar B ao valor "salvo" na variável auxiliar.

package Lista01;

import java.util.Scanner;

public class Num06 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int a, b, c;
		
		System.out.print("Digite o valor de A: ");
		a = input.nextInt();
		
		System.out.print("Digite o valor de B: ");
		b = input.nextInt();
		
		c = a;
		a = b;
		b = c;
		
		System.out.println("");
		
		System.out.println("O valor de A é: " + a);
		System.out.println("O valor de B é: " + b);

	}

}
