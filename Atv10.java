package while_atividade;

import javax.swing.JOptionPane;

//Escreva um algoritmo para calcular o reajuste salarial de uma empresa que possui v�rios funcion�rios,
//cada um possuindo nome e sal�rio (utilize cart�o bandeira), de acordo com os seguintes crit�rios:
//a) Os funcion�rios com sal�rio inferior a 1.000,00 devem ter um reajuste de 40%;
//b) Os funcion�rios com sal�rio entre 1.000,00 (inclusive) e 3.000,00 (inclusive) devem ter um reajuste
//de 30%;
//c) Os funcion�rios com sal�rio superior a 3.000,00 devem ter um reajuste de 20%.


public class Atv10 {
	
	public static void main (String [] args) {
		
		String acao = "1 - Continuar ajustando -SIM \n"
				  	+ "2 - Cancelar -N�O \n";
		
		char confirma = 'S';
		double reajuste = 0;
		
		while(confirma == 'S') {
			
			String nome = JOptionPane.showInputDialog("Informe o nome do funcionario(a): ");
			double salario = Double.parseDouble(JOptionPane.showInputDialog("Informe o salario do funcionario(a): "));
			
			if (salario <= 1000) {
				reajuste = (salario / 100) * 40;
			} else if (salario >= 1000 || salario < 3000) {
				reajuste = (salario / 100) * 30;
			} if (salario >= 3000) {
				reajuste = (salario / 100) * 20;
			}
			
			JOptionPane.showMessageDialog(null, "Reajuste do salario de" + nome + "\n Sal�rio: " + reajuste);
			
			confirma = JOptionPane.showInputDialog(acao).toUpperCase().charAt(0);
		}	
	}
}
