package Construtores;

public class Principal {

	public static void main(String[] args) {
		// Instância 1º método construtor
		Pessoa p1 = new Pessoa("Pedro", 30);

		// Instância 2º método construtor
		Pessoa p2 = new Pessoa(40, "Paulo");

		// Instância 3º método construtor padrão
		Pessoa p3 = new Pessoa();

		p3.nome = "Maria";
		p3.idade = 25;

		// Saída instância p1
		System.out.println("Nome p1: " + p1.nome);
		System.out.println("Idade p1: " + p1.idade);

		System.out.println("");

		// Saída instância p2
		System.out.println("Idade p2: " + p2.idade);
		System.out.println("Nome p2: " + p2.nome);

		System.out.println("");

		// Saída instância p3
		System.out.println("Idade p3: " + p3.idade);
		System.out.println("Nome p3: " + p3.nome);
	}

}
