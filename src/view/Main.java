package view;

import java.util.Random;


import controller.ThreadMatriz;

public class Main {

	public static void main(String[] args) {
		Random gerador = new Random();
		int matriz[][] = new int[3][5];
		for (int i = 0; i<3; i++) {
			for (int j = 0; j<5; j++) {
				matriz[i][j] = gerador.nextInt(10) + 1;
			}
		}
		Thread tMatriz1 = new ThreadMatriz(0, matriz);
		tMatriz1.start();
		
		Thread tMatriz2 = new ThreadMatriz(1, matriz);
		tMatriz2.start();
		
		Thread tMatriz3 = new ThreadMatriz(2, matriz);
		tMatriz3.start();
	}

}
