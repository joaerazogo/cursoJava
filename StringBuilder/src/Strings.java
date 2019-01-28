
public class Strings {
	
	public static void main(String[] args) {
		
		//Los objetos String no tienen forma de destruirse o ser cambiados
		//hola y hola2 son referencias
		String hola = "hola";// este es un objeto que ocupa una proción de memoria ram, dicho objeto cotiene el valor hola 
		String hola2 = hola;
		
		hola = "adios";
		System.out.println("hola es: " + hola);
		System.out.println("hola2 es: " + hola2);
		hola2 = hola;
		System.out.println("Ahora hola2 es: " + hola2);
		
	}
}
