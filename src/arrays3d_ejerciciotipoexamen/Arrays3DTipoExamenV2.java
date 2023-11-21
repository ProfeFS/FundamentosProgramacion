package arrays3d_ejerciciotipoexamen;

import java.util.Scanner;

public class Arrays3DTipoExamenV2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[][][] inventario;

		System.out.println("Hola, por favor ingresa la cantidad de tiendas del inventario");
		int numTiendas = sc.nextInt();

		inventario = new int[numTiendas][][];

		System.out.println("\rA continuación, ingrese la cantidad de departamentos por cada tienda:");

		for (int i = 0; i < inventario.length; i++) {
			System.out.println("Ingrese la cant de departamentos de la tienda " + (i + 1));
			int cantDepxTienda = sc.nextInt();
			inventario[i] = new int[cantDepxTienda][];
		}

		System.out.println("\r A continuación indica por favor cuántas categorías de productos" + " tiene cada tienda");

		for (int i = 0; i < inventario.length; i++) {
			for (int j = 0; j < inventario[i].length; j++) {
				System.out.println("Ingrese la cant de categorías " + " Tienda " + (i + 1) + " - Depto:" + (j + 1));

				int cantCatDep = sc.nextInt();
				inventario[i][j] = new int[cantCatDep];
			}
		}

	}

}
