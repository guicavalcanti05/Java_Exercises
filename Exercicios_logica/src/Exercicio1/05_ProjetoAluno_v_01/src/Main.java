import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);

	
	int nAlunos;
	String nome;
	double nota1, nota2, nota3;
	
	
	System.out.print("Digite a quantidade de alunos->");
	nAlunos=teclado.nextInt();
	
	Aluno alunos[]=new Aluno[nAlunos];
	
	for (int i=0;i<nAlunos;i++) {
		teclado.nextLine();
		System.out.print("Digite o nome do aluno "+(i+1)+"-->");
		nome=teclado.nextLine();
		
		System.out.print("Digite a primeira nota-->");
		nota1=teclado.nextDouble();
		
		System.out.print("Digite a segunda nota -->");
		nota2=teclado.nextDouble();
		
		System.out.print("Digite terceira nota-->");
		nota3=teclado.nextDouble();
		
		
		
		alunos[i] = new Aluno(nome, nota3, nota3, nota3);
		
		System.out.println();
	}
	
	
	imprimir(alunos);
	imprimirListagem(alunos);

	teclado.close();
	
	}
	
	private static void imprimir(Aluno [] alunos) {
		int totalAprovados = 0;
		for(int i = 0; i<alunos.length;i++) {
			if(alunos[i].isAprovado()) {
				totalAprovados++;
			}
		}
		
		System.out.println("total de aprovados-->"+totalAprovados);
		System.out.println("total de reprovados-->"+(alunos.length-totalAprovados));
	}
	
	private static void imprimirListagem(Aluno [] alunos){
		Aluno aux;
		
		for (int i = 0; i < alunos.length-1; i++) {
			if(alunos[i].calcularMedia()>alunos[i+1].calcularMedia()) {
				aux=alunos[i];
				alunos[i]=alunos[i+1];
				alunos[i+1]=aux;
			}
		}
		
		for(Aluno a: alunos) {
			System.out.println(a.nome);
		}
		
	}

}
