package While_ativiade1;

import javax.swing.JOptionPane;

//Faça um algoritmo para ler N números inteiros e ao final escrever sua média. Primeiro, utilize a
//estrutura de repetição enquanto, depois a estrutura de repetição repita.

public class Atv2 {
	public static void main(String[] args) {
		
		String acao = "1 - Adicionar mais números; \n"
					+ "-------------------------------------\n"
					+ "2 - Cancelar adição;\n";
		int op = 1;
		int media = 0; 		
		
		while (op != 2) {
			
			media ++;
			op = Integer.parseInt(JOptionPane.showInputDialog(acao));
			
			if (op == 1) {
				int num = Integer.parseInt(JOptionPane.showInputDialog("Informe um número:"));
				num += num;
				
				media = num / media; 
				
			} else if (op == 2) {
				JOptionPane.showMessageDialog(null, "FIM...");
			}
		}
		JOptionPane.showMessageDialog(null, "A média dos números inteiros: \n" + "Media:" + media);
	}
}
