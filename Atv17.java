package While_ativiade1;
import javax.swing.JOptionPane;

//Faça um algoritmo/programa que leia uma relação de N alunos (Utilize cartão bandeira), cada um
//possuindo a mesma quantidade Q de notas, faça um algoritmo/programa que mostre:
//a) Nome e média dos alunos
//b) Quantidade de alunos aprovados (média para aprovação: >= 7.0)
//c) Quantidade de alunos reprovados (média para reprovação: < 2.0)
//d) Quantidade de alunos em recuperação.

public class Atv17 {

	public static void main(String[] args) {
		String acao = "1 - Adicionar mais números -SIM \n" 
				+ "2 - Cancelar -NÃO \n";

		char confirma = 'S';
		int nota1 = 0, nota2 = 0, nota3 = 0, aprov = 0, reprov = 0, recup = 0;
		int media = 0;
		String nome = "";
		int i = 0;
	
		while (confirma == 'S') {
	
			i++;
	
			nome = JOptionPane.showInputDialog("Informe o nome do aluno(a): ");
	
			nota1 = Integer.parseInt(JOptionPane.showInputDialog("Informe nota" + i + ":"));
			nota2 = Integer.parseInt(JOptionPane.showInputDialog("Informe nota" + i + ":"));
			nota3 = Integer.parseInt(JOptionPane.showInputDialog("Informe nota" + i + ":"));
	
			media = (nota1 + nota2 + nota3) / 3;
			
			JOptionPane.showMessageDialog(null, "Tabela de nota \n Aluno(a):" + nome + "\n Média: " + media);
			
			if (media >= 7) {
				aprov++;
			} else if (media < 2) {
				reprov++;
			} else {
				recup++;
			}
			
			confirma = JOptionPane.showInputDialog(acao).toUpperCase().charAt(0);
		}
		JOptionPane.showMessageDialog(null, "Alunos aprovados:" + aprov + "\n Recuperação:" + recup
				+ "\n Reprovado: " + reprov);
	}
}