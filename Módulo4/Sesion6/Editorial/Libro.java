public class Libro{

    private String Obra, ISBN, Editorial;
    private int año;

    public Libro(String Obra, String ISBN, String Editorial, int año){
        this.Obra = Obra;
        this.ISBN = ISBN;
        this.Editorial = Editorial;
        this.año = año;
    }

    //Métodos Get

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