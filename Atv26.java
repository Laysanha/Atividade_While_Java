package While_ativiade1;

import javax.swing.JOptionPane;

//Faça um algoritmo onde o usuário deverá digitar uma frase qualquer. Após a leitura, mostre na tela a
//quantidade de caracteres “espaço em branco” existente na frase.


public class Atv26 {
	
	public static void main(String[] args) {
		
		String acao = "1 - Continuar cadastrando -SIM \n"
			  	+ "2 - Cancelar -NÃO \n";
		
		char confirma = 'S';
		while (confirma == 'S') {
			
			String palavra = JOptionPane.showInputDialog("Informe uma palavra: ");
			int contador = palavra.length();
			int espaco = palavra.replace(" ", "").length();
	
			JOptionPane.showMessageDialog(null, "Total de caracters: "+contador + " os espaços em branco são: " + espaco);
			
			confirma = JOptionPane.showInputDialog(acao).toUpperCase().charAt(0);
		}
	}
	
}