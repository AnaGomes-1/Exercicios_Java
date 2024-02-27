package Exemplos;

import java.util.Scanner;

public class MetodoSomaValores {

	public static void main(String[] args) {
		Scanner lerValor = new Scanner(System.in);

		int x, y, soma;

		System.out.print("Informe o 1º valor: ");
		x = lerValor.nextInt();

		System.out.print("Informe o 1º valor: ");
		y = lerValor.nextInt();

		soma = som(x, y);

		System.out.print("A soma dos valores é: " + soma);

	}

	public static int som(int a, int b) {
		return a + b;
	}

}
