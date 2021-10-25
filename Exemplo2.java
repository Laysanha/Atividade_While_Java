package While;

import javax.swing.JOptionPane;

//1 – Escreva um algoritmo, que leia um conjunto de N alunos (nome, altura (em
// cm) e sexo) e armazene em vetores. APÓS a leitura dos N Alunos (não é necessário utilizar
//menu), imprima:
//- O nome do aluno com maior altura;
//- O nome de todas as mulheres com altura acima da média da altura das mulheres;
//- O nome de todas as pessoas com altura abaixo da média.

public class Exemplo2 {
	
	public static void main(String[] args) {
		
		int qtd = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe quanos alunos vão ser cadastrados:"));
		
		String nomes[]   = new String[qtd]; 
		Double alturas[] = new Double[qtd]; 
		String sexos[]   = new String[qtd]; 
	
		double alturaMaior = 0;
		int contFem = 0;
		int somasAlturas = 0;
		
		for (int i = 0; i < qtd; i++) {
			
			nomes[i] = JOptionPane.showInputDialog("Informe o nome: ");
			alturas[i] =  Double.parseDouble(JOptionPane.showInputDialog("Informe sua altura em cm: "));
			sexos[i] = JOptionPane.showInputDialog("Informe seu sexo (M/F)");	
			
			if (i == 0) {
				alturaMaior = alturas[i];
			} else if (alturaMaior < alturas[i]) {
				alturaMaior = alturas[i];
			}
			
			somasAlturas += alturas[i];
			JOptionPane.showMessageDialog(null, somasAlturas);
		}
		
		
		for (int j = 0; j < qtd; j++) {
			 
			if (sexos[j] == "F" || sexos[j] == "f"){
				contFem++;
				somasAlturas += contFem;
			}		
			//int mediaAlt = (somasAlturas / contFem);
		}
		
		JOptionPane.showMessageDialog(null, alturaMaior);
	}
}
