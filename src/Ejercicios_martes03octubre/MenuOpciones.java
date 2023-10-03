package Ejercicios_martes03octubre;

import java.util.Scanner;

public class MenuOpciones {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("1. Saludar\n2. Decir Adiós\n3. Salir");
            System.out.println("Elige una opción:");
            opcion = scanner.nextInt();

            if (opcion == 1) {
                System.out.println("¡Hola!");
            } else if (opcion == 2) {
                System.out.println("¡Adiós!");
            } else if (opcion != 3) {
                System.out.println("Opción no válida.");
            }
        } while (opcion != 3);
        scanner.close();

	}

}
