package repaso_con_metodos;

public class IniciacionMetodos {
	
	public String nombreNoStatic = "Gynny";
	public static String nombreStatic = "Gynny";

	public static void main(String[] args) {
		
		
		IniciacionMetodos obj = new IniciacionMetodos();
		obj.saluda();
		
		saludaStatic();
		
		System.out.println("Mi nombre es: " + nombreStatic);
		System.out.println("Mi nombre es: " + obj.nombreNoStatic);
		

	}
	
	public void saluda() {
		System.out.println("Hola, soy la profe y me llamo " + nombreNoStatic + ", " + nombreStatic);
	}
	
	public static void saludaStatic() {
		System.out.println("Hola, soy la profe y también me llamo: " + nombreStatic);
	}

}
