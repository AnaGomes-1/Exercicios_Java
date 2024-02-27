package Escola;

public class Principal {

	public static void main(String[] args) {
		// Instância "aluno" da classe Conta
		Aluno aluno = new Aluno();

		// Método exemplo criado antes do get e set
		// aluno.exibeInformacoesAluno();

		aluno.setNome("Maria");

		int mat = aluno.getMatricula();
		String nome = aluno.getNome();
		String curso = aluno.getCurso();

		System.out.printf("Matricula: %d\nNome: %s\nCurso: %s", mat, nome, curso);

	}

}
