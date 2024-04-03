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
	public double capacidadeReservada() {
		double total = 0;
		for(int i = 0;i<index;i++) {
			total += carga[i].getPeso();
		}
		
		return total;
	}
	
	
	public boolean permitidoReservar(double peso) {
		if(index < carga.length && capacidadeReservada() + peso <= capacidade) {	
			return true;
		}
		
			return false;
	}
	
	public boolean reservar (Carga carga) {
		boolean status = permitidoReservar(carga.getPeso());
		if(status) {
			this.carga[index] = carga;
			index++;
			return true;
		}
		
		return false;
	}
	
	
	
}
