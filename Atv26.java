package While_ativiade1;

import javax.swing.JOptionPane;

//Fa�a um algoritmo onde o usu�rio dever� digitar uma frase qualquer. Ap�s a leitura, mostre na tela a
//quantidade de caracteres �espa�o em branco� existente na frase.


public class Atv26 {
	
	public static void main(String[] args) {
		
		String acao = "1 - Continuar cadastrando -SIM \n"
			  	+ "2 - Cancelar -N�O \n";
		
		char confirma = 'S';
		while (confirma == 'S') {
			
			String palavra = JOptionPane.showInputDialog("Informe uma palavra: ");
			int contador = palavra.length();
			int espaco = palavra.replace(" ", "").length();
	
			JOptionPane.showMessageDialog(null, "Total de caracters: "+contador + " os espa�os em branco s�o: " + espaco);
			
			confirma = JOptionPane.showInputDialog(acao).toUpperCase().charAt(0);
		}
	}
	
}