public class Persona{
    
    private String nombre;
    protected String apellido;
    private int edad;
    private String curp;

    public Persona(String nombre, String apellido, int edad, String curp){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.curp = curp;
    }

    /*
        Métodos get y set
    */

    public String getNombre(){
        return this.nombre;
    }
    public String getApellido(){
        return this.apellido;
    }
    public int getEdad(){
        return this.edad;
    }
    public String getCurp(){
        return this.curp;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public void setCurp(String curp){
        this.curp = curp;
    }

}