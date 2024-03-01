
public class Cliente {
	
	String nome;
	double saldo;
	
	public double consultarSaldo() {
		
		return saldo;
	}

	public double sacar(double sacar) {
		saldo -= sacar;
		
		return saldo;
	}
	
	
	public double depositar(double depositar) {
		saldo += depositar;
		
		return saldo;
	}
	
	
	
}
