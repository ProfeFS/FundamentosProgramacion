package repaso_con_metodos;

import java.util.Scanner;

public class EjercicioSaludarConMetodo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String nombre;

		System.out.println("Por favor ingresa tu nombre: ");
		nombre = sc.nextLine();

		saludar("español", nombre);
		saludar("inglés", nombre);
		saludar("francés", nombre);
		
		//complicarlo pidiendo que el usuario elija su idioma.

	}

	public static void saludar(String idioma, String nombre) {
		switch (idioma) {
		case "español":
			System.out.println("Hola, " + nombre);
			break;
		case "inglés":
			System.out.println("Hello, " + nombre);
			break;
		case "francés":
			System.out.println("Bonjour, " + nombre);
			break;

		default:
			System.out.println("No puedo saludar en ese idioma");
			break;
		}
	}

}
