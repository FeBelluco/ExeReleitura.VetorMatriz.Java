package br.com.generation.AtvReleitura;

import java.util.Scanner;

public class Exerc�cioVetorMatriz01 {
		
	/*
	 * Fa�a um programa que crie um vetor por leitura com 5 valores de pontua��o de uma
atividade e o escreva em seguida. Encontre ap�s a maior pontua��o e a apresente.
	 */
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		double[] nota = new double[5];
		double maior = 0;
		
		System.out.println("Entre com as notas");
			for(int i = 0; i < 5; i++) {
			System.out.print((i+1) + "� Nota: ");
			nota[i] = entrada.nextDouble();
				if(maior < nota[i]) {
					maior = nota[i];
					}
				}
		System.out.print("A maior nota �: " + maior);
		entrada.close();
	}	
}