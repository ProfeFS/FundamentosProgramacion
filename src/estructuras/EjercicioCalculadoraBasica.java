package estructuras;

import java.util.Scanner;

public class EjercicioCalculadoraBasica {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese el número 1");
		double num1 = sc.nextDouble();

		System.out.println("Ingrese el número 2");
		double num2 = sc.nextDouble();

		System.out.println("Ingrese la operación que queres realizar: + / - *");
		String operacion = sc.nextLine();
		char op = sc.next().charAt(0); // unicode

		switch (op) {
		case '+':
			System.out.println(num1 + num2);

			break;
		case '-':
			System.out.println(num1 - num2);
			break;

		case '*':
			System.out.println(num1 * num2);
			break;

		case '/':

			while (num2 == 0) {
				System.err.println("Ilegal operation: división entre cero");
				System.out.println("Ingrese nuevamente el número 2");
				num2 = sc.nextDouble();
			}
			
			System.out.println(num1 / num2);
			
//			if (num2 == 0) {
//				System.err.println("Ilegal operation: división entre cero");
//			} else {
//				System.out.println(num1 / num2);
//			}

			break;

		default:
			System.out.println("Opción no válida");
			break;
		}

	}

}
