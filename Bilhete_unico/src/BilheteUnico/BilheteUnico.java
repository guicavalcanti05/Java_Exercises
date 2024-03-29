package BilheteUnico;

import java.util.Random;

import Tarifa.Tarifa;
import Usuario.Usuario;

public class BilheteUnico {

	Usuario usuario;
	Tarifa tarifa;
	double saldo;
	int numBilhete = getNumBilhete();
	
	
	
	

	public int getNumBilhete() {
		Random rd = new Random();
		
		return rd.nextInt(1000 , 10000);
			
		
	}
	
	public void setTarifa(Tarifa tarifa) {
	    this.tarifa = tarifa;
	}



	public double carregarBilhete(double deposito) {
		saldo += deposito;
		
		return saldo;
		
	}
	
	public double passarCatraca() {
		if(tarifa.getTipoTarifa() ==1) {
			saldo -= tarifa.getTarifaBase()/2;
			
			return saldo;
		}
		else if(tarifa.getTipoTarifa()==2) {
			saldo -= tarifa.getTarifaBase();
			
			return saldo;
		}
		
		else if(tarifa.getTipoTarifa()==3) {
			saldo -=tarifa.getTarifaBase()/2;
			
			return saldo;
		}
		
		else {
			saldo -= tarifa.getTarifaBase();
			
			return saldo;
		}
		
	}
	
	
	
	
	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	

	
}

