package ConceptosBasicos;

public class Arreglos {

	public static void main(String[] args) {
		
		System.out.println(" ARREGLOS UNIDIMENSIONALES ");
		
		int c [] = {3,3,4,5,6,4,3,4,5,4,5,6,7,8,9,1};
		int a, b;
		a = 5;
		b = 6;
		
		c[a+b] += 6;
		c[11] += 2 ;
		
		int[] cc = new int[6];
		int[] cccc = {4,5,6,4,3,5,5};
		boolean [] bool = new boolean[3];
		Object[] d = new Object[5];
		int cmd[] = {1,2,3,4,5,6};
		
		for(int i= 0; i < c.length; i++){
			System.out.println("ccc " + c[i] + " --------- " + i); 
		}
		
		System.out.println(" ARREGLOS MULTIDIMENSIONALES ");
		
		int[][] arregloMultidimensional = {{1,2},{3,4},{3,7,8,9,1}};
		arregloMultidimensional[0][0]  = 1;
		arregloMultidimensional[0][1]  = 2;
		arregloMultidimensional[1][0]  = 3;
		arregloMultidimensional[1][1]  = 4;
		arregloMultidimensional[2][0]  = 5;
		arregloMultidimensional[2][1]  = 6;
		
		int [] ac = {1,2};
		int [][] mb = new int[3][4];
		
		mb[0] = new int[5];
		mb[1] = new int[6];
		
		int[][] arregloMultidimensional1 = {{1,2,3},{4,5,6}};
		
		for (int fila = 0; fila < arregloMultidimensional1.length; fila++) {
			for (int columna = 0; columna < arregloMultidimensional1[fila].length; columna++) {
				System.out.println(arregloMultidimensional1[fila][columna]);
			}
		}
		
		System.out.println("prueba de estudiantes");
		
		
	}

}
