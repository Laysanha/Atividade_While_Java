package While_ativiade1;

import javax.swing.JOptionPane;

//Fa�a um algoritmo para ler N n�meros inteiros e ao final escrever sua m�dia. Primeiro, utilize a
//estrutura de repeti��o enquanto, depois a estrutura de repeti��o repita.

public class Atv2 {
	public static void main(String[] args) {
		
		String acao = "1 - Adicionar mais n�meros; \n"
					+ "-------------------------------------\n"
					+ "2 - Cancelar adi��o;\n";
		int op = 1;
		int media = 0; 		
		
		while (op != 2) {
			
			media ++;
			op = Integer.parseInt(JOptionPane.showInputDialog(acao));
			
			if (op == 1) {
				int num = Integer.parseInt(JOptionPane.showInputDialog("Informe um n�mero:"));
				num += num;
				
				media = num / media; 
				
			} else if (op == 2) {
				JOptionPane.showMessageDialog(null, "FIM...");
			}
		}
		JOptionPane.showMessageDialog(null, "A m�dia dos n�meros inteiros: \n" + "Media:" + media);
	}
}
