package cwi.reset.aula_loops;

import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {
		/*
		Fa�a um programa que pe�a uma nota, entre zero e dez. Caso o valor informado seja inv�lido, ou seja, n�o esteja entre zero e dez, mostre uma mensagem informando o problema, mas mantenha o programa em execu��o pedindo novamente a nota at� que o usu�rio informe um valor v�lido. Quando o usu�rio informar uma nota v�lida, imprima o valor da nota.
Fa�a um programa que leia dois n�meros e imprima todos os valores presentes no intervalo entre eles, um abaixo do outro. Caso o segundo n�mero seja menor ou igual ao primeiro, solicite um novo n�mero at� que o segundo n�mero seja maior que o primeiro.
Fa�a um programa que leia 5 n�meros e informe o maior n�mero.
Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer n�mero inteiro entre 1 a 10. O usu�rio deve informar de qual n�mero ele deseja ver a tabuada. A sa�da deve ser conforme o exemplo abaixo:
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
			System.out.println("O maior n�mero � :" + numero1);
		}else if (numero2 > numero3 && numero2 > numero4 && numero2 > numero5) {
			System.out.println("O maior n�mero � :" + numero2);
		}else if (numero3 > numero4 && numero3 > numero5) {
			System.out.println("O maior n�mero � :" + numero3);
		}else if (numero4 > numero5) {
			System.out.println("O maior n�mero � :" + numero4);
		}else {
			System.out.println("O maior n�mero � :" + numero5);
		}
		*/
		
		/* Exercicio Tabuada
		System.out.println("Digite um numero de 1 a 10");
		int numero = scan.nextInt();
		
		while (numero < 0 || numero >10) {
			System.out.println("N�mero invalido, digite novamente");
			numero = scan.nextInt();
		}
		
		for (int i=1; i<=10 ; i++) {
			int resultado = numero * i;
			System.out.println(numero + " * " + i +" = " + resultado);
		}
		*/
		
	}

}
