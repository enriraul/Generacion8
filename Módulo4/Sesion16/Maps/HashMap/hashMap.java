

/*

HashMap <k,v>
k = String, Int
k != null

*/

import java.util.HashMap;
import java.util.Map;

public class hashMap{

    public static void main(String[] args) {
        //Sintaxis: Map<tipo k, tipo v> nombreHM = new HashMap<>();

        Map<String, Double> Calificaciones = new HashMap<>();

        Calificaciones.put("Enrique",78.0);
        Calificaciones.put("Omar",64.5);
        Calificaciones.put("Sofia",99.5);
        Calificaciones.put("Ana",50.0);

        for (Map.Entry<String, Double> entrada : Calificaciones.entrySet()) {
            System.out.println(entrada.getKey()+","+entrada.getValue());
        }

    }

}