package arrays_nd_ejercicios;
public class HorarioCursos1 {

    public static void main(String[] args) {
        String[][] horarioCursos = {
            {"Matemáticas", "Lunes", "Miércoles", "Viernes"},
            {"Historia", "Martes", "Jueves"},
            {"Ciencias", "Lunes", "Miércoles"}
        };

        
     // Impresión
        for (int i = 0; i < horarioCursos.length; i++) {
            System.out.print(horarioCursos[i][0] + " : ");
            for (int j = 0; j < horarioCursos[i].length; j++) {
            	if(j+1 <  horarioCursos[i].length ) {
            		System.out.print(horarioCursos[i][j+1] + " ");
            		
            	}
                
            }
            System.out.println();
        }
    }
}
