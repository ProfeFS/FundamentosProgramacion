package EjerciciosTipoExamenCasa;

import java.util.Scanner;

public class SistemaCalificacion {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Ingrese la calificación (0-100):");
		int calificacion = scanner.nextInt();

		if (calificacion < 0 || calificacion > 100) {
			System.out.println("La calificación ingresada no es válida");
		} else if (calificacion >= 90) {
			System.out.println("A");
		} else if (calificacion >= 80) {
			System.out.println("B");
		} else if (calificacion >= 70) {
			System.out.println("C");
		} else if (calificacion >= 60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}

	}

}
