
import java.util.Scanner;


public class Main{
    public static void main(String[] args) {
        Estacionamiento estacionamiento = new Estacionamiento();
        ArchivosVehiculos archivoVehiculo = new ArchivosVehiculos();
        Scanner sc = new Scanner(System.in);
        String mensaje = 
        """
        1.- Cargar información desde Archivo
        2.- Mostrar los automóviles estacionados
        3.- Ingresar un vehiculo al estacionamiento
        4.- Salir del menú
        Indique el número de la acción a realizar: 
        """;
        int seleccion = sc.nextInt();
        do { 
            
            switch (seleccion) {
                case 1:
                    System.out.println("Indique el nombre del archivo a cargar: ");
                    String archivo = sc.nextLine();
                    archivoVehiculo.EstacionarCarros(archivo, estacionamiento);
                    break;
                case 2:
                    estacionamiento.MostrarVehiculo();
                    break;
                case 3:
                    
                    break;
                case 4:
                    System.out.println("Muchas gracias vuelva pronto");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (seleccion!=4);
    }

}