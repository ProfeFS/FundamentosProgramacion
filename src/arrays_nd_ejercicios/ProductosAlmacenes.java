package arrays_nd_ejercicios;
import java.util.Random;

public class ProductosAlmacenes {

    public static void main(String[] args) {
        Random random = new Random();
        int[][] productosAlmacenes = {
            new int[5],
            new int[4],
            new int[2]
        };

        // Inicialización aleatoria
        
        for (int i = 0; i < productosAlmacenes.length; i++) {
            for (int j = 0; j < productosAlmacenes[i].length; j++) {
                productosAlmacenes[i][j] = random.nextInt(100);
            }
        }

        // Impresión
        for (int i = 0; i < productosAlmacenes.length; i++) {
            System.out.print("Almacén " + (i + 1) + ": ");
            for (int j = 0; j < productosAlmacenes[i].length; j++) {
                System.out.print(productosAlmacenes[i][j] + " ");
            }
            System.out.println();
        }
    }
}
