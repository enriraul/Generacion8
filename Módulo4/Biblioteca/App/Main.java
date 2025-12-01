import java.util.Scanner;
public class Main{

    public static Autor VerificarAutor(String Nombre,String Apellido,String Nacionalidad){
        if(Nombre.length()==0){
            Nombre = "Anonimo";
        }
        if(Apellido.length()==0){
            Apellido = "-";
        }
        if (Nacionalidad.length()==0) {
            Nacionalidad = "desconocida";
        }
        return new Autor(Nombre, Apellido, Nacionalidad);
    }
    /*
        Autor es arraylist
        nPaginas
        añopublicacion
    */

    public static Libro VerificarLibro(Biblioteca biblioteca, String ISBN, String Titulo,Autor autor, String Editorial){
        int index = biblioteca.buscarLibro(ISBN);
        if((index==-1 || index==-2) &&( Titulo.length()>0 )){
            return new Libro(ISBN, Titulo, autor, Editorial);
        }
        else{
            if (index>=0) {
                System.out.println("El ISBN proporcionado ya existe en el sistema");
            }
            if (Titulo.length()==0) {
                System.out.println("Es necesario indicar el titulo del libro");
            }
            return null;
        }
    }
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner sc = new Scanner(System.in);
        int seleccion;
        String mensaje = """
        Selecciona alguna de las siguientes elecciones:
        1. Agregar Libro
        2. Cargar información desde un archivo
        3. Mostrar información de un libro
        4. Desglorzar el catalogo completo
        5. Eliminar libro del registro
        6. Cerrar aplicación
        """;
        do { 
           System.out.println(mensaje);
           seleccion = sc.nextInt();
           switch (seleccion) {
               case 1:
                    sc.nextLine();
                    System.out.println("Completa la siguiente información de manera correcta");
                    System.out.println("Ingrese el ISBN del libro: ");
                    String ISBN = sc.nextLine();
                    System.out.println("Ingrese el nombre de la obra: ");
                    String Titulo = sc.nextLine();
                    System.out.println("Ingrese la editorial del libro: ");
                    String Editorial = sc.nextLine();
                    System.out.println("Ingrese el nombre del autor: ");
                    String Nombre = sc.nextLine();
                    System.out.println("Ingrese el apellido del autor: ");
                    String Apellido = sc.nextLine();
                    System.out.println("Ingrese la nacionalidad del autor: ");
                    String Nacionalidad = sc.nextLine();
                    System.out.println("¿Con cuántas existencias cuenta este libro?: ");
                    int existencias = sc.nextInt();
                    Autor autor = VerificarAutor(Nombre, Apellido, Nacionalidad);
                    Libro libro = VerificarLibro(biblioteca, ISBN, Titulo, autor, Editorial);
                    if(libro==null){
                        System.out.println("Intente ingresar la información de nuevo.");
                        break;
                    }
                    if(existencias >0){
                        LibroExistencia libroExistencia = new LibroExistencia(libro, existencias);
                    }
                    else{
                        System.out.println("La información respecto a la existencia no es válida,intente de nuevo");
                    }
                    break;
                case 2:
                   System.out.println("Por el momento no contamos con este servicio");
                   break;
                case 3:
                   
                   break;
                case 4:
                   
                   break;
                case 5:
                   
                   break;
                case 6:
                   System.out.println("Muchas gracias, hasta pronto");
                   break;
                default:
                   System.out.println("La opción seleccionada no es válida");
            }

        }while (seleccion!=6);
    }

}