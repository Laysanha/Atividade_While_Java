//package while_atividade;
//
//import javax.swing.JOptionPane;
//
//Faça um algoritmo/programa que leia uma sequência de caracteres qualquer informada pelo usuário,
//faça um algoritmo/programa que mostre no vídeo a quantidade de vogais existentes.
//
//
//public class Atv27 {
//	public static void main(String[] args) {
//		String acao = "1 - Continuar cadastrando -SIM \n"
//			  	+ "2 - Cancelar -NÃO \n";
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