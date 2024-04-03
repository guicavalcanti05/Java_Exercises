package br.fiap.util;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;
import static java.lang.Double.parseDouble;

public class Util {
	public void menu() {
		int opcao;
		String aux = "Reserva de Cargas Boa Viagem\n";
		aux+="1. Reservar\n";
		aux+="2. Pesquisar";
		aux+="3. Listar as reservar\n";
		aux+="4. Capacidade Reservada\n";
		aux+="5. Cancelar Reserva\n";
		aux+="6. Finalizar\n";
		
		do {
			opcao = parseInt(showInputDialog(aux));
			if(opcao < 1 || opcao>6) {
				showMessageDialog(null, "Opção Invalida");
			}
		}
		
		while(opcao != 6);
	}
}
