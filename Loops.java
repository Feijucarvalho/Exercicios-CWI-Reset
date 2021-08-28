package cwi.reset.aula_loops;

import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {
		/*
		Faça um programa que peça uma nota, entre zero e dez. Caso o valor informado seja inválido, ou seja, não esteja entre zero e dez, mostre uma mensagem informando o problema, mas mantenha o programa em execução pedindo novamente a nota até que o usuário informe um valor válido. Quando o usuário informar uma nota válida, imprima o valor da nota.
Faça um programa que leia dois números e imprima todos os valores presentes no intervalo entre eles, um abaixo do outro. Caso o segundo número seja menor ou igual ao primeiro, solicite um novo número até que o segundo número seja maior que o primeiro.
Faça um programa que leia 5 números e informe o maior número.
Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10. O usuário deve informar de qual número ele deseja ver a tabuada. A saída deve ser conforme o exemplo abaixo:
		 */

		Scanner scan = new Scanner(System.in);
		
		/* Exercicio 1
		System.out.println("Digite a sua nota: ");
		int nota = scan.nextInt();
		while (nota < 0 || nota >10) {
			System.out.println("Nota invalida, digite novamente: ");	
			nota = scan.nextInt();
		}
		System.out.println("Sua nota foi: "+ nota);
		*/
		
		/* Exercicio 2
		System.out.println("Digite dois numeros onde o primeiro deve ser menor que o segundo:");
		int numero1 = scan.nextInt();
		int numero2 = scan.nextInt();
		numero2 = numero2-1;
		
		while (numero1 >= numero2) {
			System.out.println("Numeros invalidos digite novamente");
			numero1 = scan.nextInt();
			numero2 = scan.nextInt();
			numero2 = numero2-1;
		}
		for (int i=0;numero1<numero2;i++) {
			numero1++;
			System.out.println(numero1);
			
			}  
			*/
		
		/* Exercicio 3
		System.out.println("digite 5 numeros: ");
		int numero1 = scan.nextInt();
		int numero2 = scan.nextInt();
		int numero3 = scan.nextInt();
		int numero4 = scan.nextInt();
		int numero5 = scan.nextInt();
		
		if (numero1 > numero2 && numero1 > numero3 && numero1 > numero4 && numero1>numero5) {
			System.out.println("O maior número é :" + numero1);
		}else if (numero2 > numero3 && numero2 > numero4 && numero2 > numero5) {
			System.out.println("O maior número é :" + numero2);
		}else if (numero3 > numero4 && numero3 > numero5) {
			System.out.println("O maior número é :" + numero3);
		}else if (numero4 > numero5) {
			System.out.println("O maior número é :" + numero4);
		}else {
			System.out.println("O maior número é :" + numero5);
		}
		*/
		
		/* Exercicio Tabuada
		System.out.println("Digite um numero de 1 a 10");
		int numero = scan.nextInt();
		
		while (numero < 0 || numero >10) {
			System.out.println("Número invalido, digite novamente");
			numero = scan.nextInt();
		}
		
		for (int i=1; i<=10 ; i++) {
			int resultado = numero * i;
			System.out.println(numero + " * " + i +" = " + resultado);
		}
		*/
		
	}

}
