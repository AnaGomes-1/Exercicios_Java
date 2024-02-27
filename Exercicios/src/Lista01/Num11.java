// Faça um programa que receba o preço de custo de um produto e mostre o
// valor de venda. Sabe-se que o preço de custo receberá um acréscimo
// de acordo com um percentual informado pelo usuário. 

package Lista01;

import java.util.Scanner;

public class Num11 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double precoDeCusto;
		double acrescimo;
		double valorVenda;
		
		System.out.print("Digite o preço de custo do produto: ");
		precoDeCusto = input.nextDouble();
		
		System.out.print("Digite a porcentagem de acréscimo: ");
		acrescimo = input.nextDouble();
		
		valorVenda = (precoDeCusto * acrescimo) / 100 + precoDeCusto;
		
		System.out.println("");
		
		System.out.printf("O valor de venda do produto é: " + valorVenda);
	}

}
