package arrays_nd_ejercicios;
public class AsientosTeatro {

    public static void main(String[] args) {
        String[][] asientosTeatro = {
            {"Libre", "Libre", "Libre", "Libre", "Libre", "Libre"},
            {"Libre", "Libre", "Libre", "Libre", "Libre"},
            {"Libre", "Libre", "Libre", "Libre"}
        };

        // Impresión con for-each
        for (String[] fila : asientosTeatro) {
            for (String asiento : fila) {
                System.out.print(asiento + " ");
            }
            System.out.println();
        }
    }
}
