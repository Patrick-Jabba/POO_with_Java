package br.com.residencia;
import java.util.*;
public class Lista2_Ex3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		int qtdProduto;
		
		System.out.println("Digite o numero de produtos que ira comprar: ");
		qtdProduto = scan.nextInt();
		
		System.out.println("Parabens por comprar "+qtdProduto+" produtos!");
		scan.close();

	}

}
