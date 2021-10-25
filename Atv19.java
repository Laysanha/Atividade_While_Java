package while_atividade;

import javax.swing.JOptionPane;

public class Atv19 {

	public static void main(String[] args) {

		String acao = "1 - Continuar cadastrando -SIM \n"
			  	+ "2 - Cancelar -NÃO \n";
		
		char confirma = 'S';
		int mediaM = 0;
		int mediaF = 0;
		int mediaI = 0;
		int i = 0; 
		
		while(confirma == 'S') {
						
			//String nome = JOptionPane.showInputDialog("Informe o nome do funcionario(a): ");
			char sexo = JOptionPane.showInputDialog("Informe qual o sexo: (F/M) ").toUpperCase().charAt(0);
			int idade = Integer.parseInt (JOptionPane.showInputDialog ("Informe a idade do funcionario(a):"));
			
			if (sexo == 'M') {
				mediaM++;
				mediaM = (mediaM / i); 
			} else if (sexo == 'F'){
				mediaF++;
				mediaF = (mediaF / i);
			} 
			
			if (idade >= 18) {
				mediaI++;
				mediaI = (mediaI / i);
			}
	
			confirma = JOptionPane.showInputDialog(acao).toUpperCase().charAt(0);	
			JOptionPane.showMessageDialog(null, mediaF);
		}
		
		JOptionPane.showMessageDialog(null, "A media de Mulheres: " + mediaF + "\n A media de Homens: " + mediaM + "\n\n Média de pessoas com mais de 18 anos: " + mediaI);
	}

}
