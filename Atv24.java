package while_atividade;

import javax.swing.JOptionPane;

//Faça um programa que solicite ao usuário a data do dia na forma DD/MM/AA. Imprima a data na tela
//utilizando uma única variável no seguinte formato: AA/MM/DD.

public class Atv24 {
	public static void main(String[] args) {

		int dia = Integer.parseInt(JOptionPane.showInputDialog("Dia: "));
		int mes = Integer.parseInt(JOptionPane.showInputDialog("Mês: "));
		int ano = Integer.parseInt(JOptionPane.showInputDialog("Ano: "));

		String data = ano + "/" + mes + "/" + dia;

		JOptionPane.showMessageDialog(null, "A data é: " + data);
	}
}
