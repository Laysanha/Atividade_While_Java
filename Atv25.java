package While_ativiade1;

//Fa�a um algoritmo/programa que leia uma quantidade N de palavras, ap�s cada leitura escreva o
//tamanho da mesma

import javax.swing.JOptionPane;

public class Atv25 {

	public static void main(String[] args) {
		
		String acao = "1 - Continuar cadastrando -SIM \n"
			  	+ "2 - Cancelar -N�O \n";
		
		char confirma = 'S';
		while (confirma == 'S') {
			
			String palavra = JOptionPane.showInputDialog("Informe uma palavra: ");
			int contador = palavra.length();
	
			JOptionPane.showMessageDialog(null, contador);
			
			confirma = JOptionPane.showInputDialog(acao).toUpperCase().charAt(0);
		}
	}
}