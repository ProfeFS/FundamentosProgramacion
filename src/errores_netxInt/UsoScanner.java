package errores_netxInt;

import java.util.Scanner;

public class UsoScanner {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese un número: ");
		int numero = sc.nextInt();  // en el buffer 23\n
		sc.nextLine();

		System.out.print("Ingrese una frase: ");
		String frase = sc.nextLine();


	}

}
