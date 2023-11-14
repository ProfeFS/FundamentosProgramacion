package arrays_nd;

public class ArraysNDDeclarations {

	public static void main(String[] args) {

		/*
		 * Pueden ser uniformes, es decir, todos los arrays tienen el mismo tamaño.
		 */
		char[][] tabla1 = new char[][] {
										{ 'a', 'e', 'i', 'o', 'u' },
										{ 'A', 'E', 'I', 'O', 'U' } 
										};

		//Recorrido de una tabla
		for (char[] vowels : tabla1) {
			for (char vowel : vowels) {
				System.out.println(vowel + ", "); // a, e, i, o, u, A, E, I, O, U
			}
		}

		System.out.println();
		char[][] tabla2 = new char[][] { 
										{ 'x', ' ', 'o' },
										{ 'x', 'o', 'o' },
										{ ' ', ' ', 'x' } };

		for (char[] row : tabla2) {
			for (char token : row) {
				System.out.println(token + ", "); // x, ,o, x, o, o, , ,x
			}
		}
		
		
		int[] array = new int[3 * 2];		
		System.out.println();
		for (int value : array ) {
			System.out.println(value + ", "); // 0, 0, 0, 0, 0, 0,
		}
		
		
		int[][][] tabla3 = new int[][][] { 
										   { { 0, 0, 0 }, { 0, 0 }, { 0 } },
										   { {}, { 1, 2, 3, 4 } }
										};
		
		
		System.out.println();
		for (int[][] tableData : tabla3 ) {
			for (int[] row : tableData) {
				for (int value : row) {
					System.out.println(value + ", "); // 0, 0, 0, 0, 0, 0, 1, 2, 3, 4
				}
			}
		}
		
		
		
		
		int length = 3;
		boolean[][] tabla4 = new boolean[length - 1][2];		
		System.out.println();
	
		for (boolean[] row : tabla4 ) {
			for (boolean value : row) {
				System.out.println(value + ", "); // false, false, false, false,
			}
		}

		System.out.println();
		/*
		 * Es una forma de crear un array "irregular" o "jagged" (dentado), donde cada
		 * sub-array puede tener un tamaño diferente.
		 */
		int[][] onlyRows = new int[10][];
		onlyRows[0] = new int[5];  // La primera fila tiene 5 columnas
		onlyRows[1] = new int[3];  // La segunda fila tiene 3 columnas
		// ... y así sucesivamente para las demás filas

		for (int[] row : onlyRows) {
			System.out.println(row + ", ");
		}
		
		//cuál es la diferencia entre ambos:
		int[][] nums = new int[1][3];
		int[] nums2 = new int[3];

	}

}
