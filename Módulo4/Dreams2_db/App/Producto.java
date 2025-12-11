public class Producto{

    private String nombre;
    private float precio;
    private String categoria;
    private int stock;

    public Producto(String nombre, float precio, String categoria, int stock){
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
        this.stock = stock;

    }

    public String getNombre(){
        return this.nombre;
    }

    public float getPrecio(){
        return this.precio;
    }
    public String getCategoria(){
        return this.categoria;
    }

    public int getStock(){
        return this.stock;
    }

    public void setNombre(String nombre){
        this.nombre= nombre;
    }
    public void setPrecio(float precio){
        this.precio = precio;
    }
    public void setCategoria(String categoria){
        this.categoria = categoria;
    }
    public void setStock(int stock){
        this.stock = stock;
    }


}