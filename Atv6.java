package While_ativiade1;

import javax.swing.JOptionPane;

//Fa�a um algoritmo para ler o nome e a m�dia de N alunos. Ap�s a leitura, mostre na tela o nome e
//m�dia do aluno com a maior m�dia. Considere que as m�dias sejam todas diferentes entre si.
//Primeiro, utilize a estrutura de repeti��o enquanto, depois a estrutura de repeti��o repita.


public class Atv6 {
	public static void main(String[] args) {
		String acao = "Adicionar mais n�meros digite: -SIM \n"
				+ "--------------------------------------------------\n"
				+ "2 - Cancelar a��o: -N�O \n";
		
		char confirma = 'S';
		String nomeFinal = "";
		double maiorMedia = 0;
		int i = 0;
		
		while (confirma == 'S') {
			
			String nome = JOptionPane.showInputDialog("Informe seu nome do aluno(a):");
			double media = Double.parseDouble((JOptionPane.showInputDialog("Informe a m�dia:")));
			
			i ++;
		
			if (i == 1) {
				maiorMedia = media;
				nomeFinal = nome;
			} else if (maiorMedia < media) {
				maiorMedia = media;
				nomeFinal = nome;
			}
			
			confirma = JOptionPane.showInputDialog(acao).toUpperCase().charAt(0);
		}
		JOptionPane.showMessageDialog(null, "A maior m�dia foi do aluno(a): \n" + "Nome: " + nomeFinal + "\n M�dia: " + maiorMedia);
	}
}
