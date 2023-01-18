package es.studium.poo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Principal
{

	public static void main(String[] args)
	{
		Director director = new Director("Pedro Almodóvar", LocalDate.of(1949, 9, 25), "Español");
		System.out.println(director.getFechaNacimiento());

		DateTimeFormatter damosFormato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate formatoFechaNacimiento = LocalDate.parse("25/09/1949", damosFormato);
		formatoFechaNacimiento.format(damosFormato);
		System.out.println(formatoFechaNacimiento.format(damosFormato));
	}

}
