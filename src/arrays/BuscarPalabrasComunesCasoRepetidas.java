package arrays;

public class BuscarPalabrasComunesCasoRepetidas {

	public static void main(String[] args) {

		String[] prov1 = { "Madrid", "Sevilla", "Sevilla", "null", "Valencia", "Sevilla", "Salamanca"};
		String[] prov2 = { "Alicante", "Valencia", "Madrid", "Salamanca", "Madrid", "Sevilla" };

		System.out.println("Las provincias comunes en las dos listas son: ");

		for (int i = 0; i < prov1.length; i++) {

			if (prov1[i] != null) {
				boolean encontrada = false;

				for (int j = 0; j < prov2.length && !encontrada; j++) {

					if (prov2[j] != null && prov1[i].equalsIgnoreCase(prov2[j])) {
						System.out.println(prov1[i]);
						prov2[j] = null;
						encontrada = true;
					}

					if (encontrada) {
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

}
