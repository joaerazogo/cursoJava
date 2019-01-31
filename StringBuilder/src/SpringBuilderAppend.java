
public class SpringBuilderAppend {

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

		StringBuilder ultimoBuffer = new StringBuilder("ultimo buffer");
		StringBuilder buffer = new StringBuilder();

		buffer.append(refObject).append("\n").append(cadena).append("\n").append(arregloChar).append("\n")
				.append(valorBooelan).append("\n").append(valorChar).append("\n").append(valorInt).append("\n")
				.append(valorLong).append("\n").append(valorFloat).append("\n").append(valorDouble).append("\n")
				.append(ultimoBuffer);

		System.out.printf("buffer contiene%n%s%n", buffer.toString());

		// El compilador puede usar StringBuilder y métodos append para implementar los
		// operadores
		// + y += de concatenación String
		
		String s = new StringBuilder().append("hola").append("BC").append(22).toString();
		
		//La instrucción s +="!"
		//puede ser realizada en StringBuilder de la siguiente manera
		
		s = new StringBuilder().append(s).append("!").toString();
		
		System.out.printf("%s", s);

	}

}
