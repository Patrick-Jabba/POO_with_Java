package br.com.residencia;

import java.util.Scanner;

public class Lista2_Ex5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);

		final int x = 131;
		final int z = 33;
		int y;
		
		y = x - z;
		
		System.out.println("Teresopolis tem "+x+" anos.\nDesses, " +y+" foram antes de mim."
				+"\nMas os ultimos "+z+" anos contaram comigo!");
		scan.close();
		
	}

}
