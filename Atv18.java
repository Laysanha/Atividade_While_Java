package while_atividade;

import javax.swing.JOptionPane;

// Escreva um algoritmo/programa para calcular o reajuste salarial de uma empresa que possui vários
// funcionários, cada um possuindo 
// nome e salário (Utilize cartão bandeira), de acordo com os seguintes
// critérios:

// • Os funcionários com salário inferior a 1.000,00 devem ter um reajuste de 40%;
// • Os funcionários com salário entre 1.000,00 (inclusive) e 3.000,00 (inclusive) devem ter um
// reajuste de 30%;
// • Os funcionários com salário superior a 3.000,00 devem ter um reajuste de 20%.

public class Atv18 {
	
	public static void main(String[] args) {
		
		String acao = "1 - Continuar o reajuste -SIM \n" 
				+ "2 - Cancelar -NÃO \n";
		char confirma = 'S';
		
		while (confirma == 'S') {
			
			String nome = JOptionPane.showInputDialog("Informe o nome do funcionario(a): ");
			double salario = Double.parseDouble(JOptionPane.showInputDialog("Informe o salario do funcionario(a): "));
			
			if (salario < 1000) {
				salario = salario / 0.40;
			} else if (salario >= 1000 || salario <= 3000) {
				salario = salario / 0.30;
			} else if (salario > 3000 ) {
				salario = salario / 0.20;
			}
		
			JOptionPane.showMessageDialog(null, "O salario do funcionario: " + nome + "teve reajuste, ficando com o total de: " + salario);
			confirma = JOptionPane.showInputDialog(acao).toUpperCase().charAt(0);
		}
	}
	
}
