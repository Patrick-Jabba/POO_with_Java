package br.com.residencia;
import java.util.*;
public class Lista2_Ex2 {

	public static void main(String[] args) {
	Scanner scan = new Scanner (System.in);
	
	final int anoFundacao = 1989;
	int anoAtual;
	
	System.out.println("===Sobre a empresa Alterdata Software===");
	System.out.println("Para saber a idade da empresa Alterdata digite o ano atual: ");
	anoAtual = scan.nextInt();
	
	int idade;
	idade = anoAtual - anoFundacao;
	
	//Saída
	System.out.println("A alterdata tem "+idade+" anos." );
	scan.close();
	}

}
