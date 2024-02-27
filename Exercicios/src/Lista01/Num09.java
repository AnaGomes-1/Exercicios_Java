// Faça um programa que receba um valor que foi depositado e exiba o valor
// com dendimento após um mês.
// Considere fixo o juro da poupança em 0.70% a.m.

package Lista01;

import java.util.Scanner;

public class Num09 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double deposito;
		double juros;
		double rendimento;
		
		System.out.print("Digite o valor do deposito: ");
		deposito = input.nextDouble();
		
		juros = (deposito * 0.70) / 100;
		
		rendimento = juros + deposito;
		
		System.out.println("");
		
		System.out.print("O rendimento da poupança no mês foi de: " + rendimento + " R$");

	}

}
