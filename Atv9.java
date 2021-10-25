package while_atividade;

import javax.swing.JOptionPane;

//Faça um algoritmo que leia uma relação de N alunos (utilize cartão bandeira), cada um possuindo a
//mesma quantidade Q de notas, faça um algoritmo/programa que mostre:
//-) Nome e média de cada aluno.
//b) Quantidade de alunos aprovados (média para aprovação: >= 7.0).
//c) Quantidade de alunos reprovados (média para reprovação: < 2.0).
//d) Quantidade de alunos em recuperação.


public class Atv9 {
	
	public static void main (String [] args) {
	
		String acao = "1 - Adicionar mais números -SIM \n"
				  + "2 - Cancelar -NÃO \n";
		
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
			
			JOptionPane.showMessageDialog(null, "Aluno(a):" + nome + "\n Média:" + media);	
			
			if (media >= 7) {
				aprov++;
			} else if (media < 2 ) {
				reprov++;
			} else {
				recup++;
			}
			
			confirma = JOptionPane.showInputDialog(acao).toUpperCase().charAt(0);
		}
		JOptionPane.showMessageDialog(null, "Aprovados:" + aprov + "\n Recuperação: " + recup + "\n Reprovado:" + reprov);
	}
	
}
