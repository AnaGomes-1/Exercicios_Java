package Exemplos;

import javax.swing.JOptionPane;

public class CaixaDialogoParse {

	public static void main(String[] args) {
		
		int num1, num2, soma;
		
			//Entrada de dados, convertendo para tipo Inteiro
		num1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro valor: "));
		
		num2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo valorr: "));
		
		soma = num1 + num2;
	}

}
