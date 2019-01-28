
public class ConstructorStringBuilder {

	public static void main(String[] args) {

		// El constructor sin argumentos tienen una capacidad inicial de 16 caracteres
		// (valor predeterminado de StrinBuilder)
		StringBuilder buffer1 = new StringBuilder();

		// El constructor que recibe como argumento un número entero, crea un
		// StringBuilder que no contiene caracteres,
		// y su capacidad inicial es de 10 caracteres en este caso.
		StringBuilder buffer2 = new StringBuilder(10);

		// Este constructor recibe un argumento String para crear un objeto
		// StringBuilder que contiene los caracteres
		// en el argumento String. La capacidad inicial es el número de caracteres en el
		// argumento string, más 16
		StringBuilder buffer3 = new StringBuilder("hola");

		// Impresión con formato, se llama implícitamente el método toString de los
		// objetos StrinBuilder buffer1, buffer2 y buffer3
		
		System.out.printf("buffer1 = \"%s\"%n", buffer1);
		System.out.printf("buffer2 = \"%s\"%n", buffer2);
		System.out.printf("buffer3 = \"%s\"%n", buffer3.reverse());

	}

}