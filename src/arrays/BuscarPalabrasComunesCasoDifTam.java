package arrays;

public class BuscarPalabrasComunesCasoDifTam {

	public static void main(String[] args) {	

		// para el caso en que se una provincia exista más de una vez.

		String[] prov1 = { "Madrid", "Barcelona", "Sevilla", "Valencia" };
		String[] prov2 = { "Alicante", "Valencia", "Madrid", "Salamanca", "Madrid" };

		System.out.println("Las provincias comunes en las dos listas son: ");
		for (int i = 0; i < prov1.length; i++) {
			boolean printed = false;
			
			for (int j = 0; j < prov2.length; j++) {

				if (prov1[i] != null && prov1[i].equalsIgnoreCase(prov2[j])) {
					System.out.println(prov1[i]);
					prov2[j] = null;
					printed = true;
				}

				if (printed) {
					for (int k = i + 1; k < prov1.length; k++) {
						if (prov1[k] != null && prov1[k].equalsIgnoreCase(prov1[i])) {
							prov1[k] = null;
						}
					}
				}

			}
		}
	}



}
