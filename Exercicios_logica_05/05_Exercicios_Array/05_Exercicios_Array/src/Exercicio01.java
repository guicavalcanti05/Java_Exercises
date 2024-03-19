import java.util.Arrays;
import java.util.Random;

public class Exercicio01 {
	public static void main(String[] args) {
		
		int[] x = new int[10];
		
		lerDados(x);
		Arrays.sort(x);
		imprimir(x);
		int[] novo = removerDuplicacao(x);
		imprimir(novo);

	}

	private static int[] removerDuplicacao(int[] x) {
		int tamanho = calcularTamanho(x);
		int[] novoVetor = new int[tamanho];
		int k = 0;
		boolean repetido;
		for(int i = 0; i < x.length; i++) {
			repetido = false;
			for(int j = 0; j < i; j++) {
				if(x[i] == x[j]) {
					repetido = true;
					break;
				}
			}
			if(!repetido) {
				novoVetor[k] = x[i];
				k++;
			}
		}
		return novoVetor;
	}

	private static int calcularTamanho(int[] x) {
		int tamanho = 0;
		boolean repetido;
		
		for (int i = 0; i < x.length; i++) {
			repetido = false;
			for(int j = 0; j < i; j++) {
				if(x[i] == x[j]) {
					repetido = true;
					break;
				}
			}
			if(!repetido) {
				tamanho++;
			}
		}
		return tamanho;
	}

	private static void imprimir(int[] x) {
		for(int i : x) { // para cada valor inteiro no vetor x
			System.out.print(i + "  ");
		}
		System.out.println();
		
	}

	private static void lerDados(int[] x) {
		Random rd = new Random();
		for (int i = 0; i < x.length; i++) {
			x[i] = rd.nextInt(10, 19);
		}
		
	}
}
