// Elaborar um programa que efetue a apresentação do valor da conversão em
// real(R$) de um valor lido em dólar(US$). O algoritmo deverá solicitar o valor
// da cotação do dólar e também a quantidade de dólares disponíveis com o
// usuário.


package Lista01;

import java.util.Scanner;

public class Num08 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double real;
		double dolar;
		double cotacao;
		
		System.out.print("Digite a quantidade em dolar: ");
		dolar = input.nextDouble();
		
		System.out.print("Digite a cotação do dolar: ");
		cotacao = input.nextDouble();
		
		real = dolar * cotacao;
		
		System.out.println("");
		
		System.out.printf("Quantia em reais: "+ real +" R$");
	}

}
