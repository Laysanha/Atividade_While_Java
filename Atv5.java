package While_ativiade1;

import javax.swing.JOptionPane;

//Uma empresa que possui X funcionários precisa saber a média de seus salários. Faça um algoritmo
//para ler a quantidade de funcionários e o salário de cada um e escrever a média dos salários. Primeiro,
//utilize a estrutura de repetição enquanto, depois a estrutura de repetição repita.

public class Atv5 {
	public static void main(String[] args) {
		
		String acao = "Adicionar mais números digite: -SIM \n"
				+ "--------------------------------------------------\n"
				+ "2 - Cancelar ação: -NÃO \n";
		char confirma = 'S';
		int i = 0; 
		double media = 0;
		
		while (confirma == 'S') {
			
			i++;
			double salario = Double.parseDouble((JOptionPane.showInputDialog("Informe seu salário:")));
			double totalSalario = salario;
			
			media = totalSalario / i;
			
			confirma = JOptionPane.showInputDialog(acao).toUpperCase().charAt(0);
		}
		JOptionPane.showMessageDialog(null, "A media de todos os salários \n" + "Média:" + media);
	}
}
