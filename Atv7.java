package While_ativiade1;

//Fa�a um algoritmo onde o usu�rio 
//dever� digitar uma s�rie de 
//n�meros inteiros maiores que zero,
//usando cart�o bandeira.

import javax.swing.JOptionPane;

public class Atv7 {
	public static void main(String[] args) {
		String acao = "1 - Adicionar mais n�meros -SIM \n"
				+ "-------------------------------------\n"
				+ "2 - Cancelar -N�O \n";
		char confirma = 'S';
		int soma = 0;
		
			
		while (confirma == 'S') {
			
			int n = Integer.parseInt (JOptionPane.showInputDialog ("Informe um n�mero"));
			
			soma += n; 
			confirma = JOptionPane.showInputDialog(acao).toUpperCase().charAt(0);
		}
		
		JOptionPane.showMessageDialog(null, "Total:" + soma);
	}
}
