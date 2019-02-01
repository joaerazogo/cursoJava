import java.util.Scanner;

public class MetodoStaticChar2 {

	public static void main(String[] args) {
		
		//obtiene la raiz
		System.out.println("Escriba una raíz"); //puede ser en formato decimal, binario, hexadecimal u octal
		Scanner scanner = new Scanner(System.in);
		int raiz = scanner.nextInt();
		
		// Obtiene la selección del usuario
		System.out.printf("Seleccione una opción %n1 -- %s%n2 -- %s%n", "Convertir dígito a caracter",
				"Convertir caracter a dígito");
		
		int opcion = scanner.nextInt();
		
		//procesa la petición
		switch (opcion) {
			case 1: //convierte dígito a caracter
				System.out.println("Escriba un dígito");
				char digito = scanner.next().charAt(0);
				System.out.printf("Convertir dígito a caracter: %s%n", Character.forDigit(digito, raiz));
				break;
			case 2: //convierte dígito a caracter
				System.out.println("Escriba un caracter");
				char caracter = scanner.next().charAt(0);
				System.out.printf("Convertir caracter a dígito: %s%n", Character.digit(caracter, raiz));
				break;
			default:
				break;
			}

	}

}