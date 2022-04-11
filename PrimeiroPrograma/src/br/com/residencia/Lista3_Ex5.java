//O programa “mini departamento pessoal” lê a quantidade de horas trabalhadas por um funcionário em um mês, 
//o valor que ele recebe por hora e o percentual de desconto para o INSS, e calcula:
//O salário bruto (horas trabalhadas * valor hora)
//O valor do desconto para o INSS
//O salário líquido (adicionais menos descontos).
//Após os cálculos, será impresso o contra cheque (Salário bruto, valor do desconto do INSS, e o salário líquido do funcionário).

package br.com.residencia;

import java.util.Scanner;

public class Lista3_Ex5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		int horasTrabalhadas;
		float valorHoras;
		float descontoInss = 0.0f;
		float salLiquido; //adicionais menos descontos
		float salBruto; // horas trabalhadas * valor hora
		float descontoRealInss;
		
		
		System.out.println("Quantidade de horas trabalhadas no mes: ");
		horasTrabalhadas = scan.nextInt();
		System.out.println("Valor recebido por hora trabalhada: ");
		valorHoras = scan.nextFloat();
		
		salBruto = horasTrabalhadas*valorHoras;
				
		if (salBruto <= 2427.35f) {
				descontoInss = 0.09f;
		} else if (salBruto > 2427.35f || salBruto <= 3641.03f) {
				descontoInss = 0.12f;
	    }

		if (salBruto > 3641.03f) {
				descontoInss = 0.14f;
		}
		
		descontoRealInss = salBruto * descontoInss;
		salLiquido = salBruto - descontoRealInss;
		
		System.out.println("===Contra-Cheque Mini DP====");
		System.out.println("Salario bruto: "+salBruto);
		System.out.println("Desconto do INSS: "+ descontoRealInss);
		System.out.println("Salario liquido: R$"+ salLiquido);
		scan.close();
	}
}
