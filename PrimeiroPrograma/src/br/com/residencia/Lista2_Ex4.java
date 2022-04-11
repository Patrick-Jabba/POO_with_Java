package br.com.residencia;
import java.util.*;
public class Lista2_Ex4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		String nome;
		String apelido;
		
		System.out.println("Qual o seu nome? ");
		nome = scan.next();
		System.out.println("Como voce gostaria de ser chamado? ");
		apelido = scan.next();
		System.out.println("Ola "+nome+" a partir de agora te chamaremos de "+apelido+"!");
		scan.close();
	}

}
