public class Clientes{

    private String nombre;
    private String correo;

    public Clientes(String nombre, String correo){
        this.nombre = nombre;
        this.correo = correo;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setCorreo(String correo){
        this.correo = correo;
    }
    public String getNombre(){
        return this.nombre;
    }
    public String getCorreo(){
        return this.correo;
    }

}