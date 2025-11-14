public class Main{
    public static void main(String[] args) {
        /* 
        Encapsulamiento:
        + Public - nivel acceso permite que cualquiera que haya hecha
        una instancia tenga acceso al elemento.

        - Private - nivel de acceso se encuentra restringido a cualquier elemento
        que haya hecho la instancia a la clase, pero que cualquier elemento }
        dentro de la clase puede acceder a este elemento

        # Protected - herencia 
        */

        Carro carro = new Carro("Aveo","Chevrolet",2020,"Azul");
        carro.Info();
        carro.setModelo("Onyx");
        carro.Info();


        /* 
        Clase Libro:
        Autor
        Obra
        Año
        ISBN
        Editorial
        Constructor()
        Métodos Setter-Getter
        Método info()

        
        */
    }
}