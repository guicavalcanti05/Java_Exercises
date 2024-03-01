import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
	Scanner teclado = new Scanner(System.in);
	Cliente c=new Cliente();
	Produto p=new Produto();
	notaFiscal nota = new notaFiscal();
	Random rd = new Random();
	

	
			System.out.println("Digite o nome do cliente-->");
			c.nome = teclado.nextLine();
			
			System.out.println("Digite o CPF do cliente-->");
			c.cpf = teclado.nextInt();
			
		
			p.codigo = rd.nextInt(1000,10000);
			
			teclado.nextLine();
			System.out.println("Digite o nome do produto-->");
			p.descricao=teclado.nextLine();
			
			System.out.println("Digite o preço unitario--> R$");
			p.preco=teclado.nextDouble();
			
			System.out.println("Quantidade em estoque-->");
			p.quantidade=teclado.nextInt();
			
			teclado.nextLine();
			System.out.println("Digite a data da venda-->");
			nota.data = teclado.next();
			
			System.out.println("Digite a quantidade vendida-->");
			nota.qtdVendida=teclado.nextInt();
			
			nota.cliente = c;
			nota.produto = p; 
			
			
			
			System.out.println("Cliente:"+nota.cliente.nome);
			System.out.println("Produto:"+nota.produto.descricao);
			System.out.println("Valor total: R$"+nota.calcularTotal());
			
			teclado.close();
		}

}
