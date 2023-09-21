package estructuras;

import java.util.Scanner;

public class EstructuraWhileDoWhile {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// System.out.println("Ingrese el límite: ");
//		int limite = sc.nextInt();
//		int num = 1;

//		while(num <=limite) {
//			System.out.println(num);
//			num++; // num = num+1;
//		}

		int opt;

		do {
			System.out.println("Ingrese una opción: ");
			System.out.println("1 Saludar");
			System.out.println("2 Sumar 2 + 2");
			System.out.println("3 Salir");

			opt = sc.nextInt();

			if (opt == 3) {
				System.out.println("Hasta luego");
			}

		} while (opt != 3);

	}

	public int sumarDosEnteros() {
		return 2 + 2;
	}

}
