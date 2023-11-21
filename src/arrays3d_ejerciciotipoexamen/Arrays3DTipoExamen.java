package arrays3d_ejerciciotipoexamen;

import java.util.Scanner;

public class Arrays3DTipoExamen {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[][][] inventario;

		System.out.println("Hola, por favor ingresa la cantidad de tiendas del inventario");
		int numTiendas = sc.nextInt();

		inventario = new int[numTiendas][][];

		for (int i = 0; i < inventario.length; i++) {
			System.out.println("Ingrese la cant de departamentos de la tienda " + (i + 1));
			int cantDep = sc.nextInt();
			inventario[i] = new int[cantDep][];

			for (int j = 0; j < cantDep; j++) {
				System.out.println("Ingrese la cantidad de categorías para el departamento " + (j + 1)
						+ " de la tienda " + (i + 1) + ": ");
				int cantCat = sc.nextInt();
				inventario[i][j] = new int[cantCat];

				for (int k = 0; k < cantCat; k++) {
					System.out.println("Ingrese la cantidad de stock para la tienda " + (i + 1) + ", departamento "
							+ (j + 1) + ", categoría " + (k + 1) + ": ");
					int cantProductos = sc.nextInt();
					inventario[i][j][k] = cantProductos;
				}

			}
		}

		// Impresión del inventario completo con formato claro
		System.out.println("Inventario Completo:");
		for (int tienda = 0; tienda < inventario.length; tienda++) {
			System.out.println("Tienda " + (tienda + 1) + ":");
			for (int departamento = 0; departamento < inventario[tienda].length; departamento++) {
				System.out.println("  Departamento " + (departamento + 1) + ":");
				for (int categoria : inventario[tienda][departamento]) {
					System.out.println("    Categoría: " + categoria);
				}
			}
		}

		// Pedir al usuario que ingrese el número de una tienda para ver el inventario
		System.out.println("Ingrese la tienda para la que desea ver el inventario:");
		int numTienda = sc.nextInt() - 1;

		System.out.println("Tienda número: " + numTienda);
		for (int i=0; i<inventario[numTienda].length; i++) {
			System.out.print("Departamento " + (i+1) +  ": ");
			for(int stock: inventario[numTienda][i] ) {
				System.out.print(stock + ", ");				
			}
			System.out.println();
		
		}

	}

}
