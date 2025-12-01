import java.util.ArrayList;

public class Biblioteca{

    private ArrayList<LibroExistencia> catalogo;

    public Biblioteca(){
        catalogo = new ArrayList<>();
    }

    public void agregarLibro(Libro libro, int existencia){
    
        LibroExistencia le = new LibroExistencia(libro, existencia);
        this.catalogo.add(le);

    }

    public int buscarLibro(String ISBN){
        /*
            -1 : No se encontró el libro
            -2 : No hay elementos en el catalogo
            c(0, n): indice el archivo coc
        */
        int index_libro = -1;

        if(this.catalogo.isEmpty()){
            index_libro = -2;
        }
        else{
            for (int i = 0; i < this.catalogo.size(); i++) {
                LibroExistencia le_i = this.catalogo.get(i);
                Libro libro_i = le_i.getLibro();
                String ISBN_i = libro_i.getISBN();
                if(ISBN_i.equalsIgnoreCase(ISBN)){
                    index_libro = i;
                    break;
                }
            }
        }

        return index_libro;
    }

    public void mostrarInformacion(String ISBN){
        int index_libro = buscarLibro(ISBN);

        if (index_libro == -1) {
            System.out.println("No se encontró ningún libro que coincida con el ISBN proporcionado");
        }
        else if (index_libro==-2) {
            System.out.println("Actualmente no existe ningún libro dentro del catalogo");
        }
        else{
            LibroExistencia le = this.catalogo.get(index_libro);
            le.MostrarInformacion();
        }
    }

    public void mostrarCatalogo(){
        for (int i = 0; i < this.catalogo.size(); i++) {
            LibroExistencia le_i = this.catalogo.get(i);
            le_i.MostrarInformacion();
        }
    }
    public void removerLibro(String ISBN){
        int index_libro = buscarLibro(ISBN);

        if (index_libro == -1) {
            System.out.println("No se encontró ningún libro que coincida con el ISBN proporcionado");
        }
        else if (index_libro==-2) {
            System.out.println("Actualmente no existe ningún libro dentro del catalogo");
        }
        else{
            LibroExistencia le = this.catalogo.get(index_libro);
            System.out.println("El siguiente libro ha sido eliminado.");
            le.MostrarInformacion();
            this.catalogo.remove(index_libro);

        }
    }
}