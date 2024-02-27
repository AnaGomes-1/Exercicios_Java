package Exemplos;

import java.util.Scanner;

public class AreaRetangulo {

	public static void main(String[] args) {
		Scanner lerDimensao = new Scanner(System.in);
		
		int base, altura;
		
		System.out.print("Informe o valor da base do retangulo: ");
		base = lerDimensao.nextInt();
		
		System.out.print("Informe o valor da altura do retângulo: ");
		altura = lerDimensao.nextInt();
		
		
		// Variável para receber o valor de retorno do método calcAreaRet
		//int area = calcAreaRet(base,altura);
		
		
		//Saída com a execução direta do método calcAreaRet
		System.out.print("A area do retângulo é: " + calcAreaRet(base,altura));
		
		lerDimensao.close();
	}
	
	//Construção do método
	public static int calcAreaRet(int b, int a) {
		return b * a;	

	}

}
