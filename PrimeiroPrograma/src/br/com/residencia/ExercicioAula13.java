package br.com.residencia;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class ExercicioAula13 {

	public static void main(String[] args) {

		LocalDate data = LocalDate.now().minusDays(0);
		System.out.println("LocalDate antes de formatar: " + data);
		System.out.println("Data" + data);
		System.out.println("Dia Semana: " + data.getDayOfWeek().name());
		System.out.println("Dia Semana: " + data.getDayOfWeek().getValue());
		System.out.println("Mes: " + data.getMonthValue());
		System.out.println("Mes nome: " + data.getMonth().name());
		System.out.println("Ano: " + data.getYear());

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy ");
		String hojeFormatado = data.format(formatter);
		System.out.println("LocalDate depois de formatar: " + hojeFormatado);

//		Alem disso, exiba a quantidade de anos desde sua data de
//		nascimento.

		LocalDate birthDate = LocalDate.of(1988, 7, 27);

		Period periodo = Period.between(birthDate, data);

		System.out.println(periodo);
		System.out.println(periodo.getYears());

	}

}
