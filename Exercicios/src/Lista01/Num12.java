// Escreva um programa para ler o raio de um circulo, calcular e escrever 
// a sua área. (pR²)
// Calculo: área = PI*(raio²)

package Lista01;

import java.util.Scanner;

public class Num12 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double raio;
		double PI = 3.14;
		double area;
		
		System.out.println("Digite o raio do circulo: ");
		raio = input.nextDouble();
		
		area = PI * (raio * raio);
		
		System.out.println("");
		
		System.out.println("A Area do circulo é: " + area);

	}

}
