package br.fiap.forma;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		
		ArrayList<Forma> lista = new ArrayList<>();
		lista.add(new Circulo(1, 1, 2));
		lista.add(new Cilindro(2, 1, 3, 4));
		lista.add(new Circulo(2, 2, 2));
		
		for (Forma forma : lista) {
			System.out.println(forma);
			System.out.println("área = " + forma.calcularArea());
			if(forma instanceof Volume) {
				Volume aux = (Volume) forma;
				System.out.println("volume = " + aux.calcularVolume());
			}
			System.out.println();
		}

	}
}
