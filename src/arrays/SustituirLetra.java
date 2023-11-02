package arrays;

import java.util.Scanner;

public class SustituirLetra {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Pedir al usuario cuántos nombres va a ingresar
        System.out.print("¿Cuántos nombres deseas ingresar? ");
        int cantidad = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea restante
        
        String[] nombres = new String[cantidad];
        
        // Recoger nombres de usuario
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingresa el nombre " + (i + 1) + ": ");
            nombres[i] = scanner.nextLine();
        }
        
        // Mostrar nombres que contienen 'n' o 'N', sustituyendo por 'x'
        System.out.println("Nombres modificados que contienen 'n' o 'N':");
        for (String nombre : nombres) {
            if (nombre.contains("n") || nombre.contains("N")) {
                System.out.println(nombre.replace("n", "x").replace("N", "X"));
            }
        }
        
        scanner.close();

	}

}
