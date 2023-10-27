package arrays;

public class BuscarPalabrasCasoRepetidas2 {

	public static void main(String[] args) {
		String[] prov1 = { "Madrid", "Barcelona", "Sevilla", "Madrid", "Valencia" };
		String[] prov2 = { "Alicante", "Valencia", "Madrid", "Salamanca", "Madrid", "otra" };

		System.out.println("Las provincias comunes en las dos listas son: ");

		for (int i = 0; i < prov1.length; i++) {
			for (int j = 0; j < prov2.length; j++) {
				if (prov2[j] != null && prov1[i].equalsIgnoreCase(prov2[j])) {

					// Verificar si ya hemos impreso esta provincia
					boolean yaImpresa = false;
					//mientras que k sea menor que ir
					for (int k = 0; k < i; k++) {
						if (prov1[k] != null && prov1[k].equalsIgnoreCase(prov1[i])) {
							yaImpresa = true;
							break;
						}
					}

					if (!yaImpresa) {
						System.out.println(prov1[i]);
					}

					prov2[j] = null; // Anular la provincia en prov2 para evitar duplicados
					break; // Salir del bucle interno ya que hemos encontrado una coincidencia
				}
			}
		}
	}

}
