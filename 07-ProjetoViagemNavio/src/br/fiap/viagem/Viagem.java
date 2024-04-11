package br.fiap.viagem;

import br.fiap.carga.Carga;

public class Viagem {
	private double capacidade;
	private int index;
	private Carga[] carga;
	
	public Viagem() {
		this.capacidade = 10000;
		this.index = 0;
		this.carga = new Carga[20];		
	}
	
	// método para reservar uma carga
	public boolean reservar(Carga carga) {
		boolean status = permitidoReservar(carga.getPeso());
		if(status) {
			this.carga[index] = carga;
			index++;
			return true;
		}			
		return false;
	}
	
	// método para retornar o peso total reservado
	public double capacidadeReservada() {
		double total = 0;
		for(int i = 0; i < index; i++) {
			total += carga[i].getPeso();
		}		
		return total;		
	}
	
	// método para verificar se uma carga pode ser reservada
	private boolean permitidoReservar(double peso) {
		return index < carga.length && capacidadeReservada() + peso <= capacidade;
	}
	
	// método para pesquisar um CNPJ
	public Carga pesquisar(int cnpj) {
		int posicao = pesquisarAux(cnpj);
		if(posicao != -1) {
			return carga[posicao];
		}
		return null;		
	}
	
	// método para cancelar uma reservar
	public boolean cancelar(int cnpj) {
		int posicao = pesquisarAux(cnpj);
		if(posicao != -1) {
			for(int i=posicao;i<index-1;i++) {
				carga[i]=carga[i+1];
				return true;
		}
			}
		index--;
		return false;
	}
	
	// método auxiliar para percorrer o vetor procurando por um cnpj
	public int pesquisarAux(int cnpj) {
		for(int i = 0; i < index; i++) {
			if(carga[i].getCliente().getCnpj() == cnpj) {
				return i;
			}
		}
		return -1;
	}

	public String listar() {
		String dados = "";
		for (int i = 0 ; i<index ; i++) {
			dados += carga[i].getDados() + "\n\n";
		}
		
		return dados;
	}
	
	
}
