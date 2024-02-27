package Faculdade;

import Escola.Aluno;

public class Principal {

	public static void main(String[] args) {
		//Instância "aluFacul" da classe Aluno importada do pacote Escola		
		Aluno aluFacul = new Aluno();
				
		aluFacul.setNome("Maria");
				
		// Opção de execução com atribuição nas variávies
		/*int mat = aluFacul.getMatricula();
		String nome = aluFacul.getNome();
		String curso = aluFacul.getCurso();*/
				
		//System.out.printf("Matricula: %d\nNome: %s\nCurso: %s", mat,nome, curso);;
				
		//Saída com a execução direta dos métodos
		System.out.println("Nome do aluno(a): " + aluFacul.getNome());
		System.out.println("Matricula: " + aluFacul.getMatricula());
		System.out.println("Curso: " + aluFacul.getCurso());
	}

}
