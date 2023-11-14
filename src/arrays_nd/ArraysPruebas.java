package arrays_nd;

import java.util.Arrays;

public class ArraysPruebas {

	public static void main(String[] args) {
//		int[] nums = new int[] {};		
//		
//		//System.out.println(nums[0]);
//		System.out.println(Arrays.toString(nums));
		
		int[][] onlyRows = new int[2][];
		onlyRows[0] = new int[5];  // La primera fila tiene 5 columnas
		onlyRows[1] = new int[3];  // La segunda fila tiene 3 columnas
		// ... y así sucesivamente para las demás filas
		
		int[][] onlyRows2 = new int[][] {{}, {}, {}};

		for (int[] row : onlyRows) {
			System.out.println(row + ", ");
		}
		
	}

}
