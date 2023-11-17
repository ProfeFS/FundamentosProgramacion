package arrays_nd_ejercicios;

import java.util.Scanner;

public class HorarioCursosUserEntry {

	public static void main(String[] args) {
//		String[][] horarioAsignaturas = { { "Lunes", "Miércoles", "Viernes" }, // mate
//				{ "Martes", "Jueves" }, // historia
//				{ "Lunes", "Miércoles" } // ciencias
//		};

		Scanner sc = new Scanner(System.in);
		String[][] horarioAsignaturas;
		String[] asignaturas;

		// 1.- Obtengo la cant de asignaturas para inicializar los arrays.
		System.out.println("Por favor ingresa la cantidad de asignaturas");
		int cantAsignaturas = sc.nextInt();
		sc.nextLine();
		asignaturas = new String[cantAsignaturas];
		horarioAsignaturas = new String[cantAsignaturas][];

		// 2.- Lleno el array de asignaturas con info del usuario.

		for (int i = 0; i < asignaturas.length; i++) {
			System.out.println("Por favor ingresa el nombre de la asignatura: ");
			asignaturas[i] = sc.nextLine();
		}

		// 3.-Obtengo los días por asignatura
		for (int i = 0; i < asignaturas.length; i++) {
			System.out.println("Por favor ingresa cuántos días a la semana se imparte " + asignaturas[i]);
			// 4.-inicializo cada asignatura con la cantidad de días a la semana.
			horarioAsignaturas[i] = new String[sc.nextInt()];
			sc.nextLine();
		}

		// 5.- Cargo la matriz con los horarios ingresados por el usuario
		for (int i = 0; i < horarioAsignaturas.length; i++) {
			System.out.println("Ingresa los días es que se imparte la asignatura: " + asignaturas[i]);
			for (int j = 0; j < horarioAsignaturas[i].length; j++) {
				System.out.println("Ingresa el día " + (j + 1));
				horarioAsignaturas[i][j] = sc.nextLine();
			}
		}

		// Impresión con for each
		System.out.println("Esta es el horario por asignaturas: ");
		int cont = 0;
		for (String[] horario : horarioAsignaturas) {
			System.out.print(asignaturas[cont] + ": ");
			cont++;
			for (String dia : horario) {
				System.out.print(dia + ", ");
			}
			System.out.println();
		}

	}
}
