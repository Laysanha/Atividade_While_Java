package While_ativiade1;

import javax.swing.JOptionPane;

//Fa�a um algoritmo para ler o nome de uma quantidade indefinida de alunos (utilize cart�o bandeira).
//Considere que cada aluno fez uma quantidade (X) de provas, onde cada aluno poder� ter feito um
//n�mero diferente de provas, isto �, o valor (X) pode ser diferente entre os alunos. Mostre no final a
//m�dia geral obtida por toda a turma. Pe�a para o usu�rio digitar o valor (X) de cada aluno.

public class Atv12 {
	public static void main (String [] args) {	

		String acao = "1 - Continuar cadastrando -SIM \n"
			  	+ "2 - Cancelar -N�O \n";
		
		char confirma = 'S';
		int i = 0; 
		
		while (confirma == 'S') {
			
			String nome = JOptionPane.showInputDialog("Informe  o nome do aluno(a): ");
			int nProva = Integer
					.parseInt(JOptionPane.showInputDialog("Informe a quantidade de provas feita pelo aluno:"));

			double media = 0;
			double nota = 0;
			double notaFinal = 0;
				
			while (i < nProva) {
				
				i++;
				
				nota = Double.parseDouble(JOptionPane.showInputDialog("Informe a " + i + "� nota"));
				notaFinal += nota;
				JOptionPane.showMessageDialog(null, i);
			}
			
			media = notaFinal / nProva;
		
			JOptionPane.showMessageDialog(null, "A media do aluno(a): " + nome + "\n M�dia: " + media);
			confirma = JOptionPane.showInputDialog(acao).toUpperCase().charAt(0);
			
		}
	}

}
