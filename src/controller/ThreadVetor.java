package controller;

public class ThreadVetor extends Thread {
	
		private int valor;
		private int vetor[];

	public ThreadVetor(int valor1, int vetor1[]) {
		 valor = valor1;
		 vetor = vetor1;
	}
	
	// Compara tempos de percorrer o vetor com for e foreach
	public void run() {
		Calculavetor();
	}
	
	public void Calculavetor() {
		if( valor % 2 == 0) {
			double TempoIncial = System.nanoTime();
			for (int i = 0 ; i < vetor.length; i++) {
				
			}
			double TempoFinal = System.nanoTime();
			double Resultado = TempoFinal - TempoIncial; 
			Resultado = Resultado / Math.pow(10, 9);
			System.out.println("Vetor com FOR: " + Resultado + ".s");
		}else {
			double TempoIncial = System.nanoTime();
			for (int vetor : vetor) {
				
			}
			double TempoFinal = System.nanoTime();
			double Resultado = TempoFinal - TempoIncial;
			Resultado = Resultado / Math.pow(10, 9);
			System.out.println("Vetor com FOREACH: " + Resultado + ".s");
		}	
		
	}
}
