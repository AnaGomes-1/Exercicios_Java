// A Loja Mamão com Açucar está vendendo seus produtos em 5(cinco)
// prestações sem juros. Faça um rpograma que receba um valor de uma compra
// e mostre o valor das prestações.

package Lista01;

import java.util.Scanner;

public class Num10 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		
		double valorProduto;
		double valorPrestacao;
		int parcelas = 5;
		
		System.out.print("Digite o valor da compra: ");
		valorProduto = input.nextDouble();
		
		valorPrestacao = valorProduto / parcelas;
		
		System.out.println("");
		
		System.out.print("O valor de cada parcela é de: " + valorPrestacao + "R$");
				

	}

}
