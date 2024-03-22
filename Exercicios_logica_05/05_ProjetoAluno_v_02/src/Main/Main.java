package Main;
import java.util.Scanner;
import aluno.Aluno;
import disciplina.Disciplina;

public class Main {

	public static void main(String[] args) {
	
		Scanner teclado = new Scanner(System.in);
		
		Aluno [] aluno=new Aluno[3];
		Disciplina []disciplina;
		
		//aluno1
		disciplina = new Disciplina[2];
		disciplina [0] = new Disciplina("POO", 2, 8, 2);
		disciplina [1] = new Disciplina("Estatistica", 10, 7, 5);
		aluno [0] = new Aluno("Guilherme", disciplina);
		
		//aluno2
		disciplina = new Disciplina[2];
		disciplina [0] = new Disciplina("Sensores", 5, 9, 4);
		disciplina [1] = new Disciplina("RDP", 0, 9, 7);
		aluno [1] = new Aluno("Wesley", disciplina);
		
		//aluno3
		disciplina = new Disciplina[2];
		disciplina [0] = new Disciplina("Codigos", 2, 4, 9);
		disciplina [1] = new Disciplina("Web", 3, 8, 6);
		aluno [2] = new Aluno("Lucas", disciplina);
		
		//GetNome do aluno no I e getNome disciplina no J
		for (int i=0; i<aluno.length;i++) {
			System.out.println(aluno[i].getNome());
			Disciplina[] aux = aluno[i].getDisciplina();
			
			for(int j=0;j<aux.length;j++) {
				System.out.println(aluno[i].getDisciplina()[j].getNome());
				System.out.println(aux[j].calcularMedia());
				
				System.out.println("Aprovado:"+aux[j].isAprovado());
				
			}
			
			System.out.println();
		}
		
	}

}
