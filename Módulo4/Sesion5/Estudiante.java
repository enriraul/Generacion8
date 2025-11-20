public class Estudiante extends Persona{

    private String matricula;
    private String Facultad;
    private int semestre;


    public Estudiante(String nombre, String apellido, int edad, 
    String curp, String matricula, String Facultad, int semestre){

        super(nombre, apellido, edad, curp);
        this.matricula = matricula;
        this.Facultad = Facultad;
        this.semestre = semestre;

    }

    public void info(){
        String informacion = String.format("""
            Información del alumno:

            Nombre: %s
            Apellido: %s
            Edad: %d
            Curp: %s

            Matricula: %s
            Facultad: %s
            Semestre: %d

        """,this.getNombre(), this.apellido, this.getEdad(), 
        this.getCurp(), this.matricula, this.Facultad, this.semestre);
        System.out.println(informacion);
    }
}