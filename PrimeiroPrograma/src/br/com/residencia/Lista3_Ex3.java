package br.com.residencia;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Lista3_Ex3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		float precoKg;
		float precoGrama;
		float pesoPrato;
		final float tara = .465f;
		float total;
		
		System.out.println("Digite o preco do Kg: ");
		precoKg = scan.nextFloat();
		System.out.println("Informe o peso do prato em gramas: ");
		pesoPrato = scan.nextFloat();
		
		//Processamentos:
		precoGrama = precoKg/10;
		pesoPrato = pesoPrato - tara; 
		total = precoGrama*(pesoPrato/100);
		DecimalFormat df = new DecimalFormat();
		df.setMaximumFractionDigits(2);

		//Etiqueta: (Saída)
		System.out.println("===RESTAURANTE COME FACIL SUA AZIA É A NOSSA ALEGRIA===");
		System.out.println("Tara do nosso prato: "+tara);
		System.out.println("Preco de 100 gramas: R$"+precoGrama);
		System.out.println("O peso consumido por voce foi de: "+pesoPrato+" gramas.");
		System.out.println("O valor total a ser pago eh: R$"+df.format(total));
		scan.close();
		
	}

}
