package Exemplos;

import java.util.Locale;
import java.util.Scanner;

public class SaidaTela2 {

	public static void main(String[] args) {
		Scanner lerDado = new Scanner(System.in);

		float num1, num2;

		/*
		 * Configuração para o padrão estrangeiro do ponto (.) como separador de casas
		 * decimais. Dependerá do idioma utilizado
		 */
		Locale.setDefault(Locale.US);

		System.out.print("Informe o 1º valor: ");
		num1 = lerDado.nextFloat();

		System.out.print("Informe o 2º valor: ");
		num2 = lerDado.nextFloat();

		// Formatação %.2f para exibir duas casas decimais
		System.out.printf("%.2f\n%.2f\n", num1, num2);

		lerDado.close();
	}

}
