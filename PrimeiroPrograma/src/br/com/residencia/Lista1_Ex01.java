package br.com.residencia;

import java.util.Scanner;

public class Lista1_Ex01 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		String nome;
		String sobrenome;
		
		System.out.println("Digite o seu nome: ");
		nome = leia.next();
		System.out.println("Digite o seu sobrenome: ");
		sobrenome = leia.next();		
		for(int i = 0; i <= 20; i++) { 
			System.out.println("\n");
		}
		System.out.println("Seja bem vindo " + nome + " " + sobrenome + " seja bem vindo "
				+ "ao universo da programacao.");
		leia.close();
	}
}