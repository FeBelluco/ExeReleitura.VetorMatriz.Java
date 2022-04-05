package br.com.generation.AtvReleitura;

import java.util.Scanner;

public class ExercícioVetorMatriz01 {
		
	/*
	 * Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma
atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente.
	 */
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		double[] nota = new double[5];
		double maior = 0;
		
		System.out.println("Entre com as notas");
			for(int i = 0; i < 5; i++) {
			System.out.print((i+1) + "º Nota: ");
			nota[i] = entrada.nextDouble();
				if(maior < nota[i]) {
					maior = nota[i];
					}
				}
		System.out.print("A maior nota é: " + maior);
		entrada.close();
	}	
}