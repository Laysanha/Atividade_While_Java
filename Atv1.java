package While_ativiade1;

import javax.swing.JOptionPane;

//Fa�a um algoritmo para ler o nome, idade e sexo de um n�mero indeterminado de alunos. Ao final
//escreva a m�dia da idade dos homens e das mulheres lidos. Primeiro, utilize a estrutura de repeti��o
//enquanto, depois a estrutura de repeti��o repita.

public class Atv1 {
	public static void main(String[] args) {
		
		String acao = "1 - Adicionar mais alunos; \n"
					+ "-------------------------------------\n"
					+ "2 - Cancelar adi��o;\n";
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
		
		JOptionPane.showMessageDialog(null, "A m�dia de pessoas com o sexo: \n\n Feminino: " + fem + "\n Masculino: " + masc);
	}
}
