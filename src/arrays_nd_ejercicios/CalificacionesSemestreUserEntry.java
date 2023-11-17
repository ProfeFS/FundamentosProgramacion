package arrays_nd_ejercicios;

import java.util.Scanner;

public class CalificacionesSemestreUserEntry {

	public static void main(String[] args) {
		double[][] calificaciones = new double[5][2];
		Scanner sc = new Scanner(System.in);

		// Inicialización aleatoria
		for (int i = 0; i < calificaciones.length; i++) {
			System.out.println("ingrese calificaciones del Estudiante " + (i + 1) + ": ");
			for (int j = 0; j < calificaciones[i].length; j++) {
				System.out.println("calificación del semestre " + (j+1) + ": ");
				calificaciones[i][j] = sc.nextDouble();
			}
		}

		// Impresión
		for (int i = 0; i < calificaciones.length; i++) {
			System.out.print("Estudiante " + (i + 1) + ": ");
			for (int j = 0; j < calificaciones[i].length; j++) {
				System.out.printf("%.2f ", calificaciones[i][j]);
			}
			System.out.println();
		}
		
		sc.close();
	}
}
