package arrays;

public class EliminarElemento {

	public static void main(String[] args) {

		int[] numeros = { 10, 20, 30, 40, 50 };

		System.out.println("Array antes de la eliminación: ");
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + ", ");
		}
		
		for (int i = 0; i < numeros.length; i++) {			
			if (numeros[i] == 30) {
				numeros[i] = -1;
				System.out.println("\n\rSe ha eliminado el número 30 de la posición: " + i);
			}
		}

		System.out.println("\nArray luego de la eliminación: ");
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + ", ");
		}

	}

}
