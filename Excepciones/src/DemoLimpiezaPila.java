
public class DemoLimpiezaPila {

	public static void main(String[] args) {
		
		new DemoLimpiezaPila().metodo1();

	}
	
	public void metodo1() {
		
		try {
			metodo5();
		} catch (Exception e) {
			System.out.println(e.getMessage() + "pero tratada en el metodo 1");
		}

	}
	
	public void metodo5() throws Exception{
		metodo4();
	}
	
	public void metodo4() throws Exception{
		metodo2();
	}
	
	public void metodo2() throws Exception{
		
		try {
			metodo3();
		} catch (Exception e) {
			System.err.println(e.getMessage() + " pero tratada en el metodo 2 ");
			throw e;
		}
		
		
	}
	
	public void metodo3() throws Exception{
		try {
			throw new Exception("Excepción generada en el método 3 ");
		} catch (Exception e) {
			System.err.println("la excepcion se trató en el método 3 ");
			throw e;
		}
		
		
	}
	
}
