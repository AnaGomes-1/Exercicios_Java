package Exemplos;

import java.util.Scanner;

public class saidaTela {

	public static void main(String[] args) {
		
		int num1, num2;
		
		
		//ctrl + shift + f para identanção
		
		//Escreva
		System.out.print("Informe o 1° valor: ");
		Scanner lerDado1 = new Scanner(System.in);
		num1 = lerDado1.nextInt();
		
		System.out.print("Informe o 2° valor: ");
		Scanner lerDado2 = new Scanner(System.in);
		num2 = lerDado2.nextInt();
		
		
		System.out.printf("%d\n%d\n", num1, num2);

	}

}
