
public class Cliente {
	
	String nome;
	double saldo;
	
	public double consultarSaldo() {
		
		return saldo;
	}

	public double sacar(double valor) {
		saldo -= valor;
		
		return saldo;
		
		
	}
	
	
	public double depositar(double valor) {
		saldo += valor;
		
		return saldo;
	}
	
	
	
}
