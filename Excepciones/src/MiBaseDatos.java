
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MiBaseDatos {
	
	Connection conn = null;
	PreparedStatement prepSt = null;
	ResultSet rs = null;
	
	public MiBaseDatos() {
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		}
		
	}
	
	public void insertarCategoriaProducto(CategoriaProd categoria) {
		try {
			conn = DriverManager.getConnection("jdbc:postgresql://localhost5432/db-sistema", "postges", "123");
			String sql = "INSERT INTO cat_categorias(nom_categoria_prod, desc_categoria_prod)" + "values(?,?)";
			
			System.out.println("conexion: " + conn);
			
			prepSt = conn.prepareStatement("sql");
			prepSt.setString(1, categoria.getNomCategoriaProd());
			prepSt.setString(2, categoria.getNomCategoriaProd());
			
			prepSt.executeUpdate();
			
		} catch (SQLException ex) {
			ex.printStackTrace();
		}finally {
			
		}
	}
	
	public static void main(String[] args) {
		CategoriaProd categoria = new CategoriaProd(5, "Frutas", "Segunda descripción");
		
		MiBaseDatos base = new MiBaseDatos();

		base.insertarCategoriaProducto(categoria);
	}
}
