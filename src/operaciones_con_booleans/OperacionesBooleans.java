package operaciones_con_booleans;

import java.util.Scanner;

public class OperacionesBooleans {

	public static void main(String[] args) {

		// *** Operadores de Comparación: Estos operadores devuelven un resultado
		// booleano
		// == (igual a)
		// != (no igual a)
		// > (mayor que)
		// < (menor que)
		// >= (mayor o igual que)
		// <= (menor o igual que)

		// ***Operadores Lógicos: Se utilizan para combinar múltiples condiciones:
		// && (AND lógico)
		// || (OR lógico)
		// ! (NOT lógico)

//		int edad = -1;
//		boolean tieneAcceso = (edad == 20);
//
//		System.out.println("El valor de la variable booleana es: " + tieneAcceso);
//
//		// devuelve tru o false
//		if (tieneAcceso) {
//			System.out.println("Tienes acceso");
//		} else {
//			System.out.println("No Tienes acceso");
//		}

		Scanner sc = new Scanner(System.in);

		boolean esResidente;
		System.out.println("Indica si eres residente: si / no");
		String respuesta = sc.nextLine();

		if (respuesta.equalsIgnoreCase("si")) {
			esResidente = true;
		} else {
			esResidente = false;
		}
		
		

		if (!esResidente) {
			System.out.println("Bienvenido a nuestra comunidad, te recomendamos visitar x lugar");
		}

	}

}
