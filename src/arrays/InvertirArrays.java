package arrays;

public class InvertirArrays {

	public static void main(String[] args) {

		// int[] num = new int[5];
		int[] num = { 4, 6, 2, 8, 7 }; // length me retorna el número de elementos del array.

		// auxiliar = 4;
		// j =4;
		// {7, 6, 2, 8, 4}

		// la mitad del array debería estar dada por la expresión num.legth/2
		// en este caso 5/2 = 2.5 pero como es un entero, se trunca la parte decimal y
		// retorna 2

		
		//Mérodo 1: usando variables auxiliares e intercambiando en el mismo array
		for (int i = 0; i < num.length / 2; i++) {

			int j = num.length - 1 - i;
			int aux = num[i];
			num[i] = num[j];
			num[j] = aux;

		}
		
		System.out.println("Método 1:");
		
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] +  "| ");
			
		}
		
		
		//Método 2: Usando un array axiliar
		
		int[] otroNum = { 4, 6, 2, 8, 7 };
		int[] otroNumAux = new int[otroNum.length];
		
//		otroNumAux[0]=otroNum[4];
//		otroNumAux[1]=otroNum[3];
//		otroNumAux[2]=otroNum[2];
//		otroNumAux[3]=otroNum[1];
//		otroNumAux[4]=otroNum[0];
		
		
		
		for (int i = 0; i < otroNum.length; i++)
		{

			int j = (num.length - 1) - i;
			otroNumAux[i] = otroNum[j];
		}
		

		
		System.out.println("\n\rMétodo 2:");
		
		for (int i = 0; i < otroNum.length; i++) {
			System.out.print(otroNumAux[i] +  "| ");
		}
		

	}

}
