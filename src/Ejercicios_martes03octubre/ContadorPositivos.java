package Ejercicios_martes03octubre;

import java.util.Scanner;

public class ContadorPositivos {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        int contador = 0;

	        for (int i = 0; i < 5; i++) {
	            System.out.println("Introduce un número:");
	            int numero = scanner.nextInt();
	            if (numero > 0) {
	                contador++;
	            }
	        }
	        System.out.println("Has introducido " + contador + " números positivos.");
	        scanner.close();
	}

}
