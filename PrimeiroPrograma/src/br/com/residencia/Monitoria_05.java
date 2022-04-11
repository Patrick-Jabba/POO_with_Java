package br.com.residencia;
import java.util.*;
public class Monitoria_05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		int senha = 2002;
		
		
		System.out.println("Digite sua senha: ");
		senha = scan.nextInt();
		
		while (senha != 2002) {
			System.out.println("Senha invalida!");
			System.out.println("Digite a senha correta: ");
			senha = scan.nextInt();
			
		}
		System.out.println("Acesso Permitido!");
		scan.close();
		
	}

}
