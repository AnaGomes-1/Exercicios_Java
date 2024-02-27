package Lista03;

import java.util.Scanner;

public class MesBimestre {

	public static void main(String[] args) {

		int numMes;

		System.out.println("** Escolha a opção desejada **");
		System.out.println("1- Março");
		System.out.println("2- Abril");
		System.out.println("3- Maio");
		System.out.println("4- Junho");
		System.out.println("5- Agosto");
		System.out.println("6- Setembro");
		System.out.println("7- Outubro");
		System.out.println("8- Novembro");

		Scanner lerMes = new Scanner(System.in);
		numMes = lerMes.nextInt();

		switch (numMes) {

		case 1:
			System.out.println("O mês de Março pertence ao 1° Bimestre");
			break;

		case 2:
			System.out.println("O mês de Abril pertence ao 1° Bimestre");
			break;

		case 3:
			System.out.println("O mês de Maio pertence ao 2° Bimestre");
			break;

		case 4:
			System.out.println("O mês de Junho pertence ao 3° Bimestre");
			break;

		case 5:
			System.out.println("O mês de Agosto pertence ao 3° Bimestre");
			break;

		case 6:
			System.out.println("O mês de Setembro pertence ao 3° Bimestre");
			break;

		case 7:
			System.out.println("O mês de Outubro pertence ao 4° Bimestre");
			break;

		case 8:
			System.out.println("O mês de Novembro pertence ao 4° Bimestre");
			break;
			
		default:
			System.out.println("Opção Inválida!");
		}

	}

}
