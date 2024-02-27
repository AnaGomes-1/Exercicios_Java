package Lista04;

import java.util.Scanner;

public class num3 {

	public static void main(String[] args) {
		//3) Faça um programa que leia o número equivalente a um mês do ano e diga o
		//número de dias do mês correspondente. Exiba a mensagem “Valor inválido!”,
		//caso o número digitado não corresponder a nenhum mês (1 a 12).
		
		int numMes;
		
		System.out.println("Escolha a opção desejada");
		
		System.out.println("1- Janeiro");
		System.out.println("2- Fevereiro");
		System.out.println("3- Março");
		System.out.println("4- Abril");
		System.out.println("5- Maio");
		System.out.println("6- Junho");
		System.out.println("7- Julho");
		System.out.println("8- Agosto");
		System.out.println("9- Setembro");
		System.out.println("10- Outubro");
		System.out.println("11- Novembro");
		System.out.println("12- Dezembro");
		
		Scanner lerMes = new Scanner(System.in);
		
		numMes = lerMes.nextInt();
		
		switch(numMes) {
		
		case 1:
			System.out.println("O mês de Janeiro tem 31 dias");
			break;
			
		case 2:
			System.out.println("O mês de Fevereiro tem 29 dias");
			break;
			
		case 3:
			System.out.println("O mês de Março tem 31 dias");
			break;
			
		case 4:
			System.out.println("O mês de Abril tem 30 dias");
			break;
			
		case 5:
			System.out.println("O mês de Maio tem 31 dias");
			break;
			
		case 6:
			System.out.println("O mês de Junho tem 30 dias");
			break;
			
		case 7:
			System.out.println("O mês de Julho tem 31 dias");
			break;
			
		case 8:
			System.out.println("O mês de Agosto tem 31 dias");
			break;
			
		case 9:
			System.out.println("O mês de Setembro tem 30 dias");
			break;
			
		case 10:
			System.out.println("O mês de Outubro tem 31 dias");
			break;
			
		case 11:
			System.out.println("O mês de Novembro tem 30 dias");
			break;
			
		case 12:
			System.out.println("O mês de Dezembro tem 31 dias");
			break;
			
		default:
			System.out.println("Mês Inválido!");
		}
		
		lerMes.close();
		

	}

}
