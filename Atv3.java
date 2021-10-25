package While_ativiade1;

import javax.swing.JOptionPane;

public class Atv3 {
	public static void main(String[] args) {
		
		int calculo = 1;
		int i = 0;
		int a = 0;
		int b = 0;
		
		String acao = "1 - Adicionar mais números; \n"
				+ "-------------------------------------\n"
				+ "2 - Cancelar adição;\n";
		int op = 1;
		
		while (op != 2) {
		
			op = Integer.parseInt(JOptionPane.showInputDialog(acao));
			
			if (op == 1) {
				a = Integer.parseInt (JOptionPane.showInputDialog ("Digite o valor de a:"));
				b = Integer.parseInt (JOptionPane.showInputDialog ("Digite o valor de b:"));
				
				while (i < b) {	
					
					i++;	
					calculo *= a;
				}
			} else if (op == 2) {
				
				JOptionPane.showMessageDialog(null, "FIM...");
				calculo = 0;
				a = 0;
				b = 0;	
			}
			
			JOptionPane.showMessageDialog(null, "O vaor de a: " + a + "\n o valor de b: " + b + "\n o resultado: " + calculo);
		}
	}
}
