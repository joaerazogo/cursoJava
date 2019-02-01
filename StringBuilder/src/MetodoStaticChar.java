import java.util.Scanner;

public class MetodoStaticChar {

	public static void main(String[] args) {

		// La mayoría de los métodos de la clase Character son statics diseñados para
		// facilitar el procesamiento de valores char individuales
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Escriba un caracter y oprima intro");
		String entrada = scanner.next();
		char c = entrada.charAt(0); //obtiene el caracter de entrada
		
		//muestra información sobre los caracteres 
		
		System.out.printf("esta definido %b%n", Character.isDefined(c));
		System.out.printf("es digito: %b%n", Character.isDigit(c));
		System.out.printf("es el primer caracter en un identificador de java %b%n", Character.isJavaIdentifierPart(c));
		System.out.printf("es parte de un identificador de Java %b%n", Character.isJavaIdentifierPart(c));
		System.out.printf("es letra: %b%n", Character.isLetter(c));
		System.out.printf("es letra o digito: %b%n", Character.isLetterOrDigit(c));
		System.out.printf("en minúscula: %b%n", Character.isLowerCase(c));
		System.out.printf("en mayúscula: %b%n", Character.isUpperCase(c));
		System.out.printf("convierte a mayúscula: %b%n", Character.toUpperCase(c));
		System.out.printf("convierte a minúscula: %b%n", Character.toLowerCase(c));

	}

}
