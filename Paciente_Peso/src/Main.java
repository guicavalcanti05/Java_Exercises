import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
	Scanner teclado = new Scanner(System.in);
	Paciente p=new Paciente();
	
	
	System.out.print("Digite o nome do paciente ->");
	p.nome = teclado.next();
	
	System.out.print("Digite a idade do paciente ->");
	p.idade = teclado.nextInt();
	
	System.out.println(p.getDados());
	
	
	teclado.close();

	}

}
