package While_ativiade1;

import javax.swing.JOptionPane;

//Em um banco existem (N) caixas. Cada caixa atende uma quantidade indefinida de clientes (utilize
//cartão bandeira). Cada cliente faz apenas uma única operação: depósitos(D), ou retiradas(R). Faça um
//algoritmo para ler: nome do cliente, tipo da operação (D/R) e valor da operação, onde esta leitura
//deve ser feita para cada um dos clientes de cada um dos (N) caixas. Ao final, mostrar na tela o total
//geral de depósitos e retiradas ocorridos.

public class Atv13 {

	public static void main(String[] args) {

		String acao = "1 - Continuar cadastrando -SIM \n" + "2 - Cancelar -NÃO \n";

		char confirma = 'S';

		double deposito = 0;
		double retirada = 0;
		double totalFinal = 0;
		int i = 0;
				
		while (confirma == 'S') {

			i++;

			JOptionPane.showInputDialog("Nome do " + i + "° cliente: ");
			char depOuRet = JOptionPane.showInputDialog("Deseja realizar um depósito ou retirada (D/R)? ").toUpperCase()
					.charAt(0);
			if (depOuRet == 'D') {
				double valor = Double.parseDouble(JOptionPane.showInputDialog("Qual valor deseja depositar?"));
				deposito += valor;
			} else if (depOuRet == 'R') {
				double valor = Double.parseDouble(JOptionPane.showInputDialog("Qual valor deseja retirar?"));
				retirada -= valor;
			} 

			totalFinal = deposito + retirada;
			
			confirma = JOptionPane.showInputDialog(acao).toUpperCase().charAt(0);
		}
		JOptionPane.showMessageDialog(null, "Total final de todas operações: " + totalFinal);
	}

}
