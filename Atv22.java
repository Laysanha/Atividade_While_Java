package while_atividade;

import javax.swing.JOptionPane;

public class Atv22 {
	public static void main(String[] args) {

		String acao = "1 - Continuar cadastrando -SIM \n" + "2 - Cancelar -NÃO \n";

		char confirma = 'S';
		double liqSalrio  = 0;
		double brutSalrio = 0;  
		double desconto   = 0;  double dependente = 0;
		int i = 0; int j  = 0;  int k = 0;

		int totalSalario = 0;
		int totalDescont = 0;
		
		while (confirma == 'S') {

			i++;

			String nome = JOptionPane.showInputDialog("Informe o nome do " + i + "º funcioario(a): ");
			int horaTrabalhada = Integer.parseInt(JOptionPane.showInputDialog("Informe  as horas trabalhadas:"));
			int nDependente = Integer.parseInt(JOptionPane.showInputDialog("Informe o número de dependentes:"));

			// Paga R$ 25,00 por hora de trabalho
			
			while (j < horaTrabalhada) {
				
				brutSalrio += 25;
				j++;			
			}
			// Paga R$ 125,55 por dependente
			
			while (k < nDependente) {
				
				dependente = brutSalrio + 125.55;
				totalSalario += dependente;
				k++;			
			}
			
			//Desconto de 12% sobre o salário bruto
			
			desconto  = brutSalrio / 0.12;
			liqSalrio = desconto;
			
			totalDescont += desconto;
			
			JOptionPane.showMessageDialog(null, "funcionario(a) :" + nome + "\n Salario bruto: " 
			+ brutSalrio + "\n Salário liquído: " + liqSalrio + " com desconto de 12%");

			confirma = JOptionPane.showInputDialog(acao).toUpperCase().charAt(0);
		}
		JOptionPane.showMessageDialog(null, "Total de funcionários da empresa: " + i + "\n Total de desconto: " 
		+ totalDescont + "\n Total de salario: " + totalSalario);
	}
}
