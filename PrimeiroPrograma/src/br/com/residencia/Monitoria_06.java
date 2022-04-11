package br.com.residencia;
import java.util.*;

public class Monitoria_06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		int x = 0;
		
		
		System.out.println("Digite um valor inteiro: ");
		x = scan.nextInt();
		for(int i = 0; i <= x; i++) {
			if(i % 2 != 0) {
				System.out.println("Os numeros impares de 1 a "+x+": "+ i);
				scan.close();
			}
		}
	}
}
