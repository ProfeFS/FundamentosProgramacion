package EjerciciosTipoExamenCasa;

import java.util.Scanner;

public class ConversorMonedas {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Ingrese la cantidad de dinero en dólares:");
		double dolares = scanner.nextDouble();

		if (dolares < 0) {
			System.out.println("La cantidad de dinero no puede ser negativa");
		} else {
			double tasaCambio = 0.91; // Supongamos 1 dólar es igual a 0.91 euros
			double euros = dolares * tasaCambio;
			System.out.printf("Eso serían %.2f euros.\n", euros);
		}

	}

}
