import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionPorCero {
	
	
	public static int cociente(int numerador, int denominador) throws ArithmeticException{
		
		return numerador/denominador;

	}
	
	public static void main(String[] args) {
		Scanner explorador = new Scanner(System.in);
		boolean continuarCiclo = true;
		DivisionPorCero dvpc = new DivisionPorCero();
		
		do {
			try {

				System.out.print("Ingrese el numerador: ");
				int numerador = explorador.nextInt();
				
				System.out.print("Ingrese el denominador: ");
				int denominador = explorador.nextInt();

				int resultado = cociente(numerador, denominador);
				
				System.out.printf("%nResultado: %d / %d = %d%n", numerador, denominador, resultado);
				
				continuarCiclo =  false;

			} catch (InputMismatchException inputMismatchException) {
				
				System.err.printf("%nExcepcion: %s%n", inputMismatchException);
				explorador.nextLine();
				
			}catch (ArithmeticException arithmeticException) {
				
				System.err.printf("%nExcepcion: %s%n", arithmeticException);
				System.out.printf("Cero es un denominador inválido, intente otro número %n%n");				
			}
			
		} while (continuarCiclo);
				
	}

}
