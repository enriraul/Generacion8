import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Agenda{
    public static void main(String[] args) {
        Map<String, Contacto> agenda = new TreeMap<>();
        Scanner sc = new Scanner(System.in);
        int seleccion;
        String mensaje = """
        1.- Registrar un contacto
        2.- Mostrar contactos
        3.- Modificar un contacto
        4.- Eliminar un contacto
        5.- Salir
        """;

        do{
            System.out.println(mensaje);
            seleccion = sc.nextInt();

            switch (seleccion) {
                case 1:
                    String nombre;
                    String correo;
                    String numero;
                    Contacto contacto = new Contacto(nombre, correo, numero);
                    String alias;
                    agenda.put(alias, contacto);
                    break;
                case 2:
                    if (agenda.size()>0) {
                        for (Map.Entry<String, Contacto> entrada : agenda.entrySet()) {
                            String alias_i = entrada.getKey();
                            Contacto contacto_i = entrada.getValue();
                            contacto_i.mostrarInfo();
                        }
                    }
                    else{
                        System.out.println("Actualmente la agenda se encuentra vacia");
                    }
                    break;
                
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                
                case 5:
                    System.out.println("Muchas gracias, vuelva pronto!");
                    break;
                default:
                    System.out.println("Opción no válida");
            }


        }while(seleccion!=5);
    }
}