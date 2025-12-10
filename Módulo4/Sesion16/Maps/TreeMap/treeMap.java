import java.util.Map;
import java.util.TreeMap;

public class treeMap{
    public static void main(String[] args) {
        Map <String, Integer> inventario = new TreeMap<>();

        inventario.put("elemento_1",20);
        inventario.put("elemento_2",20);
        inventario.put("aelemento_3",20);
        inventario.put("elemento_4",20);
        inventario.put("elemento_5",20);
        inventario.put("Aelemento_6",20);
        for (Map.Entry<String, Integer> entrada : inventario.entrySet()) {
            System.out.println(entrada.getKey()+","+entrada.getValue());
        }

    }
}