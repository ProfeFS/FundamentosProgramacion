package arrays;

import java.nio.file.spi.FileSystemProvider;
import java.util.Scanner;

public class ReservarAsientosTeatro {

	public static void main(String[] args) {

		boolean[] asientos = { false, false, false, false, false, false, false };
		Scanner sc = new Scanner(System.in);
		int opt;

		do {
			System.out.println("\n\nPor favor ingresa una opción:");
			System.out.println("1. Ver asientos disponibles:");
			System.out.println("2. Reservar:");
			System.out.println("3. Cancelar reserva:");
			System.out.println("4. Salir:");

			opt = sc.nextInt();

			switch (opt) {
			case 1:

				for (int i = 0; i < asientos.length; i++) {
					System.out.print(" " + (i + 1) + "[" + asientos[i] + "]");
				}

				break;
			case 2:
				System.out.println("Cuántos asientos deseas reservar");
				int cant = sc.nextInt();
				int cont = 0;
				int[] reserva = new int[cant];

				while (cont < cant) {

					System.out.println("A contunuación los asientos disponibles en false");

					for (int i = 0; i < asientos.length; i++) {
						System.out.print(" " + (i + 1) + "[" + asientos[i] + "]");
					}

					System.out.println("\nIndique el número del asiento");
					int numAsiento = sc.nextInt();

					if (asientos[numAsiento - 1]) {
						System.out.println("Asiento ya se encuentra reservado");
					} else {
						asientos[numAsiento - 1] = true;
						reserva[cont] = numAsiento;
						cont++;

					}
				}

				System.out.println("Asientos reservados con éxito");

				for (int i = 0; i < reserva.length; i++) {
					System.out.println(reserva[i] + "[" + true + "]");
				}

				break;
			case 3:

				System.out.println("Indique el número de asiento para cancelar reserva");
				int num = sc.nextInt();

				if (num <= asientos.length) {
					if (asientos[num - 1]) {
						asientos[num - 1] = false;
						System.out.println("Reserva cancelada con éxito");

					} else {
						System.out.println("Asiento no reservado");

					}
				} else {
					System.out.println("No existe ese asiento");
				}

				break;
			case 4:
				opt = 4;
				System.out.println("Hasta luego!!!");
				break;

			default:
				System.out.println("\nOpción inválida");
				break;
			}

		} while (opt != 4);

	}

}
