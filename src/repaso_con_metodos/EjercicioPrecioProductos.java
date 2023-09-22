package repaso_con_metodos;

import java.util.Scanner;

public class EjercicioPrecioProductos {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double precio;
		double descuento;
		double precioFinal;

//		// Producto2
//		System.out.println("Por favor ingresa el precio del producto1: ");
//		precio = sc.nextDouble();
//		System.out.println("Por favor ingresa el % de descuento del producto1: ");
//		descuento = sc.nextDouble();
//		precioTotal = precio - (precio * descuento / 100);
//		System.out.println("El precio total del producto1 es: " + precioTotal);
//
//		// Producto2
//		System.out.println("Por favor ingresa el precio del producto2: ");
//		precio = sc.nextDouble();
//		System.out.println("Por favor ingresa el % de descuento del producto2: ");
//		descuento = sc.nextDouble();
//		precioTotal = precio - (precio * descuento / 100);
//		System.out.println("El precio total del producto1 es: " + precioTotal);
//
//		// Producto3
//		System.out.println("Por favor ingresa el precio del producto3: ");
//		precio = sc.nextDouble();
//		System.out.println("Por favor ingresa el % de descuento del producto3: ");
//		descuento = sc.nextDouble();
//		precioTotal = precio - (precio * descuento / 100);
//		System.out.println("El precio total del producto3 es: " + precioTotal);

		for (int i = 0; i < 3; i++) {
			System.out.println("Por favor ingresa el precio del producto " + (i + 1));
			precio = sc.nextDouble();
			System.out.println("Por favor ingresa el % de descuento del producto " + (i + 1));
			descuento = sc.nextDouble();
			
			
			System.out.println("El precio total del producto " + (i + 1) + " es: "
									+ calculoPrecioConDescuento(precio, descuento));
			
//			precioFinal = calculoPrecioConDescuento(precio, descuento);//precio - (precio * descuento / 100);
//			System.out.println("El precio total del producto " + (i + 1) + " es: " + precioFinal);
		}

		sc.close();
		
		
		//Tarea2
		precio = 5;
		descuento = 5;
		double precioFinalCafe = precio - (precio * descuento / 100);
		
		

	}
                 
	public static double calculoPrecioConDescuento(double precioF, double descuentoF) {
		double precioFinalF = precioF - (precioF * descuentoF / 100);
		//return precioF - (precioF * descuentoF / 100);
		return precioFinalF;
		
	}
	
	
	
	

}

//Métodos

//Cumplen una única función dentro del programa.