package arrays;

public class BuscarPalabrasComunes3 {

	public static void main(String[] args) {	

		String[] prov1 = { "Madrid", "Barcelona", "Sevilla", "Toledo", "Valencia" };
		String[] prov2 = { "Alicante", "Valencia", "Asturias", "Salamanca", "Madrid" };

		System.out.println("Las provincias comunes en las dos listas son: ");
		for (int i = 0; i < prov1.length; i++) {
			for (int j = 0; j < prov2.length; j++) {
				if (prov1[i].equalsIgnoreCase(prov2[j])) {
					System.out.println(prov1[i]);
				}
			}
		}
	}



}
