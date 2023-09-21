package estructuras;

import java.util.Scanner;

public class EstructuraSwitch {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int opt = 0;

		System.out.println("Bienvenido, elige una opción");
		System.out.println("1. Ir módulo A");
		System.out.println("2. Ir módulo B");
		System.out.println("3. Salir");

		opt = sc.nextInt();

		switch (opt) {
		case 1: {
			System.out.println("Estás en el módulo A");
			break;
		}
		case 2: {
			System.out.println("Estás en el módulo B");
			break;
		}
		case 3: {
			System.out.println("Estás en el módulo C");
			break;
		}
		default:
			System.out.println("Opción inválida");
			break;
		}

	}

}
