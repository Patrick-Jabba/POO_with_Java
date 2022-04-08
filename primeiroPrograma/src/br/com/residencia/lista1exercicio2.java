package br.com.residencia;

import java.util.*;
//import java.io.*;

public class lista1exercicio2 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		//List<Integer> list = new ArrayList<>();
		int totalIdade = 0;
		
		
		
		for(int i = 0; i < 7; i++) {
			System.out.println("Qual eh a idade do colega?");
			int idade = leia.nextInt();
			totalIdade += idade;
						
		}
		System.out.println("O tempo de vida dos meus colegas eh:" + totalIdade);
		leia.close();
	}
	
}
