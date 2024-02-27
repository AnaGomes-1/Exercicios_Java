// Escrever um programa que leia o nome de um vendedor, o seu salário fixo e o
// total de vendas efetuadas por ele no mês(em dinheiro). Sabendo que este
// vendedor ganha 15% de comissão sobre suas vendas efetuadas, informar p
// seu nome, o salário fixo e salário no final do mês.

package Lista01;

import java.util.Scanner;

public class Num04 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
			String nomeVendedor;
			double salarioFixo;
			double vendas;
			double comissao;
			double salarioFinal;
			
			System.out.print("Digite o nome do vendedor: ");
			nomeVendedor = input.nextLine();
			
			System.out.print("Digite o salário fixo do vendedor: ");
			salarioFixo = input.nextDouble();
			
			System.out.print("Digite o total de vendas efetuadas pelo vendedor: ");
			vendas = input.nextDouble();
			
			comissao = (vendas * 15) / 100;
			
			salarioFinal = comissao + salarioFixo;
			
			System.out.println("");
			
			System.out.println("Nome do Vendedor: " + nomeVendedor);
			System.out.println("Salário Fixo: " + salarioFixo + " reais");
			System.out.println("Salário Final: " + salarioFinal + " reais");
			
			
	}

}
