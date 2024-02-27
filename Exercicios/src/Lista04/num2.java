package Lista04;

import java.util.Scanner;

public class num2 {
	
	public static void main(String[] args) {

	//2) Faça um programa que informe se uma capital brasileira é da região
	//Nordeste ou Sudeste, de acordo com a opção digitada pelo usuário. Em caso
	//de o usuário digitar o nome de uma capital que não esteja entre as opções,
	//informe que a capital é de outra região.
			
			int numCapital;
			
		    System.out.println("Menu 1");

			System.out.println("** Escolha a opção desejada **");

			System.out.println("1- (MA) São Luís");

			System.out.println("2- (PI) Teresina");

			System.out.println("3- (CE) Fortaleza");

			System.out.println("4- (RN) Natal");

			System.out.println("5- (PB) João Pessoa");

			System.out.println("6- (PE) Recife");

			System.out.println("7- (AL) Maceió");

			System.out.println("8- (SE) Aracaju");

			System.out.println("9- (BA) Salvador");

			System.out.println("");			

			System.out.println("Menu 2");

			System.out.println("** Escolha a opção desejada **");

			System.out.println("10- (SP) São Paulo");

			System.out.println("11- (MG) Belo Horizonte");

			System.out.println("12- (RJ) Rio de Janeiro");

			System.out.println("13- (ES) Vitória");

			Scanner lerCapital = new Scanner(System.in);

			numCapital = lerCapital.nextInt();

			switch(numCapital) {	

			case 1:
				System.out.println("** (MA) São Luís ** fica localizado na Região Nordeste do Brasil");
				break;

			case 2:
				System.out.println("** (PI) Teresina ** fica localizado na Região Nordeste do Brasil");
				break;		

			case 3:
				System.out.println("** (CE) Fortaleza ** fica localizado na Região Nordeste Brasil");
				break;

			case 4:
				System.out.println("** (RN) Natal ** fica localizado na Região Nordeste do Brasil");
				break;	

			case 5:
				System.out.println("** (PB) João Pessoa ** fica localizado na Região Nordeste do Brasil");
				break;		

			case 6:
				System.out.println("** (PE) Recife ** fica localizado na Região Nordeste do Brasil");
				break;
				
			case 7:
				System.out.println("** (AL) Maceió ** fica localizado na Região Nordeste do Brasil");
				break;
			
			case 8:
				System.out.println("** (SE) Aracaju ** fica localizado na Região Nordeste do Brasil");
				break;

			case 9:
				System.out.println("** (BA) Salvador ** fica localizado na Região Nordeste do Brasil");
				break;
				
			case 10:
				System.out.println("** (SP) São Paulo ** fica na Região Sudeste do Brasil");
				break;	

			case 11:
				System.out.println("** (MG) Belo Horizonte ** fica na Região Sudeste do Brasil");
				break;	

			case 12:
				System.out.println("** (RJ) Rio de Janeiro ** fica na Região Sudeste do Brasil");
				break;
				
			case 13:
				System.out.println("** (ES) Vitória ** fica na Região Sudeste do Brasil");
				break;
			
				default:
					System.out.println("Opção Inválida!");
					
			}
			lerCapital.close();	

		}

	}
