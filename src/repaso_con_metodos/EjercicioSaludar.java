package repaso_con_metodos;

import java.util.Scanner;

public class EjercicioSaludar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		String nombre;
		
		System.out.println("Por favor ingresa tu nombre: " );
		nombre = sc.nextLine();
		
		System.out.println("Hola, " +  nombre); //saludo en español
		System.out.println("Hello, " +  nombre);
		System.out.println("Bonjour, " +  nombre);
		
		
		
		
		
	}

}
