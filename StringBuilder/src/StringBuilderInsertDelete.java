
public class StringBuilderInsertDelete {
	
	public static void main(String[] args) {

		Object refObject = "hola";
		String cadena = "adios";
		char[] arregloChar = { 'a', 'b', 'c', 'd', 'e', 'f' };
		boolean valorBooelan = true;
		char valorChar = 'z';
		int valorInt = 7;
		long valorLong = 100000000000L;
		float valorFloat = 2.5f;
		double valorDouble = 33.33;

		StringBuilder buffer = new StringBuilder();
		
		buffer.insert(0, refObject)
			  .insert(0, "  ")
			  .insert(0, cadena)
			  .insert(0, "  ")
			  .insert(0, arregloChar)
			  .insert(0, "  ")
			  .insert(0, valorBooelan)
			  .insert(0, "  ")
			  .insert(0, valorChar)
			  .insert(0, "  ")
			  .insert(0, valorInt)
			  .insert(0, "  ")
			  .insert(0, valorLong)
			  .insert(0, "  ")
			  .insert(0, valorFloat)
			  .insert(0, "  ")
			  .insert(0, valorDouble);
		
		System.out.printf("buffer después de insertar:%n%n%s%n", buffer.toString());
		
		buffer.deleteCharAt(9); //Elimina el 5 en 2.5
		buffer.delete(2, 6); //elimina el .333 en 33.333
		
		System.out.printf("buffer después de eliminar:%n%n%s%n", buffer.toString());

	}
		
}
