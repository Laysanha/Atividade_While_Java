package While_ativiade1;

import javax.swing.JOptionPane;

//Faça um algoritmo para ler o nome de uma quantidade indefinida de alunos (utilize cartão bandeira).
//Considere que cada aluno fez uma quantidade (X) de provas, onde cada aluno poderá ter feito um
//número diferente de provas, isto é, o valor (X) pode ser diferente entre os alunos. Mostre no final a
//média geral obtida por toda a turma. Peça para o usuário digitar o valor (X) de cada aluno.

public class Atv12 {
	public static void main (String [] args) {	

		String acao = "1 - Continuar cadastrando -SIM \n"
			  	+ "2 - Cancelar -NÃO \n";
		
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
				
				nota = Double.parseDouble(JOptionPane.showInputDialog("Informe a " + i + "ª nota"));
				notaFinal += nota;
				JOptionPane.showMessageDialog(null, i);
			}
			
			media = notaFinal / nProva;
		
			JOptionPane.showMessageDialog(null, "A media do aluno(a): " + nome + "\n Média: " + media);
			confirma = JOptionPane.showInputDialog(acao).toUpperCase().charAt(0);
			
		}
	}

}
