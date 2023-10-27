package arrays;

public class MexclarArrays {

	public static void main(String[] args) {
		
		String[] frutas1= {"Peras", "Manzanas", "Arándanos", "Mango"};
		String[] frutas2= {"Quiwi", "Fresas", "Frambuesas"};
		
		String[] mixedFruits = new String[frutas1.length+frutas2.length];
		int j=0;
		
		int maxlenth;
		//maxlenth = frutas1.length > frutas2.length? frutas1.length: frutas2.length;

		
		//la expresión de arriba es lo mismo que hacer lo siguiente:
		if(frutas1.length > frutas2.length) {
			maxlenth = frutas1.length;
		}else {
			maxlenth = frutas2.length;
		}
		
		for(int i=0; i< maxlenth; i++) {
			
			if(i < frutas1.length) {
				mixedFruits[j]= frutas1[i];
				j++;
			}			
			
			if(i < frutas2.length) {
				mixedFruits[j] = frutas2[i];
				j++;
			}
		
			
			
		}
		
		for(int i=0; i< mixedFruits.length; i++) {
			System.out.print(mixedFruits[i] + " |");
		}

	}

}
