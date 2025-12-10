import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ComandoInsert{

    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5433/credenciales";
        String usuario= "admin";
        String contraseña= "root";

        try {
            Class.forName("org.postgresql.Driver");
            try(Connection conn = DriverManager.getConnection(url, usuario, contraseña)){
                String insertar = "INSERT INTO usuarios(nombre, correo, telefono, fecha_nacimiento) VALUES (?,?,?,?)";
                try(PreparedStatement pstmt = conn.prepareStatement(insertar)){
                    pstmt.setString(1, "Enrique");
                    pstmt.setString(2,"correo@ejemplo.com");
                    pstmt.setString(3,"numero_te");
                    java.sql.Date fecha = java.sql.Date.valueOf("1985-01-15");
                    pstmt.setDate(4,fecha);

                    int filas = pstmt.executeUpdate();
                    System.out.println("Número de actualizaciones: "+ filas); 
                }
            }
        }catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }
    
    }
}