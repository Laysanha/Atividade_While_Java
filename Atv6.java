package While_ativiade1;

import javax.swing.JOptionPane;

//Faça um algoritmo para ler o nome e a média de N alunos. Após a leitura, mostre na tela o nome e
//média do aluno com a maior média. Considere que as médias sejam todas diferentes entre si.
//Primeiro, utilize a estrutura de repetição enquanto, depois a estrutura de repetição repita.


public class Atv6 {
	public static void main(String[] args) {
		String acao = "Adicionar mais números digite: -SIM \n"
				+ "--------------------------------------------------\n"
				+ "2 - Cancelar ação: -NÃO \n";
		
		char confirma = 'S';
		String nomeFinal = "";
		double maiorMedia = 0;
		int i = 0;
		
		while (confirma == 'S') {
			
			String nome = JOptionPane.showInputDialog("Informe seu nome do aluno(a):");
			double media = Double.parseDouble((JOptionPane.showInputDialog("Informe a média:")));
			
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
		JOptionPane.showMessageDialog(null, "A maior média foi do aluno(a): \n" + "Nome: " + nomeFinal + "\n Média: " + maiorMedia);
	}
}
