package arrays_nd_ejercicios;

public class HorarioCursos3 {

	public static void main(String[] args) {
		String[][] horarioAsignaturas = { { "Lunes", "Miércoles", "Viernes" }, // mate
				{ "Martes", "Jueves" }, // historia
				{ "Lunes", "Miércoles" } // ciencias
		};

		String[] asignaturas = { "Matemáticas", "Historia", "Ciencias" };

		// Impresión
		int cont = 0;
		for (String[] horario : horarioAsignaturas) {
			if (cont < asignaturas.length) {
				System.out.print(asignaturas[cont] + ": ");
				cont++;
			}

			for (String dia : horario) {
				System.out.print(dia + ", ");

			}
			System.out.println();
		}

	}
}
