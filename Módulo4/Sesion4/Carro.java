public class Carro{

    private String modelo;
    private String marca;
    private int año;
    private String color;

    public Carro(String modelo, String marca, int año, String color){
        this.modelo = modelo;
        this.marca = marca;
        this.año = año;
        this.color = color;
    }

    public void Info(){
        /*String block */
        String mensaje = String.format("""
        La información del vehiculo es la siguiente:
        Modelo: %s
        Marca: %s
        Año: %d
        Color: %s
        """,this.modelo, this.marca, this.año, this.color);

        System.out.println(mensaje);
    }

    //Métodos Getter -Setter (publicos)
    public String getModelo(){
        return this.modelo;
    }

    public int getAño(){
        return this.año;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }



}