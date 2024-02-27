package Construtores;

public class Pessoa {

	String nome;
	int idade;

	// Método Construtor Padrão
	Pessoa() {

	}

	// Método Construtor 1
	Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	// Método Construtor 2
	Pessoa(int idade, String nome) {
		this.idade = idade;
		this.nome = nome;
	}

}
