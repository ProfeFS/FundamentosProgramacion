package repaso_con_metodos;

import java.util.Scanner;

public class EjercicioPrecioMetodos {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double precio;
		double descuento;
		double precioFinal;

		for (int i = 0; i < 3; i++) {
			System.out.println("Por favor ingresa el precio del producto " + (i + 1));
			precio = sc.nextDouble();
			System.out.println("Por favor ingresa el % de descuento del producto " + (i + 1));
			descuento = sc.nextDouble();

			System.out.println(
					"El precio total del producto " + (i + 1) + " es: " + calculoPrecioConDescuento(precio, descuento));

		}

		sc.close();
	}

	public static double calculoPrecioConDescuento(double precioF, double descuentoF) {
		double precioFinalF = precioF - (precioF * descuentoF / 100);
		return precioFinalF;
	}
	
	
	
}
