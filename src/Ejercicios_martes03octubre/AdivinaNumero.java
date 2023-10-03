package Ejercicios_martes03octubre;

import java.util.Random;
import java.util.Scanner;

public class AdivinaNumero {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numeroAleatorio = random.nextInt(100) + 1;
        int intentos = 0;
        int maxIntentos = 10;

        System.out.println("Adivina el número (entre 1 y 100). Tienes " + maxIntentos + " intentos.");

        while (intentos < maxIntentos) {
            int numeroUsuario = scanner.nextInt();
            intentos++;

            if (numeroUsuario == numeroAleatorio) {
                System.out.println("¡Felicidades! Has adivinado el número en " + intentos + " intentos.");
                break;
            } else if (numeroUsuario < numeroAleatorio) {
                System.out.println("El número es mayor. Intento " + intentos + "/" + maxIntentos);
            } else {
                System.out.println("El número es menor. Intento " + intentos + "/" + maxIntentos);
            }
        }
        System.out.println("El número era: " + numeroAleatorio);
        scanner.close();

	}

}
