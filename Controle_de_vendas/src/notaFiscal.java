
public class notaFiscal {

	String data;
	int qtdVendida;
	Cliente cliente ;
	Produto produto;
	
	
	
	public double calcularTotal() {
		return qtdVendida * produto.preco;
	}
}
