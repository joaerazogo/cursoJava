
public class LanzamientoExcepciones {

	public static void main(String[] args) {
		
		try {
			lanzaExcepcion(-1);
		} catch (Exception e) {
			System.err.println("La excepción se maneja en el main ");
			System.err.println(e);
		}
		
		noLanzaExcepcion();
	}
	
	public static void lanzaExcepcion(int numeroMayorQuecero) throws Exception {
		
		if (numeroMayorQuecero < 0) {
			throw new Exception("El método lanza una excepción no puede recibir números menores que cero");
		}
		
		/*try {
			
			System.out.println("Método LanzaExcepción");
			throw new Exception();
			
		} catch (Exception excepcion) {
			
			System.err.println("La excepción se manejó en el método lanzaExcepción");
			throw excepcion;
		}*/
	}
	
	public static void noLanzaExcepcion() {
		try {
			System.out.println("Método noLanzaExcepcion");
		} catch (Exception excepcion) {
			System.err.println(excepcion);
		}finally {
			System.err.println("Se ejecutó finally en noLanzaExcepcion");
		}
		
		System.out.println("fin del método noLanzaExcepcion");
	}
	
	
}
