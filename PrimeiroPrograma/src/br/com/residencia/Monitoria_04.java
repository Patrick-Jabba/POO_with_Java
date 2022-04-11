package br.com.residencia;

import java.util.*;

public class Monitoria_04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		int a;
		
		System.out.println("Digite um numero inteiro: ");
		a = scan.nextInt();
		
		if (a%2 == 0) {
			System.out.println("Este numero eh par!");
		} else 
			System.out.println("Este numero eh impar!");
		scan.close();

	}

}
