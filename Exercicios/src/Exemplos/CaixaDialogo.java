package Exemplos;

import javax.swing.JOptionPane;

public class CaixaDialogo {

	public static void main(String[] args) {
		
		    //Entrada de dados
		String time = JOptionPane.showInputDialog("Informe o seu time de coração: ");
		
			//Saída de dados
		JOptionPane.showMessageDialog(null,"O seu time de coração é " + time);
		
		JOptionPane.showConfirmDialog(null,"Time de coração: " + time);
		
	}

}
