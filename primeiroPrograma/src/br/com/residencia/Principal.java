package br.com.residencia;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		System.out.print("Digite seu nome: ");
//		String nome = scan.next();
//		System.out.print("Digite o seu sobrenome: ");
//		String sobrenome = scan.next();
//		System.out.println("Seja bem vindo " + nome + " " + sobrenome + "!");
//		
		String nome, sobrenome;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o seu nome: ");
		nome = leia.next();
		System.out.println("Digite o seu sobrenome: ");
		sobrenome = leia.next();		
		for(int i = 0; i <= 20; i++) { 
			System.out.println("\n");
		}
		System.out.println("Meu nome eh " + nome + " " + sobrenome + ".");
		leia.close();
	}
}
