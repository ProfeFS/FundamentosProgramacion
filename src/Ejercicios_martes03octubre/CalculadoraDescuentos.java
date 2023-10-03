package Ejercicios_martes03octubre;

import java.util.Scanner;

public class CalculadoraDescuentos {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese el precio del producto:");
		double precio = scanner.nextDouble();
		scanner.nextLine(); // Consumir el salto de línea
		System.out.println("Ingrese el día de la semana:");
		String dia = scanner.nextLine();

		double descuento = 0;
		if ("miércoles".equalsIgnoreCase(dia)) {
			descuento = 0.15;
		} else if ("sábado".equalsIgnoreCase(dia)) {
			descuento = 0.10;
		}
		double precioFinal = precio - (precio * descuento);
		System.out.println("El precio final es: $" + precioFinal);
		scanner.close();

	}

}
