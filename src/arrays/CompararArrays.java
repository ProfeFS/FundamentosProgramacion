package arrays;

public class CompararArrays {

	public static void main(String[] args) {

		int[] numeros1 = { 10, 20, 30, 40, 50 };
		int[] numeros2 = { 10, 20, 30, 40, 50 };
		
		boolean sonIguales=true;
		
		
		if(numeros1.length == numeros2.length) {			
			
			for(int i=0; i<numeros1.length && sonIguales!=false ; i++) {
				if(numeros1[i] != numeros2[i]) {
					sonIguales=false;
				}
			}
			
		}else {
			sonIguales=false;
		}
		
		//operadores terneareos
		String mensaje= sonIguales? "Iguales" : "Son diferentes";
		
		//es lo mismo que hacerlo de esta forma
		if(sonIguales) {
			mensaje ="Iguales";			
		}else {
			mensaje ="diferentes";	
		}
			
		
		System.out.println("Los arrays son " + mensaje);
		
			
		
		
	}

}
