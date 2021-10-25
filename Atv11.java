package While_ativiade1;

import javax.swing.JOptionPane;

//11) Uma empresa possui uma série de N funcionários (utilize cartão bandeira), dos quais é conhecido:
//nome, idade e sexo. Faça um algoritmo que imprima:
//a) A média da idade dos homens;
//b) A média da idade das mulheres;
//c) A média da idade das pessoas com mais de 18 anos;


public class Atv11 {
	
	public static void main (String [] args) {	
		String acao = "1 - Continuar cadastrando -SIM \n"
			  	+ "2 - Cancelar -NÃO \n";
		
		char confirma = 'S';
		int mediaM = 1;
		int mediaF = 1;
		int mediaI = 1;
		int i = 0; 
		
		while(confirma == 'S') {
			
			i++;
			
			//String nome = JOptionPane.showInputDialog("Informe o nome do funcionario(a): ");
			char sexo = JOptionPane.showInputDialog("Informe qual o sexo: (F/M) ").toUpperCase().charAt(0);
			int idade = Integer.parseInt (JOptionPane.showInputDialog ("Informe a idade do funcionario(a):"));
			
			if (sexo == 'M') {
				mediaM = sexo;
				mediaM = (mediaM / i); 
			} else if (sexo == 'F'){
				mediaF = sexo;
				mediaF = (mediaF / i);
			} 
			
			if (idade >= 18) {
				mediaI = idade;
				mediaI = (mediaI / i);
			}
	
			confirma = JOptionPane.showInputDialog(acao).toUpperCase().charAt(0);					
		}
		JOptionPane.showMessageDialog(null, "A media de Mulheres: " + mediaF + "\n A media de Homens: " + mediaM + "\n\n Média de pessoas com mais de 18 anos: " + mediaI);
	}
	
}

