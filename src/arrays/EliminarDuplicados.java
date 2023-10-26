package arrays;

import java.lang.reflect.Array;

public class EliminarDuplicados {

	public static void main(String[] args) {

		String[] palabras = { "hola", "nueva", "hola", "otra", "otra" };

		System.out.println("El Array original: ");
		for (int i = 0; i < palabras.length; i++) {
			System.out.print(palabras[i] + " |");
		}

		for (int i = 0; i < palabras.length; i++) {
			if (palabras[i] != null) {
				for (int j = i + 1; j < palabras.length; j++) {
					if (palabras[i].equalsIgnoreCase(palabras[j])) {
						palabras[j] = null;
					}
				}
			}

		}

		System.out.println("\nEl array luego de elimnar duplicados:");

		for (int i = 0; i < palabras.length; i++) {
			if (palabras[i] != null) {
				System.out.print(palabras[i] + " |");
			}
		}

	}

}
