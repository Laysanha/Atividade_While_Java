package While_ativiade1;

import javax.swing.JOptionPane;

//Dado um número indeterminado de funcionários, 
//-> onde são fornecidos o nome, número de dependentes e o número de horas trabalhadas.
//Pede-se que seja impresso, para cada funcionário, o
//seu nome, salário bruto, salário líquido e o valor descontado. 
//A empresa, paga R$ 25,00 por hora de trabalho,
//e R$ 125,55 por dependente, 
//e ainda faz um desconto de 12% sobre o salário bruto. 
//Pedese ainda que seja impresso o 
//total de funcionários da empresa, o total gasto com salários, e o total
//descontado. Utilize cartão bandeira.

public class Atv14 {

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