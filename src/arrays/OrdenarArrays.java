package arrays;

import java.util.Arrays;

public class OrdenarArrays {

	public static void main(String[] args) {
		int[] numeros = { 1, 24, 35, 4, 6, 0 };

		Arrays.sort(numeros);

		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + ", ");

		}

//
//		int auxiliar;
//
//		int cont = 0;
//		// ordenar de menor a mayor
//		while (cont < 6) {
//
//			for (int i = 0; i < numeros.length; i++) {
//				if (i < (numeros.length - 1) && numeros[i + 1] < numeros[i]) {
//					auxiliar = numeros[i];
//					numeros[i] = numeros[i + 1];
//					numeros[i + 1] = auxiliar;
//				}
//			}
//
//			cont++;
//
//		}
//
//		for (int i = 0; i < numeros.length; i++) {
//			System.out.print(numeros[i] + ", ");
//
//		}
//
	}

}
