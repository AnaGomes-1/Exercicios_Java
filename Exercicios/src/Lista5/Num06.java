// Desenvolva:
// Lê 5 nomes e notas de uma turma,
// calcula e exibe em seguida a média das notas da turma e em seguida
// exibe a relação de nomes cuja nota é superior a esta média.

package Lista5;

import java.util.Scanner;

public class Num06 {

	public static void main(String[] args) {
		
		String[] nomes;
		nomes = new String[5];
		double[] notas = new double[5];
		double soma = 0, media;
		
		for(int i = 0; i <= 4; i++) {
			System.out.print("Digite o nome do aluno n°" + (i+1) + ": ");
			nomes[i] = new Scanner(System.in).nextLine();
			System.out.print("Digite a nota do aluno n°" + (i+1) + ": ");
			notas[i] = new Scanner(System.in).nextDouble();
			soma = soma +notas[i];
			System.out.println("");
		}
		media = soma / 5;
		System.out.println("A média dos alunos é: " + media);
		System.out.println("");
		System.out.println("Lista dos alunos cuja nota é superior a média da turma");
		for(int i = 0; i <= 4; i++) {
			if(notas[i] > media)
				System.out.println(nomes[i] + ": " + notas[i]);
		}
		

	}

}
