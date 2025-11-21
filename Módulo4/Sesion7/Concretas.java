/*
    Clases: Concretas
    Características principales:
        - Todos sus métodos se encuentran definidos, es decir,
        no existen métodos abstractos
        - No existen métodos abstractos
    
    Utilidad: 
        Descripción de una entidad. 

*/

public class Concretas{

    private String mensaje;
    
    public Concretas(String mensaje){
        this.mensaje= mensaje;
    }

    public String getMensaje(){
        return this.mensaje;
    }
    public void setMensaje(String mensaje){
        this.mensaje = mensaje;
    }


}