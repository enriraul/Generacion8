import java.util.ArrayList;

public class Listas{
    // public int[] numeros = {1,2,3,4,5};
    // public static int[] numeros = new int[10];
    public static void main(String[] args) { 
        /*
            ArrayList
            ArrayList<TipoDato> lista = new ArrayList<>();
            TipoDato: 
            int, float, double, booleans, String, Char
            Objeto
        */
        // ArrayList<String> nombres = new ArrayList<>();
        /*
            Agregar elementos add
            Quitar elementos remove
        */
        // nombres.add("Pepe");
        // nombres.add("Juan");
        // nombres.add("Enrique");
        // nombres.set(0, "Sofia");
        // nombres.remove("Juan");
        // String nombre = nombres.get(0);

        ArrayList<Contactos> agenda = new ArrayList<>();
        Contactos contacto1 = new Contactos("Nombre","Apellido","52-777-52-33","Alias1");
        agenda.add(contacto1);


    }
}