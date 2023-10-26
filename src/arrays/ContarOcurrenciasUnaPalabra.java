package arrays;

public class ContarOcurrenciasUnaPalabra {

	public static void main(String[] args) {

		// saber cuántas veces aparece Sergio dentro del array
		String[] nombres = { "Fátima", "Sergio", "Jesús", "Sergio", "Salvatore" };
		int cont = 0;

		for (int i = 0; i < nombres.length; i++) {
			if (nombres[i].equalsIgnoreCase("Sergio")) {
				cont++;
			}
		}
		
		System.out.println("Sergio aparece " +  cont + " veces en el array nombres");
	}



}
