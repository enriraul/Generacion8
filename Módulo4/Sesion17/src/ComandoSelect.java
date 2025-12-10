
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
/* 
Compilación: 
javac -cp "bin;lib/postgresql-42.7.5.jar" -d bin src/ComandoSelect.java

Ejecución:
java -cp "bin;lib/postgresql-42.7.5.jar" src/ComandoSelect.java 
*/

public class ComandoSelect{

    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5433/credenciales";
        String usuario= "admin";
        String contraseña= "root";

        try {
            Class.forName("org.postgresql.Driver");
            try(Connection conn = DriverManager.getConnection(url, usuario, contraseña)){
                String consulta = "Select * from usuarios";
                try(
                    Statement stmt = conn.createStatement();
                    ResultSet rs = stmt.executeQuery(consulta);
                ){
                    while (rs.next()) {
                       int id = rs.getInt("id_usuario");
                       String nombre = rs.getString("nombre");
                       String correo = rs.getString("correo");
                       String telefono = rs.getString("telefono");
                       String fecha_nacimiento = rs.getString("fecha_nacimiento");
                       String mensaje = String.format(
                        """
                        Datos del usuario:
                        id: %d
                        Nombre: %s
                        Correo: %s
                        Telefono: %s
                        Fecha de Nacimiento: %s
                       """, id , nombre, correo, telefono, fecha_nacimiento);
                        System.out.println(mensaje);
                    }
                } 
            }
        } catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
        }
    }
}