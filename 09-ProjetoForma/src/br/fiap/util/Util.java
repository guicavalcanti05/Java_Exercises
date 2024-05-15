package br.fiap.util;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import br.fiap.forma.Cilindro;
import br.fiap.forma.Circulo;
import br.fiap.forma.Forma;
import br.fiap.forma.Volume;

public class Util {
	
	 private List<Forma> lista = new ArrayList<>();
	
	public void menu() {
		int opcao;		
		
		while(true) {
			try {
				opcao = parseInt(showInputDialog(gerarMenu()));
				if(opcao == 4) {
					break;
				}
				
				switch(opcao) {
					case 1:
						gerarCirculo();
						break;
					case 2:
						gerarCilindro();
						break;
					case 3:
						listarFigura();
				}				
			}
			catch(NumberFormatException e) {
				showMessageDialog(null, "Você deve digitar um número");
		}
		
		}
	
	}

	private void listarFigura() {
		DecimalFormat mascara = new DecimalFormat("#.##");
		String aux = " ";
		for (Forma forma : lista) {
			aux += forma;
			aux += "Area = "+mascara.format(forma.calcularArea()) + "\n";
			if (forma instanceof Volume) {
				Volume volume = (Volume) forma;
				aux += "volume = "+ mascara.format(volume.calcularVolume()) + "\n";
			}
			aux += "\n";
		}
		
		showMessageDialog(null, aux);
		
		
	}

	private void gerarCilindro() {
		int cx = parseInt(showInputDialog("Coordenada x"));
		int cy = parseInt(showInputDialog("Coordenada y"));
		double raio = parseDouble(showInputDialog("raio"));
		double altura = parseDouble(showInputDialog("altura"));
		lista.add(new Cilindro(cx, cy,raio,altura));
	}

	private void gerarCirculo() {
		int cx = parseInt(showInputDialog("Coordenada x"));
		int cy = parseInt(showInputDialog("Coordenada y"));
		double raio = parseDouble(showInputDialog("raio"));
		lista.add(new Circulo(cx, cy,raio));
		
		
	}

	private Object gerarMenu() {
		String aux = "Escolha uma opção\n";
		aux += "1. Gerar círculo\n";
		aux += "2. Gerar cilindro\n";
		aux += "3. Listar figuras\n";		
		aux += "4. Finalizar\n";
		return aux;
	}
	
}
