package arrays;

import java.util.Scanner;

public class ReservaAsientos {

	public static void main(String[] args) {

		String[] asientos = { "v1", "p1", "p2x", "v1", "v2", "p3", "p4", "p5", "v4" };

		System.out.println("Hola, buenvenido a nuestro sistema de reservas online \n");
		System.out.println("A continuación los asientos disponibles:");

		// muestro el dibujo de los asientos disponibles
		for (int i = 0; i < asientos.length; i++) {

			System.out.print((i + 1) + "[" + asientos[i] + "] ");

		}

		boolean reservado = false;

		while (!reservado) {

			System.out.println("\n\rPor favor indica el número del asiento disponible que desea reservar");

			Scanner sc = new Scanner(System.in);

			int numAsiento = sc.nextInt();

			if (asientos[numAsiento - 1].contains("x")) {
				System.out.println("El asiento número " + numAsiento + " que has elegido se encuentra ocupado");
			}else {
				reservado = true;
				String codAsiento =asientos[numAsiento - 1];
				asientos[numAsiento - 1] = codAsiento + "x";
				System.out.println("Hemos reservado su asiento número " + numAsiento );
			}

		}		
	
		
		for (int i = 0; i < asientos.length; i++) {

			System.out.print((i + 1) + "[" + asientos[i] + "] ");

		}

	}

}
