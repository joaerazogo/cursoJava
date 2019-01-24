package ConceptosBasicos;

public class EtiquetaArreglos {
	
	public static void main(String[] args) {
		
		int ventas[][] = {{1, 2, 4},
				          {4, 6, 8},
				          {10, 3, 6},
				          {4, 5, 8},
				          {1, 2, 1},
				          {4, 3, 2},
				          {3, 12, 14}};
		
		ArrayClassExercise arrayObject = new ArrayClassExercise(); 
		arrayObject.showResultPointTwo(ventas);
		
	}
}
