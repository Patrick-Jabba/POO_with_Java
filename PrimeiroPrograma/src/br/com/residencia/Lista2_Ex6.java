package br.com.residencia;

import java.util.Scanner;

public class Lista2_Ex6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		final int multiDeMil = 4040;
		final int somaPrimos = 17;
		
		int total;
		
		System.out.println("===Sistema Mais que mil===");
		System.out.println("A soma dos 04 primeiros multiplos de 04 que sao 1004, 1008, 1012 e 1016 acima de mil eh: "+multiDeMil);
		System.out.println("A soma dos 04 primeiros numeros primos a partir de 01 que sao 2,3,5 e 7 eh"+somaPrimos);
		total = multiDeMil - somaPrimos;
		System.out.println("Realizaremos a substracao desses dois valores que eh: "+total);
		scan.close();

	}

}
