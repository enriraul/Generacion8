import java.util.ArrayList;

public class Autor extends Persona{

    private String genero;
    private ArrayList<Libro> publicaciones;
    
    public Autor(String nombre, String apellido, int edad, 
    String curp, String genero){
        super(nombre, apellido, edad, curp);
        this.genero = genero;
        this.publicaciones = new ArrayList<>();
    }

    public void setGenero(String genero){
        this.genero = genero;
    }
    public String getGenero(){
        return this.genero;
    }

    public void setLibro(Libro libro){
        this.publicaciones.add(libro);
    }
    public void RemoveLibro(Libro libro){
        this.publicaciones.remove(libro);
    }

    public void MostrarPublicaciones(){
        for (Libro libro: publicaciones) {
            String mensaje = String.format("""
            ==============================
            ______________________________
            Descripción del libro:
            ______________________________
            Nombre de la obra: %s
            ISBN: %s
            Editorial: %s
            Año: %d
            ==============================
            """, libro.getObra(), libro.getISBN(), 
            libro.getEditorial(), libro.getAño());
            System.out.println(mensaje);
        }
    }
}