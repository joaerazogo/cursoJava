
public class StringBuilderChars {
	
	public static void main(String[] args) {
		
		StringBuilder buffer = new StringBuilder("hello everyone");
		System.out.printf("Buffer = %s%n", buffer.toString());
		System.out.printf("Caracter en 0: %s%nCaracter en 3: %s%n%n", buffer.charAt(0), buffer.charAt(3));
		
		char[] arreglochars = new char[buffer.length()];
		buffer.getChars(0, buffer.length(), arreglochars, 0);
		System.out.print("Los caracteres son: ");
		
		for(char caracter: arreglochars) {
			System.out.print(caracter);
		}
		
		buffer.setCharAt(0, 'H');
		buffer.setCharAt(7, 'T');
		System.out.printf("%n%nbuffer = %s", buffer.toString());
		
		buffer.reverse();
		System.out.printf("%n%nbuffer = %s%n", buffer.toString());
	}
	
}
