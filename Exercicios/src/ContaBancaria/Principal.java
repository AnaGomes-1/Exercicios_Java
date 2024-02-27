package ContaBancaria;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Conta conta = new Conta();
		
		Scanner lerDeposito = new Scanner(System.in);
		
		double deposito;
		double novoSaldo;
		
		System.out.println("O saldo da conta: " + conta.getSaldo());
		
		System.out.print("Informe o valor de depósito: ");
		deposito =  lerDeposito.nextDouble();
		
		novoSaldo = deposito + conta.getSaldo();
		
		conta.setSaldo(novoSaldo);
		
		System.out.println("");
		
		System.out.println("Saldo Atualizado: " + novoSaldo);
		

	}

}
