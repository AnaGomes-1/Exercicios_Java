package Lista5;

import java.util.Scanner;

public class Num07ComVetor {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		String aluno[];
		float nota1[], nota2[], media[];
		float mediaTurma;
		aluno = new String[30];
		nota1 = new float[30];
		nota2 = new float[30];
		media = new float[30];
		
		mediaTurma = 0;
		for(int i = 0; i < 3; i++)
		{
			System.out.print("Digite o nome do Aluno: ");
			aluno[i] = teclado.nextLine();
			System.out.print("Digite a primeira nota: ");
			nota1[i] = teclado.nextFloat();
			System.out.print("Digite a segunda nota: ");
			nota2[i] = teclado.nextFloat();
			teclado.nextLine();
			
			media[i] = (nota1[i] + nota2[i]) / 2;
			mediaTurma += media[i];
			System.out.printf("A média do aluno é %.1f\n", media[i]);
			if (media[i] >= 6)
				System.out.println("Aluno aprovado. Parabéns!");
			else
				System.out.println("Reprovado! Estude mais.");
			
		}
		
		mediaTurma /= 3;
		
		for(int i = 0; i < 3; i++)
		{
			System.out.printf("Aluno: %s - Média: %.1f\n", aluno[i], media[i]);
		}
		System.out.printf("Média da Turma = %1f\n", mediaTurma);
		
		// Melhor aluno da turma
		// Pior aluno da turma
		// Alunos com média abaixo da média da turma
		
		teclado.close();

	}

}
