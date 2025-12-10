
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedMap{

    public static void main(String[] args) {
        Map<String, Double> Carreras = new LinkedHashMap<>();
        Carreras.put("Perez", 17.0005);
        Carreras.put("Lopez",17.0007);
        Carreras.put("Hernandez",17.0010);
        Carreras.put("Martinez",17.0001);

        for (Map.Entry<String, Double> entrada : Carreras.entrySet()) {
            System.out.println(entrada.getKey()+","+entrada.getValue());
        }

    }

}