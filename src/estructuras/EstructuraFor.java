package estructuras;

import java.util.Scanner;

public class EstructuraFor {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese el límite");
		int limite = sc.nextInt();
		// int num = 1;

//		while (num <= limite) {
//			System.out.println(num);
//			num++; // num = num+1;
//		}

		// parte A: Declaración
		// parte B: Evaluación
		// Parte C: Operación con variable.

		for (int num = 1; num <= limite; num++) {
			System.out.println(num);
		}

	}

}
