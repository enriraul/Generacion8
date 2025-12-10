import java.util.HashMap;
import java.util.Map;

public class MetodosHM{

    public static void main(String[] args) {
         Map <String, Integer> m = new HashMap<>();

        m.put("s1",1);
        m.put("s2",2);
        m.put("s3",3);
        m.put("s4",4);
        m.put("s5",5);
        m.put("s6",6);

        //Devuelve el valor
        System.out.println(m.get("s4"));

        //Verificar si existe una clave
        System.out.println(m.containsKey("s6"));
        System.out.println(m.containsKey("s7"));

        //Verifica si existe un valor
        System.out.println(m.containsValue(5));
        System.out.println(m.containsValue(123));

        System.out.println("¿Existe un s4?"+m.containsKey("s4"));
        //Elimina el elemento basado en su etiqueta
        m.remove("s4");
        System.out.println("¿Existe un s4?"+m.containsKey("s4"));

        //Regresa el tamaño del maps
        System.out.println(m.size());

        //devuelve el conjunto de valores
        System.out.println(m.values());


        System.out.println(m.keySet());


        System.out.println(m.entrySet());

        m.putIfAbsent("s7", 34);
        m.putIfAbsent("s1", 34);
        System.out.println(m.entrySet());

        m.replace("s1", 32);
        System.out.println(m.entrySet());

        m.clear();
    }

}