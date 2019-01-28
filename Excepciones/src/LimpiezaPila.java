
public class LimpiezaPila {

	public static void main(String[] args) {
		try {
			
			metodo1();
			
		} catch (Exception excepcion) {
			
			System.err.printf("%s%n%n", excepcion.getMessage()); // El m�todo getMessage devuelve la cadena descriptiva almacenada en una excepci�n clase throwable - imprimo el siguiente mensaje : Excepci�n generada en el m�todo 3 
			excepcion.printStackTrace(); // este java.lang.Exception: Excepci�n generada en el m�todo 3 hace parte de printStackTrace -> Env�a el flujo de error standard al rastreo de la pila
			
			StackTraceElement[] elementoRastreo =  excepcion.getStackTrace(); // Devuelve cada uno de los elementos del StackTraceElement - Devuelve un arreglo con los elementos stackTrace - imprimo la pila de llamadas a m�todos
			
			System.out.println("\nRastreo de la pila de getStackTrace:\n");
			System.out.println("Clase \t\tArchivo\t\t\tl�nea\tM�todo");
			
			//Itera a trav�s de elementosRastreo para obtener la descripci�n de la excepci�n
			
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
		throw new Exception("Excepci�n generada en el m�todo 3 ");
	}
}
