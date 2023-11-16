package arrays_nd_ejercicios;
public class CalificacionesSemestre {

    public static void main(String[] args) {
        double[][] calificaciones = new double[5][2];

        // Inicialización aleatoria
        for (int i = 0; i < calificaciones.length; i++) {
            for (int j = 0; j < calificaciones[i].length; j++) {
                calificaciones[i][j] = Math.random() * 10;
            }
        }

        // Impresión
        for (int i = 0; i < calificaciones.length; i++) {
            System.out.print("Estudiante " + (i + 1) + ": ");
            for (int j = 0; j < calificaciones[i].length; j++) {
                System.out.printf("%.2f ", calificaciones[i][j]);
            }
            System.out.println();
        }
    }
}
