package arrays_nd_ejercicios;
public class TablaMultiplicar {

    public static void main(String[] args) {
        int[][] tablaMultiplicar = new int[2][2];

        // Inicialización
        for (int i = 0; i < tablaMultiplicar.length; i++) {
            for (int j = 0; j < tablaMultiplicar[i].length; j++) {
                tablaMultiplicar[i][j] = (i + 1) * (j + 1);
            }
        }

        // Impresión con for-each
        for (int[] fila : tablaMultiplicar) {
            for (int valor : fila) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }
    }
}
