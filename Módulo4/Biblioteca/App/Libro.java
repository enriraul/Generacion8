public class Libro{
    private String ISBN;
    private String Titulo;
    private Autor autor;
    private String Editorial;


    public Libro(String ISBN, String Titulo, Autor autor, String Editorial){
        this.ISBN = ISBN;
        this.Titulo  = Titulo;
        this.autor = autor;
        this.Editorial = Editorial;
    }



    public String getISBN(){
        return this.ISBN;
    }
    public String getTitulo(){
        return this.Titulo;
    }
    public Autor getAutor(){
        return this.autor;
    }
    public String getEditorial(){
        return this.Editorial;
    }


    public void setISBM(String ISBN){
        this.ISBN = ISBN;
    }

    public void setTitulo(String Titulo){
        this.Titulo = Titulo;
    }

    public void setAutor (Autor autor){
        this.autor = autor;
    }
    public void setEditorial(String Editorial){
        this.Editorial = Editorial;
    }

    public void mostrarInformacion(){

        
        String infoLibro = """
        Información del libro:
        ISBN: %s
        Título: %s
        Autor: %s
        Editorial: %s
        """.formatted(this.ISBN, this.Titulo, this.autor.getNombre(), this.Editorial);
    

        System.out.println(infoLibro);
    }
}