package aula19_Arrays;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		/*
		 * Criar um vetor A com 10 elementos inteiros. Implementar um programa que
		 * defina e escreva a quantidade de elementos armazenados neste vetor que são
		 * pares
		 */

		Scanner ler = new Scanner(System.in);
		int[] vetorA = new int[10];

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com o valor da posicao = " + i);
			vetorA[i] = ler.nextInt();
		}
		int cont = 0;
		for (int i = 0; i < vetorA.length; i++) {
			if (vetorA[i] % 2 == 0) {
				cont++;
			}
		}
		System.out.print("VetorA = ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();
		System.out.println("A quantidade de numeros pares = " + cont);
	}

}
