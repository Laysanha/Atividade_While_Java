package While_ativiade1;

import javax.swing.JOptionPane;

//Fa?a um algoritmo onde o usu?rio dever? digitar uma s?rie de n?meros inteiros maiores que zero,
//usando cart?o bandeira.

public class Atv15 {
	public static void main(String[] args) {

		String acao = "1 - Adicionar mais n?meros -SIM \n"
				+ "-------------------------------------\n"
				+ "2 - Cancelar -N?O \n";
		
		char confirma = 'S';
		//int n = 0;
		
		while (confirma == 'S') {
			//n = Integer.parseInt (JOptionPane.showInputDialog ("Informe n:"));	
			
			confirma = JOptionPane.showInputDialog(acao).toUpperCase().charAt(0);
		}
	}
}