package TestConGenerales;

public class ValoresReferencias {

	public static void main(String[] args) {

		int[] array = new int[] { 1, 2, 3, 4, 5 };
		System.out.println(array[0]); // 1
		System.out.println(array[4]); // 5
		// System.out.printlnln(array[5]); // ERROR!!!
		System.out.println(array.length); // 5

		int primitive1 = 1;
		int primitive2 = primitive1;
		System.out.println(primitive1); // 1
		System.out.println(primitive2); // 1
		primitive2 = 2;
		System.out.println(primitive1); // 1
		System.out.println(primitive2); // 2

		int[] array1 = new int[] { 1, 2, 3 };
		for (int value : array1) {
			System.out.print(value + ", "); // 1, 2, 3
		}

		System.out.println();
		int[] array2 = array1;
		for (int value : array2) {
			System.out.print(value + ", "); // 1, 2, 3
		}

		System.out.println();
		array1[1] = 666;
		for (int value : array1) {
			System.out.print(value + ", "); // 1, 666, 3
		}

		System.out.println();
		for (int value : array2) {
			System.out.print(value + ", "); // 1, 666, 3
		}

		System.out.println();
		System.out.println(array1 == array2); // true

		array1 = new int[] { 1, 666, 3 };
		for (int value : array1) {
			System.out.print(value + ", "); // 1, 666, 3
		}

		System.out.println();
		for (int value : array2) {
			System.out.print(value + ", "); // 1, 666, 3
		}

		System.out.println();
		System.out.print(array1 == array2); // false

		System.out.println();
		array2[1] = 0;
		for (int value : array1) {
			System.out.print(value + ", "); // 1, 666, 3
		}

		System.out.println();
		for (int value : array2) {
			System.out.print(value + ", "); // 1, 0, 3
		}

		System.out.println();
		System.out.print(array1 == array2); // false

		System.out.println();
		for (int value : array1) {
			System.out.print(value + ", "); // 1, 666, 3,
		}

		System.out.println();
		for (int i = 0; i < array1.length; i++) {
			System.out.print(i + ": " + array1[i] + ", "); // 0: 1, 1: 666, 2: 3,
		}
		System.out.println();
	}

}


/*
En Java, las variables o son de tipo primitivo o son referencias.

Las referencias son zonas de memoria que no devuelven un valor entero,
double, char, boolean o cualquier otro primitivo.

Por el contrario, Las referencias guardan es una dirección de memoria que aloja el dato.

Las referencias se pueden ver como punteros que señalan una dirección de memoria de la variable.

Todo lo que es de tipo primitivo se trata por valor, pero todo lo demás se trata por referencia.

 */
