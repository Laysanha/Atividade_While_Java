package While_ativiade1;

import javax.swing.JOptionPane;

//Fa�a um algoritmo para ler o nome de uma quantidade indefinida de alunos, usando cart�o bandeira.
//Considere que cada aluno fez tr�s(3) provas, por isso para cada aluno dever� ser digitado tamb�m,
//alem de seu nome, as suas tr�s(3) notas.

public class Atv16 {

	public static void main(String[] args) {
		String acao = "1 - Adicionar mais n�meros -SIM \n" 
					+ "2 - Cancelar -N�O \n";

		char confirma = 'S';
		int nota1, nota2, nota3 = 0;
		String nome = "";
		int i = 0;

		while (confirma == 'S') {

			i++;

			nome = JOptionPane.showInputDialog("Informe o nome do aluno(a): ");

			nota1 = Integer.parseInt(JOptionPane.showInputDialog("Informe nota" + i + ":"));
			nota2 = Integer.parseInt(JOptionPane.showInputDialog("Informe nota" + i + ":"));
			nota3 = Integer.parseInt(JOptionPane.showInputDialog("Informe nota" + i + ":"));

			JOptionPane.showMessageDialog(null,
					"Tabela de notas \n Aluno(a):" + nome + "\n" + "Notas:" + nota1 + "\n" + nota2 + "\n" + nota3);

			confirma = JOptionPane.showInputDialog(acao).toUpperCase().charAt(0);
		}

	}

}