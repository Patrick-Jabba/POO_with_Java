package br.com.residencia;
import java.util.*;

public class TestedoAndre {

	public static void main(String[] args) {
		int [] idade = new int[6];
		int resultado = 0;
		Scanner ler = new Scanner(System.in);
		for (int x=0; x<6;x++) {
			if(x!=5) {
				System.out.println("Qual a idade do colega "+(x+1));
			}else {
				System.out.println("Qual a sua idade?");
			}
			idade[x] = ler.nextInt();
			resultado += idade[x];
		}
		System.out.println("O tempo de vida dos meus colegas eh "+resultado);
		ler.close();
	}
	
}
