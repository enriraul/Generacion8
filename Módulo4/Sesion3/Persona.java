public class Persona{

    public String nombre;
    public String apellido;
    public int edad;
    public String nacionalidad;

    public Persona(String nombre, String apellido, int edad, String nacionalidad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
    }

    public void Presentar(){
        System.out.println("Hola, me llamo "+this.nombre+" "+this.apellido);
        System.out.println("tengo "+Integer.toString(this.edad)+
        " años y soy " + " "+this.nacionalidad);
    }

    /*
    
        Entidad Vehiculo: 
        TipoVehiculo: motocicleta/bicicleta/auto/camioneta
        Matricula
        Color
        NRuedas
        nombre
        apellido

        Métodos
        -Constructor (especial)
        -Informacion del vehiculo
        -Datos del propietario, acompañados de la matricula y tipoVehiculo
    
    */
}