package br.com.residencia;
import java.util.*;


public class Monitoria_03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a;
		
		System.out.println("Digite um numero inteiro: ");
		a = scan.nextInt();
		
		if (a > 0) {
			System.out.println("Este numero eh positivo ");
		} else System.out.println("Este numero eh negativo");
		scan.close();
	}

}
