package Exemplos;

import java.util.Scanner;

public class CalcBasica {
	// Construção dos métodos
	public int somValores(int a, int b) {
		return a + b;
	}

	public int subValores(int a, int b) {
		return a - b;
	}

	public int multValores(int a, int b) {
		return a * b;
	}

	public float divValores(float a, float b) {
		return a / b;
	}

	// Método principal - entrada do programa
	public static void main(String[] args) {

		// Instância (objeto) da classe Scanner
		Scanner lerValores = new Scanner(System.in);

		// Instância (objeto) da classe CalcBasica
		CalcBasica c = new CalcBasica();

		// Declaração das variáveis a serem utilizadas nas operações
		int num1, num2, opcao;
		float fNum1, fNum2; // Variáveis para a operação de divisão

		System.out.println("Escolha opção desejada: ");
		System.out.println("1- Soma");
		System.out.println("2- Subtração");
		System.out.println("3- Multiplicação");
		System.out.println("4- Divisão");
		System.out.println("0- Sair");

		opcao = lerValores.nextInt();

		while (opcao != 0) {

			if (opcao == 1) {

				System.out.print("Informe o 1º valor: ");
				num1 = lerValores.nextInt();

				System.out.print("Informe o 2º valor: ");
				num2 = lerValores.nextInt();

				// Variável declarada que receberá o resultado método
				int operacao = c.somValores(num1, num2);

				System.out.println("A soma dos valores é: " + operacao);

				break;
			}

			if (opcao == 2) {

				System.out.print("Informe o 1º valor: ");
				num1 = lerValores.nextInt();

				System.out.print("Informe o 2º valor: ");
				num2 = lerValores.nextInt();

				// Variável declarada que receberá o resultado método
				int operacao = c.subValores(num1, num2);

				System.out.println("A subtração dos valores é: " + operacao);

				break;
			}

			if (opcao == 3) {

				System.out.print("Informe o 1º valor: ");
				num1 = lerValores.nextInt();

				System.out.print("Informe o 2º valor: ");
				num2 = lerValores.nextInt();

				// Variável declarada que receberá o resultado método
				int operacao = c.multValores(num1, num2);

				System.out.println("A multiplicação dos valores é: " + operacao);

				break;
			}

			if (opcao == 4) {

				System.out.print("Informe o 1º valor: ");
				fNum1 = lerValores.nextFloat();

				System.out.print("Informe o 2º valor: ");
				fNum2 = lerValores.nextFloat();

				// Variável declarada que receberá o resultado método
				float operacao = c.divValores(fNum1, fNum2);

				System.out.printf("A divisão dos valores é: %.2f ", operacao);

				break;
			}
			// Opção 0 do Menu
			System.out.println("Fim da execução...");
		}
		// Método close encerra a execução do objeto da classe Scanner
		lerValores.close();

	}

}
