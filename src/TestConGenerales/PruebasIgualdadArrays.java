package TestConGenerales;

import java.util.Arrays;

public class PruebasIgualdadArrays {

	public static void main(String[] args) {

		int[] a = {1, 3, 2, 4, 5};
		int[] b = new int[a.length]; System.arraycopy(a, 0, b, 0, a.length); 
				//Arrays.copyOf(a, a.length); 
		
		for(int be: b) {
			System.out.println(be);
		}

		if(Arrays.equals(a, b)) {
			System.out.println("son iguales");
		}
		
		System.out.println(new String[][]{
				{"a", "b", "c"},
				{"x", "y", "z"}}[0][0]
		);

	}

}
