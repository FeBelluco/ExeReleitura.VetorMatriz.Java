package br.com.generation.AtvReleitura;

import java.util.Random;

public class Exerc�cioVetorMatriz02 {
	
	/*
	 * Um dado � lan�ado 10 vezes e o valor correspondente � anotado. Fa�a um programa
	que gere um vetor com os lan�amentos, escreva esse vetor. A seguir determine e
	imprima a m�dia aritm�tica dos lan�amentos, contabilize e apresente tamb�m
	quantas foram as ocorr�ncias da maior pontua��o.
	 */
	
	public static void main(String[] args) throws InterruptedException {
		
		Random randomGeneration = new Random();
		int[] dice = new int[10];
		int maior=0, quantponto=0, result;//soma=0,
		double media= 0.0, soma = 0.0;
		
		System.out.println("======CASINO GENERATION======");
		System.out.println();
		System.out.println("� HORA DOS DADOS BABY!!!");
		for(int i = 0; i < 10; i++) {
			result = randomGeneration.nextInt(1, 6);
			System.out.println((i+1) + "� Arremesso: " + result);
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
		System.out.print("A soma dos resultados �: " + soma);
		System.out.println();
		System.out.print("O maior valor �: " + maior);
		System.out.println();
		System.out.print("A quantidade da maior pontua��o �: " + quantponto);
		System.out.println();
		System.out.print("A m�dia dos valores s�o: " + media);
	}
}
