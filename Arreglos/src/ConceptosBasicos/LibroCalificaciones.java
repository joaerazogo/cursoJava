package ConceptosBasicos;

public class LibroCalificaciones {
	private String nombreDelCurso;
	private int[][] calificaciones;
	
	public LibroCalificaciones(String nombreDelCurso, int[][]calificaciones) {
		
		this.nombreDelCurso = nombreDelCurso;
		this.calificaciones = calificaciones;
		
	}
	
	public void setNombreDelCurso(String nombreDelCurso) {
		this.nombreDelCurso = nombreDelCurso;
	}
	
	public String getNombreDelCurso() {
		return this.nombreDelCurso;
	}
	
	public void procesaCalificaciones() {
		
		imprimirCalificaciones();
		System.out.printf("%n%s %d%n%s %d", "La calificaci�n m�s baja en el libro de calificaciones es: ", obtenerMinina(), "La calificaci�n m�s alte en el libro de calificaciones es: ", obtenerMaxima());
		System.out.println("");
		
		imprimirGraficoBarras();
		
	}
	
	public int obtenerMinina() {
		
		int califBaja = calificaciones[0][0];
		
		for (int[] califEstudiantes: calificaciones) {
			
			for (int calificacion : califEstudiantes) {
				
				if (calificacion < califBaja) {
					
					califBaja = calificacion;
					
				}
			}
		}
		
		return califBaja;
	}
	
	public int obtenerMaxima() {
		
		int califMaxima = calificaciones[0][0];
		
		for (int[] califEstudiantes: calificaciones) {
			
			for (int calificacion : califEstudiantes) {
				
				if (calificacion > califMaxima) {
					
					califMaxima = calificacion;
					
				}
			}
		}
		
		return califMaxima;
	}
	
	public void imprimirCalificaciones(){
		
		System.out.printf("Las calificaciones son: %n%n");
		System.out.print("             ");
		
		for (int prueba = 0; prueba < calificaciones[0].length; prueba++) {
			System.out.printf("Prueba %d ", prueba + 1);
		}
		
		System.out.println("Promedio");
		
		for (int estudiante = 0; estudiante < calificaciones.length; estudiante++) {
			
			System.out.printf("Estudiante %2d ", estudiante + 1);
			
			for (int prueba : calificaciones[estudiante]) {
				System.out.printf("%8d", prueba);
			}
			
			double promedio = obtenerPromedio(calificaciones[estudiante]);
			System.out.printf("%9.2f%n", promedio);
			
		}
	}
	
	public double obtenerPromedio(int[] consjuntoDeCalif) {
		int total = 0;
		
		for (int calificacion: consjuntoDeCalif) {
			total += calificacion;
		}
		
		return (double) total / consjuntoDeCalif.length;
	}
	
	public void imprimirGraficoBarras() {
		
		System.out.println("Distribuci�n de calificaciones en general");
		
		int[] frecuencia = new int[11];
		
		for (int[] califEstudiantes : calificaciones) {
			for (int calificacion : califEstudiantes) {
				++frecuencia[calificacion/10];
			}
		}
		
		for (int cuenta = 0; cuenta < frecuencia.length; cuenta++) {
			
			if (cuenta == 10) {
				System.out.printf("%5d: ", 100);
			}
			else {
				System.out.printf("%02d-%02d: ", cuenta * 10, cuenta * 10 + 9);
			}
			
			for (int estrellas = 0; estrellas < frecuencia[cuenta]; estrellas++) {
				System.out.print("*");
			}
			
			System.out.println("");
		}
	}
}

