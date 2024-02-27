// A partir de 03 notas fornecidas de um aluno, informe se este foi aprovado, ficou de
// recuperação ou foi reprovado. A média de aprovação é >= 7.0; a média de recuperação
// é >= 5.0 e < 7.0; e a média do reprovado é < 5.0.

package Lista01;

import java.util.Scanner;

public class Num16 {

	public static void main(String[] args) {
		
		double nota1, nota2, nota3, media;
		String nomeAluno;
		
		System.out.print("Informe o nome do aluno: ");
		nomeAluno = new Scanner(System.in).nextLine();
		
		System.out.print("Digite a primeira nota: ");
		nota1 = new Scanner(System.in).nextDouble();
		
		System.out.print("Digite a segunda nota: ");
		nota2 = new Scanner(System.in).nextDouble();
		
		System.out.print("Digite a terceira nota: ");
		nota3 = new Scanner(System.in).nextDouble();
		
		media = (nota1 + nota2 + nota3) / 3;
		
		System.out.println("");
		
		if(media >= 7) {
			System.out.printf("O(a) aluno(a) " + nomeAluno + " foi aprovado(a) com média: %.2f", media);
		}else if(media >= 5) {
			System.out.printf("O(a) aluno(a) " + nomeAluno + " ficou em recuperação com média: %.2f", media);
		}else {
			System.out.printf("O(a) aluno(a) " + nomeAluno + " foi reprovado(a) com média: %.2f", media);
		}

	}

}
