package ConceptosBasicos;

public class LanazamientoDados {

	public static void main(String[] args) {
		
		int minimum = 1, maximum = 6, primerDado, segundoDado;
		int[] vectorNumeros = new int[36000000];
		int sumaResultado;
		
		System.out.print("             ");
		/*
		for (int lanzamiento = 0; lanzamiento < 2; lanzamiento++) {
			System.out.printf("dado %d     ", lanzamiento + 1);
		}
		 
		System.out.println(" suma");
		*/
		System.out.println("");
		
		for (int i = 0; i < 36000000; i++) {
			
			primerDado = minimum + (int)(Math.random() * maximum);
			segundoDado = minimum + (int)(Math.random() * maximum);
			
			//System.out.printf("intento %d", i+1);
			//System.out.printf("         %d          %d         %d%n", primerDado, segundoDado, primerDado + segundoDado);
			sumaResultado = primerDado + segundoDado;
			vectorNumeros[i] = sumaResultado;
			
		}
		
		LanazamientoDados operacionDados = new LanazamientoDados();
		operacionDados.calcularCantidadResultados(vectorNumeros);
		
	}
	
	public static void calcularCantidadResultados(int[] vectorNumeros) {
		
		int valorDos = 0, valorTres = 0, valorCuatro = 0, valorCinco = 0, valorSeis = 0, valorSiete = 0, valorOcho = 0, valorNueve = 0, valorDiez = 0, valorOnce = 0, valorDoce = 0;
		String valorExtraño;
		
		for (int i = 0; i < vectorNumeros.length; i++) {
			
			switch (vectorNumeros[i]) {
		        case 2:  valorDos++;
		                 break;
		        case 3:  valorTres++;
		                 break;
		        case 4:  valorCuatro++;
		                 break;
		        case 5:  valorCinco++;
		                 break;
		        case 6:  valorSeis++;
		                 break;
		        case 7:  valorSiete++;
		                 break;
		        case 8:  valorOcho++;
		                 break;
		        case 9:  valorNueve++;
		                 break;
		        case 10: valorDiez++;
		                 break;
		        case 11: valorOnce++;
		                 break;
		        case 12: valorDoce++;
		                 break;
		        default: valorExtraño = "Valor extraño";
	                 break;
			}
		}
		
		System.out.println("Resultados");

		System.out.println("Total de 2's: " + valorDos);
		System.out.println("Total de 3's: " + valorTres);
		System.out.println("Total de 4's: " + valorCuatro);
		System.out.println("Total de 5's: " + valorCinco);
		System.out.println("Total de 6's: " + valorSeis);
		System.out.println("Total de 7's: " + valorSiete);
		System.out.println("Total de 8's: " + valorOcho);
		System.out.println("Total de 9's: " + valorNueve);
		System.out.println("Total de 10's: " + valorDiez);
		System.out.println("Total de 11's: " + valorOnce);
		System.out.println("Total de 12's: " + valorDoce);
		
	}
}
