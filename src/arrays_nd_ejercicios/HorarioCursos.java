package arrays_nd_ejercicios;
public class HorarioCursos {

    public static void main(String[] args) {
        String[][] horarioCursos = {
            {"Lunes", "Miércoles", "Viernes"},
            {"Martes", "Jueves"},
            {"Lunes", "Miércoles"}
        };

        // Impresión
        for (int i = 0; i < horarioCursos.length; i++) {
            System.out.print("Asignatura " + (i + 1) + ": ");
            for (int j = 0; j < horarioCursos[i].length; j++) {
                System.out.print(horarioCursos[i][j] + " ");
            }
            System.out.println();
        }
        
   
    }
}
