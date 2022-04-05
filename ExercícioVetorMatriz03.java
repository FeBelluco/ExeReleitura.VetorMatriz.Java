package br.com.generation.AtvReleitura;

import java.util.Scanner;

public class ExercícioVetorMatriz03 {
	/*3. Escreve um programa que l� duas matrizes N1 (4,6) e N2(4,6) e cria:
		a) Uma matriz M1 cujos elementos ser�o as somas dos elementos de mesma posi��o
	das matrizes N1 e N2;
		b) Uma matriz M2 cujos elementos ser�o as diferen�as dos elementos de mesma
		posi��o das matrizes N1 e N2.
	*/
		public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		int[][] N1 = new int[4][6];
		int[][] N2 = new int[4][6];
		int[][] M1 = new int[4][6];
		int[][] M2 = new int[4][6];

		System.out.println("Digite os valores da matriz N1 ");
		for(int l = 0;l<N1.length;l++) {
			for (int c = 0;c<N1[l].length;c++) {

				System.out.printf("Digite os valores na posição %d %d: " , l+1,c+1); /*posição na matriz*/
				N1[l][c] = entrada.nextInt();
			}
			System.out.println();
		}
		System.out.println("Digite os valores da matriz N2 ");
		for(int l = 0;l<N2.length;l++) {
			for (int c = 0;c<N2[l].length;c++) {
				
				System.out.printf("Digite os valores na posição %d %d: " , l+1,c+1); /*posição na matriz*/
				N2[l][c] = entrada.nextInt();
				
			}
			System.out.println();
		}
		entrada.close();
		System.out.print("Matriz M1: \n");
		
		for (int l = 0;l<M1.length;l++) {
			for (int c = 0;c<M1[l].length;c++) {
				M1[l][c] = N1[l][c] + N2[l][c];
			
				System.out.print( M1[l][c] + "|");
			}
		System.out.println();
		}
		
		System.out.print("\nMatriz M2: \n");
		for (int l = 0;l<M2.length;l++) {
			for (int c = 0;c<M2[l].length;c++) {
				M2[l][c] = N1[l][c] - N2[l][c];
				System.out.print(M2[l][c] + "|");
			}
		System.out.println();
		}
	
	}

}