package br.com.residencia;


import java.text.DecimalFormat;
import java.util.*;

public class Monitoria_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		final float pi = 3.14159f;
		float raioCirc;
		
		System.out.println("Insira o valor do raio do circulo: ");
		raioCirc = scan.nextFloat();
		
		float areaCirc = (raioCirc * raioCirc) * pi; 
		DecimalFormat df = new DecimalFormat();
		df.setMaximumFractionDigits(4);
		System.out.println("A area deste circulo com base no raio informado eh de: " + df.format(areaCirc));
		scan.close();
	}
}
