
import java.util.ArrayList;

public class Venta{
    private Clientes cliente;
    private ArrayList<Carrito> carrito;


    public Venta(Clientes cliente){
        this.cliente = cliente;
        carrito = new ArrayList<>();
    }

    public void AgregarCarrito(Producto producto, int cantidad){
        Carrito nuevo_producto = new Carrito(producto, cantidad);
        carrito.add(nuevo_producto);
    }
    public void QuitarCarrito(int IndexProducto){
        /*
        Para futuras clases:
        Carrito productoEliminado = carrito.get(IndexProducto);
        productoEliminado.informacion();
        */
        carrito.remove(IndexProducto);
    }
    public float completarCompra(){
        float Total = 0;
        for (Carrito carrito_i : carrito) {
            float sub_total = carrito_i.getCantidad()*carrito_i.getProducto().getPrecio();
            Total += sub_total;
            System.out.printf("Producto: %s Cantidad: %d\tSubtotal: %f", carrito_i.getProducto().getNombre(), carrito_i.getCantidad(),sub_total);
        }
        return Total;
    }
}