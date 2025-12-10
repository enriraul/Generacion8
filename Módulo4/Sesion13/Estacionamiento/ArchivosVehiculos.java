
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ArchivosVehiculos{

    public static void EstacionarCarros(String archivos, Estacionamiento estacionamiento){
        String infoVehiculo;

        try (BufferedReader br = new BufferedReader(new FileReader(archivos))){
            while ((infoVehiculo = br.readLine())!=null ) {
                String [] parametros = infoVehiculo.split(", ");
                // for (int i = 0; i <parametros.length; i++) {
                //     System.out.println(parametros[i]); 
                // }
                String matricula = parametros[0];
                String marca = parametros[1];
                String modelo = parametros[2];
                int año = Integer.parseInt(parametros[3]);
                if(parametros[5].equals("Motocicleta")){
                    int cilindrada = Integer.parseInt(parametros[4].replace(" cc",""));
                    Motocicleta motocicleta_i = new Motocicleta(matricula, marca, modelo, año, cilindrada);
                    estacionamiento.EstacionarVehiculo(motocicleta_i);
                }
                else{
                    int nPuertas = Integer.parseInt(parametros[4].replace(" puertas",""));
                    Auto auto_i = new Auto(matricula, marca, modelo, año, nPuertas);
                    estacionamiento.EstacionarVehiculo(auto_i);
                }
            }
        } catch (IOException e) {
        }
    }
}