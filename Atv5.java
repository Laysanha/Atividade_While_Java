package While_ativiade1;

import javax.swing.JOptionPane;

//Uma empresa que possui X funcion�rios precisa saber a m�dia de seus sal�rios. Fa�a um algoritmo
//para ler a quantidade de funcion�rios e o sal�rio de cada um e escrever a m�dia dos sal�rios. Primeiro,
//utilize a estrutura de repeti��o enquanto, depois a estrutura de repeti��o repita.

public class Atv5 {
	public static void main(String[] args) {
		
		String acao = "Adicionar mais n�meros digite: -SIM \n"
				+ "--------------------------------------------------\n"
				+ "2 - Cancelar a��o: -N�O \n";
		char confirma = 'S';
		int i = 0; 
		double media = 0;
		
		while (confirma == 'S') {
			
			i++;
			double salario = Double.parseDouble((JOptionPane.showInputDialog("Informe seu sal�rio:")));
			double totalSalario = salario;
			
			media = totalSalario / i;
			
			confirma = JOptionPane.showInputDialog(acao).toUpperCase().charAt(0);
		}
		JOptionPane.showMessageDialog(null, "A media de todos os sal�rios \n" + "M�dia:" + media);
	}
}
