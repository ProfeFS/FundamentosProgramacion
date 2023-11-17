package arrays_nd_ejercicios;
import java.util.Random;
import java.util.Scanner;

public class ProductosAlmacenesUserEntry {

    public static void main(String[] args) {
        
        int[][] productosAlmacenes;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Por favor ingrese la cantidad de almacenes: ");
        productosAlmacenes = new int[sc.nextInt()][];
        sc.nextLine();
        
        for(int i=0; i< productosAlmacenes.length ; i++) {
        	System.out.println("-->Ingrese cuántos tipos de productos tiene el almacen " + (i+1));
        	productosAlmacenes[i] = new int[sc.nextInt()];
        	sc.nextLine();
        }
        
        // Inicialización con datos del usuario        
        for (int i = 0; i < productosAlmacenes.length; i++) {
        	System.out.println("\n-->Ingrese los productos para el almacen " + +(i+1));
            for (int j = 0; j < productosAlmacenes[i].length; j++) {
            	System.out.println("> Cantidad tipo " + (j+1));
                productosAlmacenes[i][j] = sc.nextInt();
                sc.nextLine();
            }
        }

        // Impresión
        System.out.println("\rLA TABLA DE CANTIDADES DE PRODUCTOS POR ALMACEN: \n");
        for (int i = 0; i < productosAlmacenes.length; i++) {
            System.out.print("Almacén " + (i + 1) + ": ");
            for (int j = 0; j < productosAlmacenes[i].length; j++) {
                System.out.print("|" + productosAlmacenes[i][j] + "|");
            }
            System.out.println();
        }
        
        sc.close();
    }
}
