//package while_atividade;
//
//import javax.swing.JOptionPane;
//
//Fa�a um algoritmo/programa que leia uma sequ�ncia de caracteres qualquer informada pelo usu�rio,
//fa�a um algoritmo/programa que mostre no v�deo a quantidade de vogais existentes.
//
//
//public class Atv27 {
//	public static void main(String[] args) {
//		String acao = "1 - Continuar cadastrando -SIM \n"
//			  	+ "2 - Cancelar -N�O \n";
//		
//		char confirma = 'S';
//		while (confirma == 'S') {
//			
//			String palavra = JOptionPane.showInputDialog("Informe uma palavra: ");
//			
//			int vogais = palavra.replace(" ", "").length();
//			
//			JOptionPane.showMessageDialog(null, "Voguais: " + vogais);
//			
//			confirma = JOptionPane.showInputDialog(acao).toUpperCase().charAt(0);
//		}
//	}
//}