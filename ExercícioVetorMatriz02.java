package br.com.generation.AtvReleitura;

import java.util.Random;

public class ExercícioVetorMatriz02 {
	
	/*
	 * Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa
	que gere um vetor com os lançamentos, escreva esse vetor. A seguir determine e
	imprima a média aritmética dos lançamentos, contabilize e apresente também
	quantas foram as ocorrências da maior pontuação.
	 */
	
	public static void main(String[] args) throws InterruptedException {
		
		Random randomGeneration = new Random();
		int[] dice = new int[10];
		int maior=0, quantponto=0, result;//soma=0,
		double media= 0.0, soma = 0.0;
		
		System.out.println("======CASINO GENERATION======");
		System.out.println();
		System.out.println("É HORA DOS DADOS BABY!!!");
		for(int i = 0; i < 10; i++) {
			result = randomGeneration.nextInt(1, 6);
			System.out.println((i+1) + "º Arremesso: " + result);
			Thread.sleep(500);
			dice[i] = result;
			soma = soma + result;
			media = soma / 10;
			if(maior < result) {
				maior = result;	
			}
		}
		for(int i = 0; i < 10; i++) {
			if(dice[i] == maior) {
				quantponto++;
			}
		}
		System.out.println();
		System.out.println("======RESULTADOS======");
		System.out.print("A soma dos resultados é: " + soma);
		System.out.println();
		System.out.print("O maior valor é: " + maior);
		System.out.println();
		System.out.print("A quantidade da maior pontuação é: " + quantponto);
		System.out.println();
		System.out.print("A média dos valores são: " + media);
	}
}
