package br.com.residencia;

import java.util.*;

public class Lista1_Ex4 {

	public static void main(String[] args) {
		float Fahrenheit, celsius;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em Celsius: ");
		celsius = leia.nextFloat();
		Fahrenheit = ((celsius*9)/5)+32;
		System.out.println("Temperatura em Fahrenheit is:" + Fahrenheit);
		leia.close();
	}
}
