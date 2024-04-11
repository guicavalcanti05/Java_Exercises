package br.fiap.util;

import static javax.swing.JOptionPane.*;

import br.fiap.carga.Carga;
import br.fiap.cliente.Cliente;
import br.fiap.viagem.Viagem;

import static java.lang.Integer.parseInt;
import static java.lang.Double.parseDouble;

public class Util {

	private Viagem viagem = new Viagem();
	
	public void menu() {
		int opcao;
		String aux = "Reserva de Cargas Boa Viagem\n";
		aux += "1. Reservar\n";
		aux += "2. Pesquisar\n";
		aux += "3. Listar\n";
		aux += "4. Capacidade reservada\n";
		aux += "5. Cancelar\n";
		aux += "6. Finalizar\n";
				
		do {
			opcao = parseInt(showInputDialog(aux));
			if(opcao < 1 || opcao > 6) {
				showMessageDialog(null, "Opção inválida");
			}
			else {
				switch(opcao) {
					case 1:
						reservar();
						break;
					case 2:
						pesquisar();
						break;
						
					case 3:
						listar();
						break;
					case 4:
						capacidade();
						break;
						
					case 5:
						cancelar();
						break;

					case 6:
						opcao = 6;
						break;
				}
			}
		} while(opcao != 6);		
		
	}

	
	private void cancelar() {
		int cnpj = parseInt(showInputDialog("CNPJ:"));
		boolean status = viagem.cancelar(cnpj);
		
		if(status) {
			showMessageDialog(null, "Cancelamento realizado com sucesso");
		}
		
		else {
			showMessageDialog(null, "CNPJ não encontrado");
		}
		
	}


	private void listar() {
		String dados = viagem.listar();
		showMessageDialog(null, dados);
		
	}

	private void pesquisar() {
		int cnpj = parseInt(showInputDialog("CNPJ"));
		Carga carga = viagem.pesquisar(cnpj);
		if(carga != null) {
			showMessageDialog(null, carga.getDados());
		}
		
		else {
			showMessageDialog(null, "CNPJ não encontrado");
		}
		
	}

	private void capacidade() {
		showMessageDialog(null, viagem.capacidadeReservada());
		
	}

	private void reservar() {
		int cnpj;
		String destino, cliente;
		
		cnpj = parseInt(showInputDialog("CNPJ"));
		destino = showInputDialog("Destino");
		cliente = showInputDialog("Cliente");
		
		Cliente client = new Cliente(cnpj, cliente);
		Carga carga = new Carga(destino, client);
		
		if(viagem.reservar(carga)) {
			showMessageDialog(null, "Carga reservada com sucesso");
		}
		else {
			showMessageDialog(null, "Erro ao reservar carga");
		}
		
	}
	
	
}
