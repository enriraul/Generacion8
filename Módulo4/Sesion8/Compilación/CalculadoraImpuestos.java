public class CalculadoraImpuestos{

    public double CalcularImpuestos(double ingreso){
        return ingreso*0.16;    
    }
    
    public double CalcularImpuestos(double ingreso, String pais){
        if (pais.equalsIgnoreCase("México")) {
            return ingreso*0.16;
        }
        else if (pais.equalsIgnoreCase("USA")) {
            return ingreso*0.1;
        }
        else{
            return ingreso;
        }
    }
    
}