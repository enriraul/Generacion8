import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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


    /* 

        Información del Cliente
    
    */
    public boolean Login(String nombre, String correo){
        boolean login= false;
        String loginQuery = String.format("Select * from cliente where nombre = %s and correo= % s", nombre, correo);

        try(
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(loginQuery);
        ){
            if (rs!=null) {
                return login = true;
            }
        }catch (SQLException e) {
            System.out.println("Error: "+e.getMessage());
        }
    
        return login;
    }

    public void CrearCliente(String nombre, String correo){
        String crearCliente = "INSERT INTO cliente(nombre, correo) VALUES (?,?)";
        try (PreparedStatement pstmt = conn.prepareStatement(crearCliente)){
            pstmt.setString(1,nombre);
            pstmt.setString(2,correo);
            int resultado= pstmt.executeUpdate();

        } catch (SQLException e) {
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
                int idProducto = rs.getInt("idproducto");
                String nombre = rs.getString("nombre");
                String categoria = rs.getString("categoria");
                float precio = rs.getFloat("precio");
                int stock = rs.getInt("stock");
                /*Editar mensaje */
            }
        }catch (SQLException e) {
            System.out.println("Error: "+e.getMessage());
        }
    }

    public Producto getProducto(int idproducto, int cantidad){
        Producto producto=null;
        String consulta = String.format("Select * from productos where idproducto = %d", idproducto);
        try(
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(consulta);
        ){
            if(rs.next()) {
                int idProducto = rs.getInt("idproducto");
                String nombre = rs.getString("nombre");
                String categoria = rs.getString("categoria");
                float precio = rs.getFloat("precio");
                int stock = rs.getInt("stock");
                if (stock >= cantidad) {
                    producto = new Producto(idProducto, nombre,precio, categoria, stock);
                }
                else{
                    System.out.println("Actualmente no contamos con la cantidad suficiente para su solicitud");
                }
            }
            return producto;
        }catch (SQLException e) {
            System.out.println("Error: "+e.getMessage());
        }
    
    }

}