package arrays_test;

import java.util.Scanner;

public class ControlTemperaturaEdificio {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Solicitar las dimensiones del array
		System.out.print("Ingrese el número de pisos: ");
		int numPisos = scanner.nextInt();
		System.out.print("Ingrese el número de habitaciones por piso: ");
		int numHabitaciones = scanner.nextInt();

		// Declarar e inicializar el array tridimensional
		float[][][] temperaturas = new float[numPisos][numHabitaciones][3]; // 3 momentos del día

		// Llenar el array con datos de temperatura
		for (int i = 0; i < numPisos; i++) { // piso
			System.out.println("Temperatura Piso " + (i + 1));
			for (int j = 0; j < numHabitaciones; j++) { // habitac
				System.out.println("  Temperaturas habitación " + (j + 1));
				for (int k = 0; k < 3; k++) { // momentos del día

					String momento;
					if (k == 0) {
						momento = "mañana";
					} else if (k == 1) {
						momento = "tarde";
					} else {
						momento = "noche";
					}

					System.out.println("    Ingrese la temperatura de la " + momento + ": ");
					temperaturas[i][j][k] = scanner.nextFloat();
				}

			}
		}

		// Solicitar al usuario que seleccione un piso para mostrar temperaturas
		System.out.print("Ingrese el número de piso para ver las temperaturas: ");
		int pisoSeleccionado = scanner.nextInt() - 1;

		// Mostrar las temperaturas para el piso seleccionado
		System.out.println("Temperaturas para el piso " + (pisoSeleccionado + 1) + ":");
		for (int habitacion = 0; habitacion < numHabitaciones; habitacion++) {
			System.out.println(
					"Habitación " + (habitacion + 1) + " - Mañana: " + temperaturas[pisoSeleccionado][habitacion][0]
							+ ", Tarde: " + temperaturas[pisoSeleccionado][habitacion][1] + ", Noche: "
							+ temperaturas[pisoSeleccionado][habitacion][2]);
		}

		// Calcular y mostrar la temperatura promedio del edificio
		float sumaTemperaturas = 0;
		int contador = 0;
		for (int piso = 0; piso < numPisos; piso++) {
			for (int habitacion = 0; habitacion < numHabitaciones; habitacion++) {
				for (int momento = 0; momento < 3; momento++) {
					sumaTemperaturas += temperaturas[piso][habitacion][momento];
					contador++;
				}
			}
		}
		float promedio = sumaTemperaturas / contador;
		System.out.println("Temperatura promedio en el edificio: " + promedio);
	}
}
