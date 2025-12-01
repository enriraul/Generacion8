import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class LecturaTxt{
    public static void main(String[] args) {
        String ruta = "Data.txt";
        try {
            List<String> lineas = Files.readAllLines(Paths.get(ruta));
            for (String linea : lineas) {
                System.out.println(linea);
            }

        } catch (IOException e) {
            System.out.println("Se genero el siguiente error: "+ e.getMessage());
        }


    }
}