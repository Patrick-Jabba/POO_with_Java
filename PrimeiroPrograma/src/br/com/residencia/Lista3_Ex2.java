package br.com.residencia;

import java.util.Scanner;

public class Lista3_Ex2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		int cupons;
		
		System.out.println("Digite seus cupons :");
		cupons = scan.nextInt();
		cupons *= 3;
		System.out.println("De acordo com seus cupons, voce tem "+cupons+" pontos no programa de fidelidade!");
		scan.close();

	}

}
