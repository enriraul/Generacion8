public class Libro{

    private String Autor, Obra, ISBN, Editorial;
    private int año;

    public Libro(String Autor,String Obra, String ISBN, String Editorial, int año){
        this.Autor= Autor;
        this.Obra = Obra;
        this.ISBN = ISBN;
        this.Editorial = Editorial;
        this.año = año;
    }

    //Métodos Get
    public String getAutor (){
        return this.Autor;
    }
    public String getObra (){
        return this.Obra;
    }
    public String getISBN (){
        return this.ISBN;
    }
    public String getEditorial (){
        return this.Editorial;
    }
    public int getAño(){
        return this.año;
    }
    //Métodos Set

    public void setAutor (String Autor){
        this.Autor= Autor;
    }
    public void setObra (String Obra){
        this.Obra = Obra;
    }
    public void setEditorial (String Editorial){
        this.Editorial = Editorial;
    }
    public void setISBN (String ISBN){
        this.ISBN = ISBN;
    }
    public void setAño(int año){
        this.año = año;
    }

}