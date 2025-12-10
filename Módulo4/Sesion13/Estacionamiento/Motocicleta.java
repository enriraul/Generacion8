public class Motocicleta extends Vehiculo{
    
    private int cilindrada;

    public Motocicleta(String matricula,String marca, String modelo, int año, int cilindrada){
        super(matricula, marca, modelo, año);
        this.cilindrada = cilindrada;
    }

    @Override
    public void mostrarInformacion(){

        super.mostrarInformacion(); //A la clase padre, ejecuta el método mostrarInformación
        System.out.println("Tipo manillar de la motocicleta: "+this.cilindrada);

    }

}