package ConceptosBasicos;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayClassExercise {

	int conteoNumeros = 0;
	
	public ArrayList<Integer> arrayComputed(){
		
		ArrayList<Integer> listaNumeros = new ArrayList<Integer>();
		
		while(true) {
			
			//Validaciones para construir el arreglo de 5 elementos 
			System.out.println("Por favor ingrese los 5 números deben estar entre 10 a 100");
			Scanner leerNumero = new Scanner(System.in);
			int numero = leerNumero.nextInt();
			
			if (numero >= 10 && numero <= 100) {
				
				//arrayNumber.buildArray(numero);
				if (listaNumeros.isEmpty()) {
					
					listaNumeros.add(numero);
					conteoNumeros++;
					
				}else {
					
					int bandera = 1;
					for (int i = 0; i < listaNumeros.size(); i++) {
						if (numero == listaNumeros.get(i)) {
							System.out.println("El número ya está en la lista");
							bandera = 0;
						}
					}
					
					if (bandera == 1) {
						listaNumeros.add(numero);
						conteoNumeros++;
					}
				}
				
			}else {
				System.out.println("Por favor ingrese un número entre cero y cien");
			}
			
			if (conteoNumeros == 5) {
				break;
			}
			
		}
		return listaNumeros;

	}
	
	public void showResult(ArrayList numberIntegers) {
		
		System.out.println("====================================================");
		System.out.println("====================================================");
		System.out.println("====================================================");
		System.out.println("====================================================");
		System.out.println("====================================================");
		
		for (int i = 0; i < numberIntegers.size(); i++) {
			System.out.printf("En la posición %d es el elemento %d%n", i, numberIntegers.get(i));
		}
		
	}
	
	public void showResultPointTwo(int[][] sales) {
		
		System.out.println("Las ventas en el mes fueron");
		
		System.out.print("             ");
		
		for (int venta = 0; venta < sales[0].length; venta++) {
			System.out.printf("venta %d     ", venta + 1);
		}
		System.out.println("");
		int conteo = 0;
		
		for (int[] salesForMounth: sales) {
			
			System.out.printf("Mes   %d: ", conteo++);
			
			for (int totalSales: salesForMounth) {
				System.out.printf("%9d ", totalSales);
				
			}
			System.out.println("");
		}
		
	}
	
}
	

