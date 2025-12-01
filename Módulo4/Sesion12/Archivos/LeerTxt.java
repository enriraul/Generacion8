import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeerTxt{

    public static void main(String[] args) {
        String ruta ="Data.txt";
        try(BufferedReader bf = new BufferedReader(new FileReader(ruta))){
            String lineas;
            while ((lineas = bf.readLine()) != null) { 
                String [] elementos = lineas.split(",");
                for (String palabra : elementos) {
                    System.out.println(palabra);
                }
            }
        }catch(IOException e){
            System.out.println("Error en la lectura del archivo: "+e.getMessage());
        }


    }
}