
public class Paciente {
	
	String nome;
	int idade;


public int calcFreqMax() {
	
	int freq;
	freq = 220 - idade;
	return freq;
}

public double [] calcFreqAlvo() {
	double [] freqAlvo = new double[2];
	
	int freqMax=calcFreqMax();
	freqAlvo [0] = freqMax / 2;
	
	freqAlvo [1] = freqMax * 0.85;
	
	return freqAlvo;
	
}

public String getDados() {
	
	double [] freqAlvo = calcFreqAlvo ();
	String aux = "";
	aux +="Nome : " + nome +"\n";
	aux +="idade : " + idade +"\n";
	aux +="frequencia Maxima : " + calcFreqMax() +"\n";
	aux +="Frequencia Alvo Minima : " + String.format("%.2f", freqAlvo[0]) +"\n";
	aux +="Frequencia Alvo Maxima : " + String.format("%.2f", freqAlvo[1]) +"\n";

	
	return aux;
		
	
}


}


