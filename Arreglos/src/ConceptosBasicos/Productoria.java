package ConceptosBasicos;

public class Productoria {
	
	public static void main(String[] args) {
		
		int a = 2;
		int b = 4;
		int c = 5;
		int d = 6;
		int e = 7;
		int f = 11;
		
		System.out.printf("a = %d%nb = %d%nc = %d%nd = %d%ne = %d%nf = %d%n", a, b, c, d, e, f);
		
		System.out.println("La productoria del arreglo es: " +  productoria(a, b, c, d, e, f)); 
	}
	
	public static int productoria(int ... numeros){
		
		int bandera = 1;
		for (int elemento: numeros) {
			bandera = bandera*elemento;
		}
		
		return bandera;
	}
	
	
}
