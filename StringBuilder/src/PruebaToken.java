import java.util.Scanner;

public class PruebaToken {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Escriba un enunciado y oprima enter");
		String enunciado = scanner.nextLine(); 
		
		//procesa el enunciado del ususario
		
		String[] tokens = enunciado.split(" ");
		System.out.printf("Número de elementos: %d%nLos tokens son: %n", tokens.length);
		
		for(String token: tokens) {
			System.out.println(token);
		}

		scanner.close();
		
	}

}
