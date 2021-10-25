package While;

import javax.swing.JOptionPane;

public class Exemplo1 {
	public static void main(String[] args) {
		
		String menu = "1 - Adição\n" 
				+ "2 - Subtração\n"
				+ "3 - Multiplicação\n"
				+ "4 - Divisão\n\n"
				+ "5 - Sair";
		
		int op = 0;
		
		while (op != 5) {
			op = Integer.parseInt(JOptionPane.showInputDialog(menu));
			
			if (op == 1) {
				JOptionPane.showMessageDialog(null, "1 - Adição");
				
				int n1 = Integer.parseInt(JOptionPane.showInputDialog("digite num 1:"));
				int n2 = Integer.parseInt(JOptionPane.showInputDialog("digite num 2:"));
				
				int total = n1 + n2;
				JOptionPane.showMessageDialog(null, "Resultado" + total);
				
			} else if (op == 2) {
				JOptionPane.showMessageDialog(null, "2 - Subtração");
				
				int n1 = Integer.parseInt(JOptionPane.showInputDialog("digite num 1:"));
				int n2 = Integer.parseInt(JOptionPane.showInputDialog("digite num 2:"));
				
				int total = n1 - n2;
				JOptionPane.showMessageDialog(null, "Resultado" + total);
			} else if (op == 3) {
				JOptionPane.showMessageDialog(null, "3 - Multiplicação");

				int n1 = Integer.parseInt(JOptionPane.showInputDialog("digite num 1:"));
				int n2 = Integer.parseInt(JOptionPane.showInputDialog("digite num 2:"));
				
				int total = n1 * n2;
				JOptionPane.showMessageDialog(null, "Resultado" + total);

			} else if (op == 4) {
				JOptionPane.showMessageDialog(null, "4 - Divisão");
				
				int n1 = Integer.parseInt(JOptionPane.showInputDialog("digite num 1:"));
				int n2 = Integer.parseInt(JOptionPane.showInputDialog("digite num 2:"));
				
				int total = n1 / n2;
				JOptionPane.showMessageDialog(null, "Resultado" + total);
			} 
			
		}
		
	}
}
