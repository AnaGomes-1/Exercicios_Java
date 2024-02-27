/*Programa para receber o nome de um aluno com suas respectivas 2 notas,
em seguida calcular a média do aluno e apresentar ao final a média
calculada e a situação de Aprovação do aluno.
OBS: Aprovado com média >= 6
▪ Utilizar o código para uma turma de 30 alunos.
▪ Calcular e mostrar a média geral da turma
▪ Mostrar a maior média da turma
▪ Mostrar a menor média da turma*/

package Lista5;

import java.util.Scanner;

public class Num07 {

	public static void main(String[] args) {
		
		Scanner teclado;
		teclado = new Scanner(System.in);
		
		String aluno;
		float nota1, nota2, media, soma, mediaTurma;
		
		soma = 0;
		for(int i = 0; i < 3; i++)
		{
			System.out.print("Digite o nome do aluno: ");
			aluno = teclado.nextLine();
			System.out.print("Digite a primeira nota: ");
			nota1 = teclado.nextFloat();
			System.out.print("Digite a segunda nota: ");
			nota2 = teclado.nextFloat();
			teclado.nextLine();
			
			System.out.println("");
			
			media = (nota1 + nota2) / 2;
			soma = soma + media;
			System.out.printf("A média do aluno é %.1f\n", media);
			if(media >= 6)
				System.out.println("Aluno aprovado. Parabéns!");
			else
				System.out.println("Reprovado! Estude mais.");
			
		}
		
		mediaTurma = soma/3;
		System.out.printf("Média da turma: %.1f\n", mediaTurma);
		
		teclado.close();

	}

}
