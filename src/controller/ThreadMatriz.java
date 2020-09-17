package controller;

public class ThreadMatriz extends Thread{
	private int valor, matriz[][];
	
	public ThreadMatriz(int valor, int matriz[][]) {
		this.valor = valor;
		this.matriz = matriz;
	}
	
	@Override
	public void run() {
		somaLinha(valor, matriz);
	}
	
	private void somaLinha(int valor, int matriz[][]) {
		if (valor == 0) {
			int a = 0;
			for (int i = 0; i < 5; i++) {
				a = matriz[valor][i] + a;
			}
			System.out.println("Linha 1: " + a);
		}else if (valor == 1) {
			int b = 0;
			for (int j = 0; j < 5; j++) {
				b = matriz[valor][j] + b;
			}
			System.out.println("Linha 2: " + b);
		}else if (valor == 2) {
			int c = 0;
			for (int k = 0; k < 5; k++) {
				c = matriz[valor][k] + c;
			}
			System.out.println("Linha 3: " + c);
		}
	}
}
