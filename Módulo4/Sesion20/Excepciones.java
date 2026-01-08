import java.util.Scanner;

public class Excepciones{
    /*
    static void funcion1(){
        funcion2();
    }
    static void funcion2(){
        int x = 5/0;
    }
    */
    public static void main(String[] args) {
        /*
        -Error aritmético
        System.out.println("Inicio del programa");
        int proceso = 10/0;
        System.out.println("finalización del programa");
        */

       /*
       -ArrayIndexOutofBound
       int [] numeros = {1,2,3};
       System.out.println(numeros[5]); 
       */

      /* 
      -NullPointer
      String nombre = null;
      System.out.println(nombre.length());
      */

        /*
            funcion1();
        */
       /*
        try{
            int x = 5/0;    
            System.err.println("Este mensaje no será mostrado");
        }
        catch(ArithmeticException e){
            System.out.println("mensaje de catch"+e.getMessage());
        }
        System.err.println("¿Qué pasa con este mensaje?");
        */
       try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Ingresa un número");
            int primerNumero = sc.nextInt();
            System.out.println("Ingresa un segundo número");
            int segundoNumero = sc.nextInt();

            double resultado = primerNumero / segundoNumero;

            System.out.println("El resultado es: "+resultado);
        } 
        catch(ArithmeticException e){
            System.out.println("Error aritmético: "+e.getMessage());
        }
        catch (Exception e) {
            System.out.println("Error de tipo de datos" );
        }
        finally{
            System.out.println("Finalización del código");
        }
    }

    /*
        Solicitar dos números al usuario enteros
        Imprimir la división de esos dos números

        Capturar los posibles errores que ocasione 
        la inserción de los datos, comprobando que sea posible
        la divisón del elemento y que el tipo de dato sea acorde a 
        lo solicitado

        Imprimir la finalización del código    
    */
    
}