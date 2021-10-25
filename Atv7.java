package While_ativiade1;

//Faça um algoritmo onde o usuário 
//deverá digitar uma série de 
//números inteiros maiores que zero,
//usando cartão bandeira.

import javax.swing.JOptionPane;

public class Atv7 {
	public static void main(String[] args) {
		String acao = "1 - Adicionar mais números -SIM \n"
				+ "-------------------------------------\n"
				+ "2 - Cancelar -NÃO \n";
		char confirma = 'S';
		int soma = 0;
		
			
		while (confirma == 'S') {
			
			int n = Integer.parseInt (JOptionPane.showInputDialog ("Informe um número"));
			
			soma += n; 
			confirma = JOptionPane.showInputDialog(acao).toUpperCase().charAt(0);
		}
		
		JOptionPane.showMessageDialog(null, "Total:" + soma);
	}
}
