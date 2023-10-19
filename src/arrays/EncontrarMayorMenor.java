package arrays;

public class EncontrarMayorMenor {

	public static void main(String[] args) {

		int[] numeros = { 11, 24, 35, 4, 6 };

		int mayor = numeros[0];
		int menor = numeros[0];

		// Recordar que .length nos devuelve la cantidad de elementos del array.
		// las posiciones del array empiezan desde el cero, igual que los índices.
		// cuando hablemos de posiciones estamos haciendo referencia al índice.

		System.out.println("La longitud del array es: " + numeros.length);

		for (int i = 0; i < numeros.length; i++) {

			if (numeros[i] > mayor) {
				mayor = numeros[i];
			}
			
			if (numeros[i] < menor) {
				menor = numeros[i];
			}
		}
		
		System.out.println("El número mayor dentro del array es: " +  mayor);
		System.out.println("El número menor dentro del array es: " +  menor);
	}
}
