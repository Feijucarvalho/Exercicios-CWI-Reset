package cwi.reset.aula_arrays;

import java.util.Scanner;

public class ExercicioArrays {

	public static void main(String[] args) {
		
		/*
		1. Crie um programa que receba 5 valores e armazene em um vetor. 
		Crie um segundo vetor de mesmo tipo e tamanho, contendo os valores 
		do primeiro vetor multiplicados por 2. 
		Ou seja: segundoVetor[i] = primeiroVetor[i] * 2. 
		No final, imprima o conteúdo dos dois vetores.

		2. Crie um programa que leia 10 valores inteiros correspondentes 
		as idades de um grupo de pessoas e armazene em um vetor. 
		Escreva uma lógica para determinar a quantidade de pessoas que 
		possuem idade igual ou superior a 18 anos. Ao final, imprima o 
		vetor de idades e a quantidade de pessoas maiores de idade.

		 */

		Scanner scan = new Scanner(System.in);
		
		/* Exercicio 1
		int [] primeiroVetor = new int[5];
		
		int [] segundoVetor = new int[5];
		
		for (int i=0 ; i < primeiroVetor.length ; i++) {
			System.out.println("digite o valores para " + i);
			primeiroVetor[i] = scan.nextInt();
		}
		
		for (int i=0 ; i < primeiroVetor.length ; i++) {
			segundoVetor[i] = (primeiroVetor [i]*2);
			
		}
		
		System.out.println("Os dados do primeiro Vetor sao: ");
		for (int i=0 ; i < primeiroVetor.length ; i++) {
			System.out.print(" ["+i+"]"+ primeiroVetor [i]);
		}
		
		System.out.println();
		System.out.println();
		
		System.out.println("Os dados do segundo Vetor sao: ");
		for (int i=0 ; i < primeiroVetor.length ; i++) {
			System.out.print(" ["+i+"]"+ segundoVetor [i]);
		
		}*/
		
		int[] idades = new int[10];
		
		System.out.println("Digite as idades das 10 pessoas do grupo: ");
		for (int i=0 ; i < idades.length ; i++) {
		idades[i] = scan.nextInt();
		}
		
		int cont = 0;
		for (int i=0 ; i < idades.length ; i++) {
			if (idades[i]>=18) {
				cont = cont+1;
			}
		}
		System.out.println();
		
		System.out.println("O vetor idades ficou com os seguintes dados: ");
		
		for (int i=0 ; i < idades.length ; i++) {
			System.out.print(" ["+i+"]"+idades[i]);
		}
		
		System.out.println();
		
		System.out.println(cont + " Pessoas sao maiores de idade.");
		
	}

}
