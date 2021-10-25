package While_ativiade1;

import javax.swing.JOptionPane;

//Faça um programa que leia um LITERAL em forma de data. 
//Exemplo: “26/09/95” e escrever ao final o
//dia, mês e ano desta data todos em mensagens separadas

public class Atv23 {
	public static void main(String[] args) {
		
		String dia = JOptionPane.showInputDialog("Dia: ");
		String mes = JOptionPane.showInputDialog("Mês: ");
		String ano = JOptionPane.showInputDialog("Ano: ");
		
		String data = dia + "/" + mes + "/" + ano;
		
		JOptionPane.showMessageDialog(null, "A data é" + data + "\n Dia: " +dia+ "\n Mês: " +mes+ "\n Ano:" + ano);
	}
}