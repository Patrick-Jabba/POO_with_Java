//O laboratório fabricante de álcool em gel precisa saber se o 
//produto está atingindo a concentração ideal para desinfecção, 
//que é de 70%. Para a ajudar o laboratório, crie um programa 
//onde será preenchida a capacidade da garrafa em mililitros, 
//e o resultado serão os volumes de álcool e de gel que precisam ser 
//misturados para preenchimento do vasilhame.


package br.com.residencia;
import java.util.*;

public class Lista3_Ex4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		float capGarrafa;
		float volAlcool = 0.7f;
		float volGel = 0.3f;
		
		
		System.out.println("Informe a capacidade da garrafa em mililitros: ");
		capGarrafa = scan.nextFloat();
		
		volAlcool = capGarrafa * volAlcool;
		volGel = capGarrafa * volGel;
		
		System.out.println("O volume de alcool a serem aplicado na capacidade da garrafa informada eh de : "+volAlcool+"ml");
		System.out.println("O volume de gel a serem aplicado na capacidade da garrafa informada eh de : "+volGel+"ml");		
		scan.close();
		
		

	}

}
