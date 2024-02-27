// Escrever um rpograma para determinar o cosnumo médio de um automóvel sendo fornecida a distância
// total percorrida pelo automóvel e o total de combustível gasto.

package Lista01;

import java.util.Scanner;

public class Num03 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
			double taxadeConsumo;
			double km1;
			double km2;
			double kmtotal;
			double litros;
			
			System.out.print("Informe o KM inicial: ");
			km1 = input.nextDouble();
			
			System.out.print("Informe o KM final: ");
			km2 = input.nextDouble();
			
			System.out.print("Informe a quantidade de litros consumidos: ");
			litros = input.nextDouble();
			
			kmtotal = km2 - km1;
			
			taxadeConsumo = kmtotal / litros;
			
			System.out.println("");
			
			System.out.println("O total percorrido foi de: " + kmtotal + "Km");
			System.out.println("A taxa media de consumo é de: " + taxadeConsumo + " litros por km percorrido");

	}

}
