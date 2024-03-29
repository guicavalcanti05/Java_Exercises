package Main;

import java.util.Scanner;

import BilheteUnico.BilheteUnico;
import Tarifa.Tarifa;
import Usuario.Usuario;

public class Main {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	
	Usuario usuario = new Usuario(null, null);
	Tarifa tarifa = new Tarifa();
	BilheteUnico bilhete = new BilheteUnico();
	
	
	int opcao;
	bilhete.setSaldo(100);
	
	tarifa.setTarifaBase(5.0);
	bilhete.setTarifa(tarifa);

	
	
	
	
	System.out.print("Digite o nome do usuario-->");
	usuario.setNome(teclado.next());
	
	System.out.println("Digite o cpf do usuario-->");
	usuario.setCpf(teclado.next());
	
	System.out.println("Digite o seu tipo de tarifa-->\n1-estudante \n2-normal \n3-professor");
	tarifa.setTipoTarifa(teclado.nextInt());

	
	
	do {
		System.out.println("1-Saldo\n2-Carregar Bilhete\n3-Passar Catraca\n4-Aumnetaar tarifa base\n5-Alterar tipo de tarifa\n6-sair");
		opcao=teclado.nextInt();
		
		
		switch(opcao) {
		case 1:
			System.out.println("Seu saldo é :"+bilhete.getSaldo());
			break;
		
		
		case 2:
			System.out.println("Quanto deseja depositar no bilhete-->");
			bilhete.carregarBilhete(teclado.nextDouble());
			
			System.out.println("Seu novo saldo é "+bilhete.getSaldo());
			break;
		
		
		case 3:
			System.out.print("Voce passou na catraca seu novo saldo e-->"+bilhete.passarCatraca());
			break;
			
			
		case 4:
			System.out.println("Qual a nova tarifa base-->");
			tarifa.setTarifaBase(teclado.nextDouble());
			break;
			
			
		case 5:
			System.out.println("Digite para qual ira alterar-->\n1-estudante \n2-normal \n3-professor");
			tarifa.setTipoTarifa(teclado.nextInt());
			break;
			
		case 6:
			System.out.println("Saindo...");
			break;
			
			
		}
		
		teclado.close();
		
		
	}
	
	while(opcao != 6);
	

	}

}
