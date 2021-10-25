package While_ativiade1;

import javax.swing.JOptionPane;

//Faça um algoritmo para ler o nome, idade e sexo de um número indeterminado de alunos. Ao final
//escreva a média da idade dos homens e das mulheres lidos. Primeiro, utilize a estrutura de repetição
//enquanto, depois a estrutura de repetição repita.

public class Atv1 {
	public static void main(String[] args) {
		
		String acao = "1 - Adicionar mais alunos; \n"
					+ "-------------------------------------\n"
					+ "2 - Cancelar adição;\n";
		int op = 1;
		int fem = 0;
		int masc = 0;
		int media = 0; 
		
		while (op != 2) {
			op = Integer.parseInt(JOptionPane.showInputDialog(acao));
			
			if (op == 1) {
				//tring nome = JOptionPane.showInputDialog("Informe seu nome do aluno(a):");
				//int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade:"));
				char sexo = JOptionPane.showInputDialog("Informe o sexo:").toUpperCase().charAt(0);
				
				media++;
				
				if (sexo == 'F') {
					fem++;
					fem = (media) / fem;
				}else if (sexo == 'M') {
					masc++;
					masc = (media) / masc;
				} 
			}else if (op == 2) {
				JOptionPane.showMessageDialog(null, "FIM...");
			}
		}
		
		JOptionPane.showMessageDialog(null, "A média de pessoas com o sexo: \n\n Feminino: " + fem + "\n Masculino: " + masc);
	}
}
