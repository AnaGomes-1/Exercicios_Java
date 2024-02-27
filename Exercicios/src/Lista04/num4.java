package Lista04;

import java.util.Scanner;

public class num4 {
	
	public static void main(String[] args) {
	
	System.out.println("Tabela de Cargos");
	
	System.out.println("");
	
	System.out.println("1- Secretário");
	System.out.println("2- Professor");
	System.out.println("3- Tesoureiro");
	System.out.println("4- Coordenador");
	System.out.println("5- Diretor");
	
	System.out.println("");

	System.out.print("Digite o número correspondente ao cargo do funcionário: ");
	
	Scanner lerReajuste = new Scanner(System.in);
	int codigoCargo = lerReajuste.nextInt();
		
	System.out.println("");
	System.out.print("Informe o salário atual: ");

	double salarioAtual = lerReajuste.nextDouble();

	double aumento = 0;
	String nomeCargo = null;
	
	switch(codigoCargo) {

		case 1:
			nomeCargo = "Secretário";
			aumento = salarioAtual * 0.45;
			break;

		case 2:
			nomeCargo = "Professor";
			aumento = salarioAtual * 0.35;
			break;

		case 3:
			nomeCargo = "Tesoureiro";
			aumento = salarioAtual * 0.25;
			break;

		case 4:
			nomeCargo = "Coordenador";
			aumento = salarioAtual * 0.15;
			break;
			
		case 5:
			nomeCargo = "Diretor";
			System.out.println("Não tem aumento");
			break;

		default:
			System.out.println("Código Inválido!");
			return;

	}
	

	double novoSalario = salarioAtual + aumento;

	System.out.println("Cargo escolhido: " + nomeCargo);
	System.out.println("Valor do aumento: " + aumento);
	System.out.println("Novo salário: " + novoSalario);


}


}