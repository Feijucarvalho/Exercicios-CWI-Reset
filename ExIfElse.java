package cwi.reset.aula_condicional;

import java.util.Scanner;

public class ExIfElse {

	public static void main(String[] args) {
		
		/* Fa�a um programa que tenha como entradas 4 notas e calcule a m�dia. Ao final o programa deve apresentar:
		A mensagem Aluno aprovado, se a m�dia alcan�ada for igual ou superior a sete;
				A mensagem Aluno reprovado, se a m�dia for inferior a sete;
				A mensagem Aluno aprovado com louvores, se a m�dia for igual a dez.
				Fa�a um Programa que leia um n�mero e exiba o dia correspondente da semana. (1=Domingo, 2=Segunda, etc.), caso seja informado um valor que n�o corresponda � um dia da semana, ent�o deve imprimir a mensagem Valor inv�lido!
		*/
		
		Scanner scan = new Scanner(System.in);
		
		/*
		System.out.println("Digite as suas 4 notas");
		double nota1 = scan.nextDouble();
		double nota2 = scan.nextDouble();
		double nota3 = scan.nextDouble();
		double nota4 = scan.nextDouble();
		
		double media = (nota1 + nota2 + nota3 + nota4)/4;
		
		if (media>=7 && media < 10) {
			System.out.println("Aluno aprovado");
		}else if (media <7) {
			System.out.println("Aluno Reprovado");
		}else if (media==10) {
			System.out.println("Aluno aprovado com meritos");
		}
		*/
		
		System.out.println("Digite um dia correspondente a um dia da semana 1..7");
		int diaSemana = scan.nextInt();
		
		switch (diaSemana) {
		case 1 : System.out.println("Domingo"); break;
		case 2 : System.out.println("Segunda"); break;
		case 3 : System.out.println("Terca"); break;
		case 4 : System.out.println("Quarta"); break;
		case 5 : System.out.println("Quinta"); break;
		case 6 : System.out.println("Sexta"); break;
		case 7 : System.out.println("Sabado"); break;
		default : System.out.println("Valor invalido");break;
		}
		
	}

}
