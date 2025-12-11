import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DreamsDB{
    private Connection conn;
    private String url = "jdbc:postgresql://localhost:5433/credenciales";
    private String usuario ="admin";
    private String contraseña = "root";
    
    public DreamsDB(){
        try {
            Class.forName("org.postgresql.Driver");
            this.conn = DriverManager.getConnection(url, usuario, contraseña);
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error: "+e.getMessage());
        }
    }

    public void mostrarInventario(){
        String consulta = "Select * from productos";
        try(
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(consulta);
        ){
            while (rs.next()) {
                
            }
        }catch (SQLException e) {
            System.out.println("Error: "+e.getMessage());
        }
    }

}