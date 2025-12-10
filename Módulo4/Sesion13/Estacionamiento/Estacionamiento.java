
import java.util.ArrayList;

public class Estacionamiento{

    private ArrayList<Vehiculo> estacionamiento;

    public Estacionamiento(){
        estacionamiento = new ArrayList<>();
    }

    public void EstacionarVehiculo(Vehiculo vehiculo){
        this.estacionamiento.add(vehiculo);
    }

    public void MostrarVehiculo(){
        for (int i = 0; i < estacionamiento.size(); i++) {
            Vehiculo vehiculo_i = estacionamiento.get(i);
            vehiculo_i.mostrarInformacion();
        }
    }
}