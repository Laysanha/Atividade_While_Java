package while_atividade;

import javax.swing.JOptionPane;

//Fa�a um algoritmo que leia uma rela��o de N alunos (utilize cart�o bandeira), cada um possuindo a
//mesma quantidade Q de notas, fa�a um algoritmo/programa que mostre:
//-) Nome e m�dia de cada aluno.
//b) Quantidade de alunos aprovados (m�dia para aprova��o: >= 7.0).
//c) Quantidade de alunos reprovados (m�dia para reprova��o: < 2.0).
//d) Quantidade de alunos em recupera��o.


public class Atv9 {
	
	public static void main (String [] args) {
	
		String acao = "1 - Adicionar mais n�meros -SIM \n"
				  + "2 - Cancelar -N�O \n";
		
		int nota1, nota2, nota3, media = 0;
		int aprov = 0; int reprov = 0; int recup = 0;
		int i = 0;
		char confirma = 'S';
		
		while(confirma == 'S') {
			
			String nome = JOptionPane.showInputDialog("Informe o nome do aluno(a): ");
			
			i++;
			
			nota1 = Integer.parseInt (JOptionPane.showInputDialog ("Informe nota" + i + ":"));
			nota2 = Integer.parseInt (JOptionPane.showInputDialog ("Informe nota" + i + ":"));
			nota3 = Integer.parseInt (JOptionPane.showInputDialog ("Informe nota" + i + ":"));
			
			media = (nota1 + nota2 + nota3) / 3;
			
			JOptionPane.showMessageDialog(null, "Aluno(a):" + nome + "\n M�dia:" + media);	
			
			if (media >= 7) {
				aprov++;
			} else if (media < 2 ) {
				reprov++;
			} else {
				recup++;
			}
			
			confirma = JOptionPane.showInputDialog(acao).toUpperCase().charAt(0);
		}
		JOptionPane.showMessageDialog(null, "Aprovados:" + aprov + "\n Recupera��o: " + recup + "\n Reprovado:" + reprov);
	}
	
}
