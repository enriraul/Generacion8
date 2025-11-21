/*
    - Clases abstractas nos sirven como moldes para 
    proceder a la particularazión de cada uno de los hijos.

    - Estamos obligados a realizar el mecanismo de herencia

    - Nos permite definir un conjunto de métodos que si bien
    el padre no tiene predefinida su útilidad, estos métodos
    tendrán sentido en las clases hijos.
    
*/

public abstract class Abstractas{
    private String mensaje;
    
    public Abstractas(String mensaje){
        this.mensaje= mensaje;
    }

    public String getMensaje(){
        return this.mensaje;
    }
    public void setMensaje(String mensaje){
        this.mensaje = mensaje;
    }

    public abstract void MostrarMensaje();

}