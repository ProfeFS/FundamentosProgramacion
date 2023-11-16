package arrays_nd_ejercicios;
public class HorarioCursos2 {

    public static void main(String[] args) {
        String[][] horarioCursos = {
            {"Lunes", "Miércoles", "Viernes"}, //mate
            {"Martes", "Jueves"}, //historia
            {"Lunes", "Miércoles"} // ciencias
        };

        // Impresión
        for (int i = 0; i < horarioCursos.length; i++) {
        	if(i==0) {
        		 System.out.print("Matemáticas " + ": ");
        	}else if(i==1) {
        		System.out.print("Historia " + ": ");
        	}else {
        		System.out.print("Ciencia " + ": ");
        	}
           
            for (int j = 0; j < horarioCursos[i].length; j++) {
                System.out.print(horarioCursos[i][j] + " ");
            }
            System.out.println();
        }
        
 
    }
}
