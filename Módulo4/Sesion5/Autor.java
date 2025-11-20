public class Autor extends Persona{

    private String genero;
    private Libro [] publicaciones;
    
    public Autor(String nombre, String apellido, int edad, 
    String curp, String genero){
        super(nombre, apellido, edad, curp);
        this.genero = genero;
    }


}