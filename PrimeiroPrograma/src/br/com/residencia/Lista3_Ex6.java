/*O “mini DP” aumentou seus cálculos. 
Agora, considera a jornada de trabalho semanal de um funcionário, que é de 40 horas. 
O funcionário que trabalhar mais de 40 horas receberá hora extra, cujo cálculo é o valor da hora regular 
com um acréscimo de 50%. 
Considerando que o mês possui 4 semanas exatas, e que a entrada de horas será um valor maior que a jornada normal.
Salário base (valor da hora * horas normais)
Valor de horas extras
Valor do desconto para o INSS
Salário líquido (Salário base + horas extras – desconto INSS)
Imprimir o contracheque do funcionário.
	*/


package br.com.residencia;

import java.util.Scanner;

public class Lista3_Ex6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		int horasTrabalhadas = 0;
		int totalHorasMes = 0;
		int totalHorasExtras = 0;
		float valorHoraExtra;
		float valorHoras;
		float descontoInss = 0.0f;
		float salLiquido; //adicionais menos descontos
		float salBruto; // horas trabalhadas * valor hora
		float descontoRealInss;
		float pgtoHoraExtra;
		
		
		for(int i = 1; i <= 4; i++) {
			System.out.println("Quantidade de horas trabalhadas na semana "+(i)+": ");
			horasTrabalhadas = scan.nextInt();
			totalHorasMes += horasTrabalhadas;
		}	if (totalHorasMes > 160) {
				totalHorasExtras = totalHorasMes - 160;
			} else {
				System.out.println("O nemero de horas trabalhadas é inferior a 160, nao havera horas extras!");
			}
		
		System.out.println("Valor recebido por hora trabalhada: ");
		valorHoras = scan.nextFloat();
		
		valorHoraExtra = totalHorasExtras * 0.5f;
		pgtoHoraExtra = valorHoraExtra * totalHorasExtras;
		
		salBruto = totalHorasMes*valorHoras;
				
		if (salBruto <= 2427.35f) {
				descontoInss = 0.09f;
		} else if (salBruto > 2427.35f || salBruto <= 3641.03f) {
				descontoInss = 0.12f;
	    }

		if (salBruto > 3641.03f) {
				descontoInss = 0.14f;
		}
		
		descontoRealInss = salBruto * descontoInss;
		salLiquido = salBruto + pgtoHoraExtra - descontoRealInss;
		
		System.out.println("===Contra-Cheque Mini DP====");
		System.out.println("Salario bruto: R$"+salBruto);
		System.out.println("Valor da hora extra: R$ " + valorHoraExtra);
		System.out.println("Valor a ser pago como hora extra: R$ " + pgtoHoraExtra);
		System.out.println("Desconto do INSS: R$"+ descontoRealInss);
		System.out.println("Salario liquido: R$"+ salLiquido);
		scan.close();

	}

}
