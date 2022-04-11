package br.com.residencia;

import java.util.*;

public class Monitoria_01 {
	public static void main(String[]args) {;
	
		Scanner scan = new Scanner(System.in);
		
		int b = 0;
		int a = 0;
		char resposta;
		
		//Entradas
		do {
			System.out.println("Digite um numero inteiro: ");
			a = scan.nextInt();
			System.out.println("Digite um outro numero inteiro: ");
			b = scan.nextInt();

		//Processamento
			int soma = a + b;
		
		// Saídas	
			System.out.println("A soma dos valores declarados sao: " + soma);
			
		// 	
			System.out.println("Gostaria de continuar inserindo valores para somar? "
					+ "Digite [S] para sim ou [N] para não: ");
			resposta = scan.next().charAt(0);
		} while  (resposta == 's' || resposta == 'S');
			System.out.println("Obrigado por usar nosso programa!");
			scan.close();
	}	
}
