package Ejercicios_martes03octubre;

import java.util.Scanner;

public class ValidadorEdadVotar {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Por favor, introduce tu edad:");
		int edad = scanner.nextInt();

		if (edad >= 18) {
			System.out.println("Puedes votar.");
		} else {
			System.out.println("No puedes votar.");
		}
		scanner.close();

	}

}
