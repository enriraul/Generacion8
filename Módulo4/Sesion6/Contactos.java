public class Contactos{
    
    private String nombre;
    private String apellido;
    private String numero;
    private String alias;

    public Contactos(String nombre, String apellido, String numero, String alias){
        this.nombre= nombre;
        this.apellido = apellido ;
        this.numero = numero;
        this.alias = alias;
    }

    /*Métodos Get-Set*/
    public String getNombre(){
        return this.nombre;
    }
    public String getApellido(){
        return this.apellido;
    }
    public String getNumero(){
        return this.numero;
    }
    public String getAlias(){
        return this.alias;
    }

    public void setNombre(String nombre){
        this.nombre= nombre;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    public void setNumero(String numero){
        this.numero = numero;
    }
    public void setAlias(String alias){
        this.alias = alias;
    }

    public void info(){
        String mensaje = String.format("""
        ====================
        Contacto:
        ====================
        Nombre: %s %s
        Alias: %s
        Numero: %s
        ====================
        """, this.nombre, this.apellido, this.numero, this.alias);
        System.out.println(mensaje);
    }
}
