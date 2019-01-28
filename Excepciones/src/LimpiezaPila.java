
public class LimpiezaPila {

	public static void main(String[] args) {
		try {
			
			metodo1();
			
		} catch (Exception excepcion) {
			
			System.err.printf("%s%n%n", excepcion.getMessage()); // El método getMessage devuelve la cadena descriptiva almacenada en una excepción clase throwable - imprimo el siguiente mensaje : Excepción generada en el método 3 
			excepcion.printStackTrace(); // este java.lang.Exception: Excepción generada en el método 3 hace parte de printStackTrace -> Envía el flujo de error standard al rastreo de la pila
			
			StackTraceElement[] elementoRastreo =  excepcion.getStackTrace(); // Devuelve cada uno de los elementos del StackTraceElement - Devuelve un arreglo con los elementos stackTrace - imprimo la pila de llamadas a métodos
			
			System.out.println("\nRastreo de la pila de getStackTrace:\n");
			System.out.println("Clase \t\tArchivo\t\t\tlínea\tMétodo");
			
			//Itera a través de elementosRastreo para obtener la descripción de la excepción
			
			for (StackTraceElement elemento: elementoRastreo) {
				System.out.printf("%s\t", elemento.getClassName());
				System.out.printf("%s\t", elemento.getFileName());
				System.out.printf("%s\t", elemento.getLineNumber());
				System.out.printf("%s\n", elemento.getMethodName());
			}
			
		}
	}
	
	public static void metodo1() throws Exception {
		metodo2();
	}
	
	public static void metodo2() throws Exception {
		metodo3();
	}
	
	public static void metodo3() throws Exception {
		throw new Exception("Excepción generada en el método 3 ");
	}
}
