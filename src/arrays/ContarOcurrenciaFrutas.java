package arrays;

public class ContarOcurrenciaFrutas {

	public static void main(String[] args) {

		String[] frutas = { "Plátano", "manzana", "plátano", "fresa", "pera", "manzana" };

		System.out.println("Ocurrencia de frutas dentro de la lista");
		for (int i = 0; i < frutas.length; i++) {
			int cont = 1;

			if (frutas[i] != null) {
				for (int j = i + 1; j < frutas.length; j++) {
					if (frutas[i].equalsIgnoreCase((frutas[j]))) {
						cont++;// 2
						frutas[j] = null;
					}
				}

				System.out.println(frutas[i] + ": " + cont);
			}

		}



	}

}
