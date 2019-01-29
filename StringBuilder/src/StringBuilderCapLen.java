
public class StringBuilderCapLen {

	public static void main(String[] args) {

		StringBuilder buffer = new StringBuilder("Hola, como estás?");

		// el método length proporciona el tamaño de la cadena de caracteres contenida
		// en el objeto StringBuilder
		
		System.out.printf("buffer = %s%nlongitud = %d%ncapacidad = %d%n", buffer.toString(), buffer.length(), buffer.capacity());
		
		buffer.ensureCapacity(75);
		System.out.printf("nueva capacidad = %d%n%n", buffer.capacity());
		
		buffer.setLength(10);
		System.out.printf("nueva longitud = %d%nbuffer = %s%n", buffer.length(), buffer.toString());
		
	}

}
