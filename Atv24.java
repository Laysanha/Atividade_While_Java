package while_atividade;

import javax.swing.JOptionPane;

//Fa�a um programa que solicite ao usu�rio a data do dia na forma DD/MM/AA. Imprima a data na tela
//utilizando uma �nica vari�vel no seguinte formato: AA/MM/DD.

public class Atv24 {
	public static void main(String[] args) {

		int dia = Integer.parseInt(JOptionPane.showInputDialog("Dia: "));
		int mes = Integer.parseInt(JOptionPane.showInputDialog("M�s: "));
		int ano = Integer.parseInt(JOptionPane.showInputDialog("Ano: "));

		String data = ano + "/" + mes + "/" + dia;

		JOptionPane.showMessageDialog(null, "A data �: " + data);
	}
}
