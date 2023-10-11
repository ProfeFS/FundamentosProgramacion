package EjerciciosTipoExamenCasa;

import java.util.Scanner;

public class CalculadoraPromedio {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean avanzar = true;
		float nota=0;
		float promedio =0;
		float sumaNotas =0;
		int contadorNota =0;
		
		while(avanzar) {
			System.out.println("Ingresa una nota [0 al 10] y -1 para salir");
			nota = sc.nextFloat();
			System.out.println("Has ingresado: " + nota);
			
			if(nota >=0 && nota <=10) {
				contadorNota++;
				sumaNotas += nota;
				promedio = sumaNotas/contadorNota;					
			}else if(nota == -1) {
				avanzar = false;
				System.out.println("Saliendo del sistema");						
			}else {
				System.out.println("Nota inválida...");				
			}
			
			System.out.println("El promedio actual es: " + promedio);
		}
		
		sc.close();

	}

}
