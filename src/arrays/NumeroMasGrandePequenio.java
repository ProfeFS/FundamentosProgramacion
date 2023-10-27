package arrays;

import java.util.Scanner;

public class NumeroMasGrandePequenio {

	public static void main(String[] args) {

		int[] numeros;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Por favor indique la cantidad de números a ingresar:\n");
		int n = sc.nextInt();
		
		numeros = new int[n];
		int mayor=0;
		int menor=0;
		
		for(int i =0; i< numeros.length ; i++) {
			System.out.println("Ingrese un número:");
			int num = sc.nextInt();
			numeros[i] = num;	
			
			if(numeros[i] >= mayor) {
				mayor = numeros[i];
			}
			
			if(numeros[i] < menor) {
			menor = numeros[i];	
			}
		}
		
		
		System.out.println("El array:");
		for(int i =0; i< numeros.length ; i++) {
			System.out.print(numeros[i] + "|");
		}
		
		System.out.println("\nEl mayor: " + mayor);
		System.out.println("El menor: " + menor);
		


	}

}
