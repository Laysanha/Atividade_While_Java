package While_ativiade1;

import javax.swing.JOptionPane;

//Dado um n�mero indeterminado de funcion�rios, 
//-> onde s�o fornecidos o nome, n�mero de dependentes e o n�mero de horas trabalhadas.
//Pede-se que seja impresso, para cada funcion�rio, o
//seu nome, sal�rio bruto, sal�rio l�quido e o valor descontado. 
//A empresa, paga R$ 25,00 por hora de trabalho,
//e R$ 125,55 por dependente, 
//e ainda faz um desconto de 12% sobre o sal�rio bruto. 
//Pedese ainda que seja impresso o 
//total de funcion�rios da empresa, o total gasto com sal�rios, e o total
//descontado. Utilize cart�o bandeira.

public class Atv14 {

	public static void main(String[] args) {

		String acao = "1 - Continuar cadastrando -SIM \n" + "2 - Cancelar -N�O \n";

		char confirma = 'S';
		double liqSalrio  = 0;
		double brutSalrio = 0;  
		double desconto   = 0;  double dependente = 0;
		int i = 0; int j  = 0;  int k = 0;

		int totalSalario = 0;
		int totalDescont = 0;
		
		while (confirma == 'S') {

			i++;

			String nome = JOptionPane.showInputDialog("Informe o nome do " + i + "� funcioario(a): ");
			int horaTrabalhada = Integer.parseInt(JOptionPane.showInputDialog("Informe  as horas trabalhadas:"));
			int nDependente = Integer.parseInt(JOptionPane.showInputDialog("Informe o n�mero de dependentes:"));

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
			
			//Desconto de 12% sobre o sal�rio bruto
			
			desconto  = brutSalrio / 0.12;
			liqSalrio = desconto;
			
			totalDescont += desconto;
			
			JOptionPane.showMessageDialog(null, "funcionario(a) :" + nome + "\n Salario bruto: " 
			+ brutSalrio + "\n Sal�rio liqu�do: " + liqSalrio + " com desconto de 12%");

			confirma = JOptionPane.showInputDialog(acao).toUpperCase().charAt(0);
		}
		JOptionPane.showMessageDialog(null, "Total de funcion�rios da empresa: " + i + "\n Total de desconto: " 
		+ totalDescont + "\n Total de salario: " + totalSalario);
	}
}