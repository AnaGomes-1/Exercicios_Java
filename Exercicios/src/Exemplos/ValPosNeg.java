package Exemplos;

import java.util.Scanner;

public class ValPosNeg {

	public static void main(String[] args) {
		int x;

		System.out.print("Informe um valor: ");

		Scanner leitura = new Scanner(System.in);

		x = leitura.nextInt();

		// testando se o valor informado foi zero
		while (x == 0) {

			System.out.println("Valor inválido!");
			System.out.print("Informe outro valor: ");
			x = leitura.nextInt();

		}

		// Verificando positivo ou negativo
		if (x > 0) {
			System.out.println("O valor informado é positivo!");
		} else {
			System.out.println("O valor informado é negativo!");

		}

		leitura.close();
	}

}
