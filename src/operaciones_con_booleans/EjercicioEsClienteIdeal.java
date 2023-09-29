package operaciones_con_booleans;

import java.util.Scanner;

public class EjercicioEsClienteIdeal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String respuesta;
		
		System.out.println("¿Has devuelto algún artículo en los últimos 3 meses?  si / no");
		respuesta = sc.nextLine();	
		
		boolean esClienteIdeal = !respuesta.equalsIgnoreCase("si");
		
		if(esClienteIdeal) {
			System.out.println("has conseguido un descuento especial");
		}

	}

}
