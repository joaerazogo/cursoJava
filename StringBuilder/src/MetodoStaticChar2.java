import java.util.Scanner;

public class MetodoStaticChar2 {

	public static void main(String[] args) {
		
		//obtiene la raiz
		System.out.println("Escriba una ra�z"); //puede ser en formato decimal, binario, hexadecimal u octal
		Scanner scanner = new Scanner(System.in);
		int raiz = scanner.nextInt();
		
		// Obtiene la selecci�n del usuario
		System.out.printf("Seleccione una opci�n %n1 -- %s%n2 -- %s%n", "Convertir d�gito a caracter",
				"Convertir caracter a d�gito");
		
		int opcion = scanner.nextInt();
		
		//procesa la petici�n
		switch (opcion) {
			case 1: //convierte d�gito a caracter
				System.out.println("Escriba un d�gito");
				char digito = scanner.next().charAt(0);
				System.out.printf("Convertir d�gito a caracter: %s%n", Character.forDigit(digito, raiz));
				break;
			case 2: //convierte d�gito a caracter
				System.out.println("Escriba un caracter");
				char caracter = scanner.next().charAt(0);
				System.out.printf("Convertir caracter a d�gito: %s%n", Character.digit(caracter, raiz));
				break;
			default:
				break;
			}

	}

}