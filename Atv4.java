package While_ativiade1;

import javax.swing.JOptionPane;

public class Atv4 {
	public static void main(String[] args) {
		
		int result = 1;
		int i = 0;
		int n = 0;
		
		String acao = "1 - Adicionar mais números; \n"
				+ "-------------------------------------\n"
				+ "2 - Cancelar adição;\n";
		int op = 1;
		
		while (op != 2) {
		
			op = Integer.parseInt(JOptionPane.showInputDialog(acao));
			
			if (op == 1) {
	
				n = Integer.parseInt (JOptionPane.showInputDialog ("Digite o valor de N:"));
				
				while (i < n) {
					i++;
					result *= i;
				}
			}  else if (op == 2) {
			
				JOptionPane.showMessageDialog(null, "FIM...");
				result = 0;
			}
			
			JOptionPane.showMessageDialog(null, "O fatorial é: \n " + result + " fatorial");
		} 
	}
}
