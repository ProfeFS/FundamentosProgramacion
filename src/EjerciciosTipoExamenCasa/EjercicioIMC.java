package EjerciciosTipoExamenCasa;

import java.util.Scanner;

public class EjercicioIMC {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        
	        System.out.println("Ingrese su peso en kg:");
	        double peso = scanner.nextDouble();
	        
	        System.out.println("Ingrese su altura en metros:");
	        double altura = scanner.nextDouble();
	        
	        double imc = peso / (altura * altura);
	        
	        if (imc < 18.5) {
	            System.out.println("Bajo de peso");
	        } else if (imc >= 18.5 && imc <= 24.9) {
	            System.out.println("Normal");
	        } else if (imc >= 25 && imc <= 29.9) {
	            System.out.println("Sobrepeso");
	        } else {
	            System.out.println("Obesidad");
	        }

	}

}
